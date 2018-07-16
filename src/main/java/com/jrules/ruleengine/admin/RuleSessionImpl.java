package com.jrules.ruleengine.admin;

import java.rmi.RemoteException;

import javax.rules.InvalidRuleSessionException;
import javax.rules.RuleExecutionSetMetadata;
import javax.rules.RuleSession;

public class RuleSessionImpl implements RuleSession {

	@Override
	public RuleExecutionSetMetadata getRuleExecutionSetMetadata() throws InvalidRuleSessionException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getType() throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void release() throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub

	}

}
