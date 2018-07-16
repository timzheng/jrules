package com.jrules.ruleengine.admin;

import java.io.IOException;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Map;

import javax.rules.admin.RuleExecutionSet;
import javax.rules.admin.RuleExecutionSetCreateException;
import javax.rules.admin.RuleExecutionSetProvider;

import org.w3c.dom.Element;

public class RuleExecutionSetProviderImpl implements RuleExecutionSetProvider{

	@Override
	public RuleExecutionSet createRuleExecutionSet(Element arg0, Map arg1)
			throws RuleExecutionSetCreateException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuleExecutionSet createRuleExecutionSet(Serializable arg0, Map arg1)
			throws RuleExecutionSetCreateException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuleExecutionSet createRuleExecutionSet(String arg0, Map arg1)
			throws RuleExecutionSetCreateException, IOException, RemoteException {
		// TODO Auto-generated method stub
		RuleExecutionSetImpl ruleExecutionSet = new RuleExecutionSetImpl();
		ruleExecutionSet.getName();
		
		return ruleExecutionSet;
	}

}
