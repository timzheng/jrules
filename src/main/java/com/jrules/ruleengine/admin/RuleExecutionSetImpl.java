package com.jrules.ruleengine.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.rules.admin.RuleExecutionSet;

public class RuleExecutionSetImpl implements RuleExecutionSet {

	private String name;
	
	private String description;
	
	List<JRule> rules = new ArrayList<>();
	
	Properties props = new Properties();
	
	@Override
	public String getDefaultObjectFilter() {
		return null;
	}

	@Override
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public Object getProperty(Object arg0) {
		return this.props.get(arg0);
	}

	@Override
	public List getRules() {
		return this.rules;
	}
	
	void setRules(List<JRule> rules) {
		this.rules = rules;
	}

	@Override
	public void setDefaultObjectFilter(String arg0) {

	}

	@Override
	public void setProperty(Object arg0, Object arg1) {
		this.props.put(arg0, arg1);
	}

}
