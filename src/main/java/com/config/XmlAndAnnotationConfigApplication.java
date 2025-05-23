package com.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.annotationConfig.AnnotationConfiguration;
import com.config.annotationConfig.AnnotationService;
import com.config.beanLifeCycle.ConfigFile;
import com.config.beanLifeCycle.SpringBeanLifeCycle;
import com.config.xmlConfig.XMLConstructorBean;
import com.config.xmlConfig.XMLController;

@SpringBootApplication
public class XmlAndAnnotationConfigApplication {

	public static void main(String[] args) {
		//SpringApplication.run(XmlAndAnnotationConfigApplication.class, args);
		
//		var context = new ClassPathXmlApplicationContext("configXML.xml");
//		
//		XMLController bean = context.getBean("xmlController",XMLController.class);
//		XMLController bean1 = context.getBean("xmlController",XMLController.class);
//		bean.methodOfController();
//		bean1.methodOfController();
//		
//		
//		XMLConstructorBean con = context.getBean("xmlConstructorBean", XMLConstructorBean.class);
//		
//		con.methodOfXMLConstructor();
		
//		con.addData("Chandan", 28000);
		
		//=========================================Annotation Based========================================================
		
		var context2 = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		
		AnnotationService annotationBean = context2.getBean(AnnotationService.class);
		
		AnnotationService annotationBean1 = context2.getBean(AnnotationService.class);

		System.out.println(annotationBean);
		System.out.println(annotationBean1);
		
		annotationBean.show();
		annotationBean1.show();
		annotationBean.getDataByAnnoConfig();
		
		//===========================================Bean Life Cycle=======================================================
		
		var context3 = new AnnotationConfigApplicationContext(ConfigFile.class);
		SpringBeanLifeCycle sblc = context3.getBean(SpringBeanLifeCycle.class);
		
		sblc.ready();
		
//		context.close();
		context2.close();
		context3.close();//bean about to destroy
		
	}

}
