package com.jrules.ruleengine.engine;

import java.util.List;

import javax.rules.RuleRuntime;
import javax.rules.RuleServiceProvider;
import javax.rules.RuleServiceProviderManager;
import javax.rules.RuleSession;
import javax.rules.StatelessRuleSession;
import javax.rules.admin.RuleAdministrator;
import javax.rules.admin.RuleExecutionSet;
import javax.rules.admin.RuleExecutionSetProvider;

import com.jrules.ruleengine.admin.RuleExecutionSetImpl;
import com.jrules.ruleengine.admin.RuleserviceProviderImpl;

public class RuleTest {

	public void test() throws Exception{
		
		RuleServiceProviderManager.registerRuleServiceProvider("local.ruleservice", RuleserviceProviderImpl.class);
		
		RuleServiceProvider ruleServiceProvider = RuleServiceProviderManager.getRuleServiceProvider("local.ruleservice");
		
		RuleAdministrator admin = ruleServiceProvider.getRuleAdministrator();
		
		RuleExecutionSetProvider resProvider = admin.getRuleExecutionSetProvider(null);
		
		RuleExecutionSet res = resProvider.createRuleExecutionSet("", null);
		
		admin.registerRuleExecutionSet("", res, null);
		
		
		
		RuleRuntime runTime =  ruleServiceProvider.getRuleRuntime();
		StatelessRuleSession runSession = (StatelessRuleSession)runTime.createRuleSession("", null, 0);
		
		List result = runSession.executeRules(null);
		
	}
}
