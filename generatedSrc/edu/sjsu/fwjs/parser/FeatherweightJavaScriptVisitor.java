// Generated from FeatherweightJavaScript.g4 by ANTLR 4.5.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FeatherweightJavaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FeatherweightJavaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FeatherweightJavaScriptParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FeatherweightJavaScriptParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bareExpr}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(FeatherweightJavaScriptParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(FeatherweightJavaScriptParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(FeatherweightJavaScriptParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FeatherweightJavaScriptParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionappl}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionappl(FeatherweightJavaScriptParser.FunctionapplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(FeatherweightJavaScriptParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(FeatherweightJavaScriptParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variabledecl}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledecl(FeatherweightJavaScriptParser.VariabledeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(FeatherweightJavaScriptParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functiondecl}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondecl(FeatherweightJavaScriptParser.FunctiondeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varref}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarref(FeatherweightJavaScriptParser.VarrefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(FeatherweightJavaScriptParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(FeatherweightJavaScriptParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(FeatherweightJavaScriptParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noparam}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoparam(FeatherweightJavaScriptParser.NoparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code args}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FeatherweightJavaScriptParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noargs}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoargs(FeatherweightJavaScriptParser.NoargsContext ctx);
}