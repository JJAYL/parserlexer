package edu.sjsu.fwjs;

import java.util.ArrayList;
import java.util.List;



/**
 * FWJS expressions.
 */
public interface Expression {
    /**
     * Evaluate the expression in the context of the specified environment.
     */
    public Value evaluate(Environment env);
}

// NOTE: Using package access so that all implementations of Expression
// can be included in the same file.

/**
 * FWJS constants.
 */
class ValueExpr implements Expression {
    private Value val;
    public ValueExpr(Value v) {
        this.val = v;
    }
    public Value evaluate(Environment env) {
        return this.val;
    }
}

/**
 * Expressions that are a FWJS variable.
 */
class VarExpr implements Expression {
    private String varName;
    public VarExpr(String varName) {
        this.varName = varName;
    }
    public Value evaluate(Environment env) {
        return env.resolveVar(varName);
    }
}

/**
 * A print expression.
 */
class PrintExpr implements Expression {
    private Expression exp;
    public PrintExpr(Expression exp) {
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        Value v = exp.evaluate(env);
        System.out.println(v.toString());
        return v;
    }
}
/**
 * Binary operators (+, -, *, etc).
 * Currently only numbers are supported.
 */
class BinOpExpr implements Expression {
    private Op op;
    private Expression e1;
    private Expression e2;
    public BinOpExpr(Op op, Expression e1, Expression e2) {
        this.op = op;
        this.e1 = e1;
        this.e2 = e2;
    }

    @SuppressWarnings("incomplete-switch")
    public Value evaluate(Environment env) 
    {
        Value x = e1.evaluate(env);
        Value y = e2.evaluate(env);
        int num1;
        int num2;
        num1 = ((IntVal) x).toInt();
        num2 = ((IntVal) y).toInt();
        switch(op)
        {
        case ADD:
        	return new IntVal(num1 + num2);
        case SUBTRACT:
        	return new IntVal(num1 - num2);
        case MULTIPLY:
        	return new IntVal(num1 * num2);
        case DIVIDE:
        	return new IntVal(num1 / num2);
        case MOD:
        	return new IntVal(num1 % num2);
        case GT:
        	return new BoolVal(num1 > num2);
        case GE:
        	return new BoolVal(num1 >= num2);
        case LT:
        	return new BoolVal(num1 <= num2);
        case EQ:
        	return new BoolVal(num1 == num2);
        }
        return null;
    }
}

/**
 * If-then-else expressions.
 * Unlike JS, if expressions return a value.
 */
class IfExpr implements Expression {
    private Expression cond;
    private Expression thn;
    private Expression els;
    public IfExpr(Expression cond, Expression thn, Expression els) {
        this.cond = cond;
        this.thn = thn;
        this.els = els;
    }
    public Value evaluate(Environment env) 
    {
    	BoolVal b1 = (BoolVal) this.cond.evaluate(env);
        if(b1.toBoolean()) 
        	return this.thn.evaluate(env);
	    else return this.els.evaluate(env);
        //return null;
    }
}

/**
 * While statements (treated as expressions in FWJS, unlike JS).
 */
class WhileExpr implements Expression {
    private Expression cond;
    private Expression body;
    public WhileExpr(Expression cond, Expression body) {
        this.cond = cond;
        this.body = body;
    }
    public Value evaluate(Environment env) 
    {
    	BoolVal b1 = (BoolVal) cond.evaluate(env);
        if(b1.toBoolean())
        {
        	body.evaluate(env);
        	return this.evaluate(env); // needs new environment and evalute itself
        }
        return null;
    }
}

/**
 * Sequence expressions (i.e. 2 back-to-back expressions).
 */
class SeqExpr implements Expression {
    private Expression e1;
    private Expression e2;
    public SeqExpr(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    public Value evaluate(Environment env) 
    {
    	e1.evaluate(env);
    	return e2.evaluate(env);
        // YOUR CODE HERE
    }
}

/**
 * Declaring a variable in the local scope.
 */
class VarDeclExpr implements Expression {
    private String varName;
    private Expression exp;
    public VarDeclExpr(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }
    public Value evaluate(Environment env) 
    {
    	Value v1 = this.exp.evaluate(env);
    	env.createVar(varName, v1);
        // YOUR CODE HERE
        return v1;
    }
}

/**
 * Updating an existing variable.
 * If the variable is not set already, it is added
 * to the global scope.
 */
class AssignExpr implements Expression {
    private String varName;
    private Expression e;
    public AssignExpr(String varName, Expression e) {
        this.varName = varName;
        this.e = e;
    }
    public Value evaluate(Environment env) {
    	Value v1 = e.evaluate(env);
    	env.updateVar(varName, v1);
        // YOUR CODE HERE
        return v1;
    }
}

/**
 * A function declaration, which evaluates to a closure.
 */
class FunctionDeclExpr implements Expression {
    private List<String> params;
    private Expression body;
    public FunctionDeclExpr(List<String> params, Expression body) {
        this.params = params;
        this.body = body;
    }
    public Value evaluate(Environment env) 
    {
    	ClosureVal c1 = new ClosureVal(params, body, env);
    	return c1;
        
    }
}

/**
 * Function application.
 */
class FunctionAppExpr implements Expression {
    private Expression f;
    private List<Expression> args;
    public FunctionAppExpr(Expression f, List<Expression> args) {
        this.f = f;
        this.args = args;
    }
    public Value evaluate(Environment env) 
    {
    	ClosureVal c1 = (ClosureVal)(f.evaluate(env));
    	List<Value> v1 = new ArrayList<Value>();
    	for(int i = 0; i < args.size(); i++)
    	{
    		v1.add(args.get(i).evaluate(env));
    	}
    	
        // YOUR CODE HERE
        return c1.apply(v1);
    }
}

