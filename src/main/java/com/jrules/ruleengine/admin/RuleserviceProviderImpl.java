package com.jrules.ruleengine.admin;

import javax.rules.ConfigurationException;
import javax.rules.RuleRuntime;
import javax.rules.RuleServiceProvider;
import javax.rules.admin.RuleAdministrator;

public class RuleserviceProviderImpl extends RuleServiceProvider {

	@Override
	public RuleAdministrator getRuleAdministrator() throws ConfigurationException {
		// TODO Auto-generated method stub
		return new RuleAdministratorImpl();
	}

	@Override
	public RuleRuntime getRuleRuntime() throws ConfigurationException {
		// TODO Auto-generated method stub
		return new RuleRuntimeImpl();
	}

}
