package com.jrules.ruleengine.admin;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import javax.rules.admin.LocalRuleExecutionSetProvider;
import javax.rules.admin.RuleAdministrator;
import javax.rules.admin.RuleExecutionSet;
import javax.rules.admin.RuleExecutionSetDeregistrationException;
import javax.rules.admin.RuleExecutionSetProvider;
import javax.rules.admin.RuleExecutionSetRegisterException;

public class RuleAdministratorImpl implements RuleAdministrator {

	Map<String, RuleExecutionSet> ruleExecutionSetPool = new HashMap<String, RuleExecutionSet>(); 
	
	@Override
	public void deregisterRuleExecutionSet(String arg0, Map arg1)
			throws RuleExecutionSetDeregistrationException, RemoteException {
		ruleExecutionSetPool.remove(arg0);
	}

	@Override
	public LocalRuleExecutionSetProvider getLocalRuleExecutionSetProvider(Map arg0) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuleExecutionSetProvider getRuleExecutionSetProvider(Map arg0) throws RemoteException {
		RuleExecutionSetProvider ruleExecutionSetProvider = new RuleExecutionSetProviderImpl();
		return ruleExecutionSetProvider;
	}

	@Override
	public void registerRuleExecutionSet(String arg0, RuleExecutionSet arg1, Map arg2)
			throws RuleExecutionSetRegisterException, RemoteException {
		ruleExecutionSetPool.put(arg0, arg1);
	}

}
