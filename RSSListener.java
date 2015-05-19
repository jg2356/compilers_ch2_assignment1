// Generated from RSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RSSParser}.
 */
public interface RSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RSSParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RSSParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSSParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RSSParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(RSSParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(RSSParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operation}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperation(RSSParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperation(RSSParser.OperationContext ctx);
}