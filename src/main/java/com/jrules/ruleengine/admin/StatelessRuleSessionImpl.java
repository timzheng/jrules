package com.jrules.ruleengine.admin;

import java.rmi.RemoteException;
import java.util.List;

import javax.rules.InvalidRuleSessionException;
import javax.rules.ObjectFilter;
import javax.rules.RuleExecutionSetMetadata;
import javax.rules.StatelessRuleSession;

public class StatelessRuleSessionImpl implements StatelessRuleSession {

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

	@Override
	public List executeRules(List arg0) throws InvalidRuleSessionException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List executeRules(List arg0, ObjectFilter arg1) throws InvalidRuleSessionException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
