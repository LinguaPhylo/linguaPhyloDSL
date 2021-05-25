/*
 * generated by Xtext 2.25.0
 */
package lphy.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lphy.dsl.LPhyRuntimeModule;
import lphy.dsl.LPhyStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class LPhyIdeSetup extends LPhyStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LPhyRuntimeModule(), new LPhyIdeModule()));
	}
	
}