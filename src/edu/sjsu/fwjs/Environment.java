package edu.sjsu.fwjs;

import java.util.Map;
import java.util.HashMap;





public class Environment {
    private Map<String,Value> env = new HashMap<String,Value>();
    private Environment outerEnv;

    /**
     * Constructor for global environment
     */
    public Environment() {}
    //testBryan
    /**
     * Constructor for local environment of a function
     */
    public Environment(Environment outerEnv) {
        this.outerEnv = outerEnv;
    }

    /**
     * Handles the logic of resolving a variable.
     * If the variable name is in the current scope, it is returned.
     * Otherwise, search for the variable in the outer scope.
     * If we are at the outermost scope (AKA the global scope)
     * null is returned (similar to how JS returns undefined.
     */
    public Value resolveVar(String varName) 
    {
    	
        if(env.containsKey(varName)) 
        {
           return env.get(varName);
        }
        else 
        {
        if (outerEnv != null)
        { 
        	return outerEnv.resolveVar(varName);
        }
        else 
        {
        	return new NullVal();
        }
        }
        
    }

    /**
     * Used for updating existing variables.
     * If a variable has not been defined previously in the current scope,
     * or any of the function's outer scopes, the var is stored in the global scope.
     */
    public void updateVar(String key, Value v) 
    {
    	if(env.containsKey(key))
    	{
    		env.put(key, v);
    	}
    	else
    	{
    		if (outerEnv == null)
    		{
    			createVar(key, v);
    		}
    		else
    		{
    			outerEnv.updateVar(key, v);
    		}
    	}
    	/*
        if(env.containsKey(key)) //hash(key) is found
        {
            //update the hash with the new value
            env.put(key,v);
            //return;
        }
        else if(outerEnv == null) //it is the global scope
        {
            //insert hash with new value and key
            env.put(key,v);
            //return;
        }
        else
        outerEnv.updateVar(key, v); //check the outer scope
        */
    }


    /**
     * Creates a new variable in the local scope.
     * If the variable has been defined in the current scope previously,
     * a RuntimeException is thrown.
     */
    public void createVar(String key, Value v) 
    {
    	if(env.containsKey(key))
    	{
    		throw new RuntimeException("Redeclaring existing var " + key);
    	}
        env.put(key, v);
    }
}
