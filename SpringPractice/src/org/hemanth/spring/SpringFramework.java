package org.hemanth.spring;

import org.hemanth.spring.interfaces.Framework;

public class SpringFramework implements Framework{
private String name;
private String version;
private boolean onDemand;

public void getFrameworkName()
{
	System.out.println("Framework Name :- "+name);
}
public SpringFramework()
{
	System.out.println("In constructor"+name);
}
public void init()
{
	System.out.println("In spring init method"+name);
}

public void destroy()
{
	System.out.println("In spring destroy method");
}


public String getName() {
	return name;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public boolean getOnDemand() {
	return onDemand;
}


public void setOnDemand(boolean onDemand) {
	this.onDemand = onDemand;
}


public void setName(String name) {
	this.name = name;
}


}
