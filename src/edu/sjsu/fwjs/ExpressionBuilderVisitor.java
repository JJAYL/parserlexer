package edu.sjsu.fwjs;

import java.util.ArrayList;
import java.util.List;

import edu.sjsu.fwjs.parser.FeatherweightJavaScriptBaseVisitor;
import edu.sjsu.fwjs.parser.FeatherweightJavaScriptParser;

public class ExpressionBuilderVisitor extends FeatherweightJavaScriptBaseVisitor<Expression>{
    @Override
    public Expression visitProg(FeatherweightJavaScriptParser.ProgContext ctx) {
        List<Expression> stmts = new ArrayList<Expression>();
        for (int i=0; i<ctx.stat().size(); i++) {
            Expression exp = visit(ctx.stat(i));
            if (exp != null) stmts.add(exp);
        }
        return listToSeqExp(stmts);
    }

    @Override
    public Expression visitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Expression visitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression thn = visit(ctx.block(0));
        Expression els = visit(ctx.block(1));
        return new IfExpr(cond, thn, els);
    }

    @Override
    public Expression visitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression thn = visit(ctx.block());
        return new IfExpr(cond, thn, null);
    }

    @Override
    public Expression visitWhile(FeatherweightJavaScriptParser.WhileContext ctx)
    {
            Expression cond = visit(ctx.expr());
            Expression body = visit(ctx.block());
            return new WhileExpr(cond, body);
    }

    @Override
    public Expression visitPrintExpr(FeatherweightJavaScriptParser.PrintExprContext ctx)
    {
        Expression exp = visit(ctx.expr());
        return new PrintExpr(exp);
    }
    
    @Override
    public Expression visitBlank(FeatherweightJavaScriptParser.BlankContext ctx)
    {
        return null;
    }

    @Override
    public Expression visitAssign(FeatherweightJavaScriptParser.AssignContext ctx)
    {
        Expression exp = visit(ctx.expr());
        String varname = ctx.ID().getText(); //TODO what does ctx. need to be string
        return new AssignExpr(varname, exp);
    } 
 
    @Override 
    public Expression visitFunctionappl(FeatherweightJavaScriptParser.FunctionapplContext ctx)
    {
        Expression f = visit(ctx.expr());
        List<Expression> argus = new ArrayList<Expression>();
        
        for(int i = 1; i < ctx.getChildCount()-1; i++)
        {
            Expression exp = visit(ctx.getChild(i));
            argus.add(exp);
        }
 
        return listToSeqExp(argus);
    }
  
    

    @Override
    public Expression visitInt(FeatherweightJavaScriptParser.IntContext ctx) {
        int val = Integer.valueOf(ctx.INT().getText());
        return new ValueExpr(new IntVal(val));
    }
    @Override
    public Expression visitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx)
    {
        Expression lhs = visit(ctx.expr(0));
        Expression rhs = visit(ctx.expr(1));
        //Expression op 
        return BinOpHelper(ctx.op.getType(), lhs, rhs);
    }
    
    @Override
    public Expression visitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx)
    {
            Expression lhs = visit(ctx.expr(0));
            Expression rhs = visit(ctx.expr(1));
            return BinOpHelper(ctx.op.getType(), lhs, rhs);
    }

    public Expression BinOpHelper(int ctxOp, Expression lhs, Expression rhs)
    {
        Op op;
        switch(ctxOp) {
                case FeatherweightJavaScriptParser.ADD:
                        op = Op.ADD;
                        break;
                case FeatherweightJavaScriptParser.SUB:
                        op = Op.SUBTRACT;
                        break;
                case FeatherweightJavaScriptParser.MUL:
                        op = Op.MULTIPLY;
                        break;
                case FeatherweightJavaScriptParser.DIV:
                        op = Op.DIVIDE;
                        break;
                case FeatherweightJavaScriptParser.MOD:
                        op = Op.MOD;
                        break;
                case FeatherweightJavaScriptParser.LT:
                        op = Op.LT;
                        break;
                case FeatherweightJavaScriptParser.LE:
                        op = Op.LE;
                        break;
                case FeatherweightJavaScriptParser.GT:
                        op = Op.GT;
                        break;
                case FeatherweightJavaScriptParser.GE:
                        op = Op.GE;
                        break;
                case FeatherweightJavaScriptParser.EQ:
                        op = Op.EQ;
                        break;
                default: op= null;
                         break;
        }
        return new BinOpExpr(op, lhs, rhs);

    }
    

    @Override
    public Expression visitParens(FeatherweightJavaScriptParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

@Override
     public Expression visitVariabledecl (FeatherweightJavaScriptParser.VariabledeclContext ctx) {
    Expression expr = visit(ctx.expr());
    String varname = ctx.ID().getText();
    return new VarDeclExpr(varname, expr);
}

@Override 
public Expression visitBool(FeatherweightJavaScriptParser.BoolContext ctx){
 boolean val = Boolean.valueOf(ctx.BOOL().getText());
        return new ValueExpr(new BoolVal(val));
}
 
   
@Override public Expression visitFunctiondecl(FeatherweightJavaScriptParser.FunctiondeclContext ctx) {
    //FUNCTION parameters block
    
    //String varname = visit(ctx.stat());
    List<String> parameters = new ArrayList<String>();
    for(int i = 1; i < ctx.getChildCount()-1; i++)
    {
            //Expression exp = visit(ctx.getChild(i));
            //parameters.add(exp);
            //TODO
    }
    Expression body = visit(ctx.block());
    return new FunctionDeclExpr(parameters, body);
}

    @Override 
    public Expression visitVarref(FeatherweightJavaScriptParser.VarrefContext ctx)   
    {
        String varname = ctx.ID().getText();
        return new VarExpr(varname);
        
    }

//    @Override
//    public Expression visitNull(FeatherweightJavaScriptParser.NullContext ctx)
//    {
        //return new VarExpr();
//    }

    @Override
    public Expression visitComparison(FeatherweightJavaScriptParser.ComparisonContext ctx)
    {
        Expression lhs = visit(ctx.expr(0));
        Expression rhs = visit(ctx.expr(1));
        return BinOpHelper(ctx.op.getType(), lhs, rhs);
    }

    @Override
    public Expression visitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx) {
        List<Expression> stmts = new ArrayList<Expression>();
        for (int i=1; i<ctx.getChildCount()-1; i++) {
            Expression exp = visit(ctx.getChild(i));
            stmts.add(exp);
        }
        return listToSeqExp(stmts);
    }

    /**
     * Converts a list of expressions to one sequence expression,
     * if the list contained more than one expression.
     */
    private Expression listToSeqExp(List<Expression> stmts) {
        if (stmts.isEmpty()) return null;
        Expression exp = stmts.get(0);
        for (int i=1; i<stmts.size(); i++) {
            exp = new SeqExpr(exp, stmts.get(i));
        }
        return exp;
    }

    @Override
    public Expression visitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx) {
        return visit(ctx.stat());
    }

    @Override
    public Expression visitParam(FeatherweightJavaScriptParser.ParamContext ctx)
    {
        List<Expression> argus = new ArrayList<Expression>();
        for(int i = 1; i < ctx.getChildCount()-1; i++)
        {
            Expression exp = visit(ctx.getChild(i));
            argus.add(exp);
        }
        return listToSeqExp(argus);


    }

    @Override
    public Expression visitNoparam(FeatherweightJavaScriptParser.NoparamContext ctx)
    {
        return null; //dunno what the interpretter is supposed to here
    }

    @Override
    public Expression visitNoargs(FeatherweightJavaScriptParser.NoargsContext ctx)
    {
        return null;//function declerations?
    }

}
