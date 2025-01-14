/*
 * generated by Xtext 2.29.0
 */
package fr.n7.simplePDL.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.simplePDL.TextSimplePDLRuntimeModule;
import fr.n7.simplePDL.TextSimplePDLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TextSimplePDLIdeSetup extends TextSimplePDLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TextSimplePDLRuntimeModule(), new TextSimplePDLIdeModule()));
	}
	
}
