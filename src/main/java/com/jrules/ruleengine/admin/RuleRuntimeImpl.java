package com.jrules.ruleengine.admin;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import javax.rules.RuleExecutionSetNotFoundException;
import javax.rules.RuleRuntime;
import javax.rules.RuleSession;
import javax.rules.RuleSessionCreateException;
import javax.rules.RuleSessionTypeUnsupportedException;

public class RuleRuntimeImpl implements RuleRuntime {

	@Override
	public RuleSession createRuleSession(String arg0, Map arg1, int arg2) throws RuleSessionTypeUnsupportedException,
			RuleSessionCreateException, RuleExecutionSetNotFoundException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getRegistrations() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
