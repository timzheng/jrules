package com.jrules.ruleengine.admin;

import java.rmi.RemoteException;
import java.util.List;

import javax.rules.Handle;
import javax.rules.InvalidHandleException;
import javax.rules.InvalidRuleSessionException;
import javax.rules.ObjectFilter;
import javax.rules.RuleExecutionSetMetadata;
import javax.rules.StatefulRuleSession;

public class StatefulRuleSessionImpl implements StatefulRuleSession {

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
	public Handle addObject(Object arg0) throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List addObjects(List arg0) throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsObject(Handle arg0)
			throws RemoteException, InvalidRuleSessionException, InvalidHandleException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void executeRules() throws RemoteException, InvalidRuleSessionException {
		//条件匹配，计算出需要执行的规则，放入agenda
		
		
		
	}

	@Override
	public List getHandles() throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getObject(Handle arg0) throws RemoteException, InvalidHandleException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getObjects() throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getObjects(ObjectFilter arg0) throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeObject(Handle arg0) throws RemoteException, InvalidHandleException, InvalidRuleSessionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset() throws RemoteException, InvalidRuleSessionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateObject(Handle arg0, Object arg1)
			throws RemoteException, InvalidRuleSessionException, InvalidHandleException {
		//对象发生变更时，重新计算规则执行集合
		this.executeRules();
	}

}
