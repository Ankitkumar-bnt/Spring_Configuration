package com.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.annotationConfig.AnnotationConfiguration;
import com.config.annotationConfig.AnnotationService;
import com.config.xmlConfig.XMLConstructorBean;
import com.config.xmlConfig.XMLController;

@SpringBootApplication
public class XmlAndAnnotationConfigApplication {

	public static void main(String[] args) {
		//SpringApplication.run(XmlAndAnnotationConfigApplication.class, args);
		
//		var context = new ClassPathXmlApplicationContext("configXML.xml");
//		
//		XMLController bean = context.getBean("xmlController",XMLController.class);
//		
//		bean.methodOfController();
//		
//		
//		XMLConstructorBean con = context.getBean("xmlConstructorBean", XMLConstructorBean.class);
//		
//		con.methodOfXMLConstructor();
//		
//		con.addData("Chandan", 28000);
		
		
		var context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		
		AnnotationService annotationBean = context.getBean(AnnotationService.class);
		
		annotationBean.show();
		
		annotationBean.getDataByAnnoConfig();
		
		
		
		
		
		context.close();
		
	}

}
