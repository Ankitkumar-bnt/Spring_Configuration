package com.config.xmlConfig;

public class XMLController {

	XMLServices serve ;
	
	public void setServe(XMLServices serve) {
		this.serve = serve;
	}
	
	public void methodOfController()
	{
		serve.show();
	}
}
