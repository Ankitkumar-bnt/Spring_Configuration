package com.config.xmlConfig;

public class XMLConstructorBean {

	XMLServices serve;
	
	public XMLConstructorBean(XMLServices serve)
	{
		this.serve = serve;
	}
	public void methodOfXMLConstructor()
	{
		serve.show();
		System.out.println("Hello from XMLConstructor");
	}
}
