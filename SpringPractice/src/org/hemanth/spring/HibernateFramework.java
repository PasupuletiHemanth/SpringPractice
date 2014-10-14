package org.hemanth.spring;

import org.hemanth.spring.interfaces.Framework;

public class HibernateFramework implements Framework {
	
	private String name;
	private String version;
	private boolean onDemand;
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return version;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public boolean getOnDemand() {
		// TODO Auto-generated method stub
		return onDemand;
	}

	public void setOnDemand(boolean onDemand) {
		this.onDemand = onDemand;
	}

}
