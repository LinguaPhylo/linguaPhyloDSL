/*
 * generated by Xtext 2.25.0
 */
package lphy.dsl.parser.antlr;

import com.google.inject.Inject;
import lphy.dsl.parser.antlr.internal.InternalLPhyParser;
import lphy.dsl.services.LPhyGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LPhyParser extends AbstractAntlrParser {

	@Inject
	private LPhyGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLPhyParser createParser(XtextTokenStream stream) {
		return new InternalLPhyParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "LPhyModel";
	}

	public LPhyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LPhyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}