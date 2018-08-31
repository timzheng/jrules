package com.jrules.ruleengine.engine;

import java.util.ArrayList;
import java.util.List;

import javax.rules.ConfigurationException;
import javax.rules.RuleRuntime;
import javax.rules.RuleServiceProvider;
import javax.rules.RuleServiceProviderManager;
import javax.rules.RuleSession;
import javax.rules.StatefulRuleSession;
import javax.rules.StatelessRuleSession;
import javax.rules.admin.RuleAdministrator;
import javax.rules.admin.RuleExecutionSet;
import javax.rules.admin.RuleExecutionSetProvider;

import com.jrules.ruleengine.admin.RuleExecutionSetImpl;
import com.jrules.ruleengine.admin.RuleserviceProviderImpl;

public class RuleTest {

	public void init() throws Exception{
		
		RuleServiceProviderManager.registerRuleServiceProvider("com.jrules.ruleservice.local", RuleserviceProviderImpl.class);
		RuleServiceProviderManager.registerRuleServiceProvider("com.jrules.ruleservice.remote", RuleserviceProviderImpl.class);
		
		List<String> bizIds = new ArrayList<>();
		for(String bizId:bizIds){
			
		}
	}
	
	public void test() throws Exception{
		
		RuleServiceProviderManager.registerRuleServiceProvider("local.ruleservice", RuleserviceProviderImpl.class);
		
		RuleServiceProvider ruleServiceProvider = RuleServiceProviderManager.getRuleServiceProvider("local.ruleservice");
		
		RuleAdministrator admin = ruleServiceProvider.getRuleAdministrator();
		
		RuleExecutionSetProvider resProvider = admin.getRuleExecutionSetProvider(null);
		
		RuleExecutionSet res = resProvider.createRuleExecutionSet("", null);
		
		admin.registerRuleExecutionSet("", res, null);
		
		
		
		RuleRuntime runTime =  ruleServiceProvider.getRuleRuntime();
		StatelessRuleSession runSession = (StatelessRuleSession)runTime.createRuleSession("add-content", null, RuleRuntime.STATELESS_SESSION_TYPE);
		StatefulRuleSession statefulSession = (StatefulRuleSession)runTime.createRuleSession("add-content", null, RuleRuntime.STATEFUL_SESSION_TYPE);
		statefulSession.addObject(null);
		statefulSession.executeRules();
		statefulSession.getRuleExecutionSetMetadata();
		
		List result = runSession.executeRules(null);
		
	}
}
