package com.redhat.ceylon.compiler.typechecker.util;

import com.redhat.ceylon.compiler.typechecker.analyzer.ModuleManager;
import com.redhat.ceylon.compiler.typechecker.context.Context;

/**
 * Factory to specify a custom type of ModuleManager to be created by the TypeChecker. 
 * 
 * @author Stéphane Épardaud <stef@epardaud.fr>
 */
public interface ModuleManagerFactory {

    /**
     * Creates a new instance of ModuleManager for the TypeChecker.
     */
    ModuleManager createModuleManager(Context context);

}
