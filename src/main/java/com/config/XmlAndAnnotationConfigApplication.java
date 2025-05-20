package com.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.xmlConfig.XMLConstructorBean;
import com.config.xmlConfig.XMLController;

@SpringBootApplication
public class XmlAndAnnotationConfigApplication {

	public static void main(String[] args) {
		//SpringApplication.run(XmlAndAnnotationConfigApplication.class, args);
		
		var context = new ClassPathXmlApplicationContext("configXML.xml");
		
		XMLController bean = context.getBean("XMLController",XMLController.class);
		
		bean.methodOfController();
		
		
		XMLConstructorBean con = context.getBean("constructorBean", XMLConstructorBean.class);
		
		con.methodOfXMLConstructor();
		
		
		
		context.close();
		
	}

}
