package com;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Mybean;

@SuppressWarnings("deprecation")
public class SpringImpl 
{
	public static void main(String arg[])
	{
		
		Resource resource=new ClassPathResource("Beans.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Mybean obj=(Mybean)factory.getBean("myBeanObj");
		obj.display();
		
		/*com.MyBean obj1=new com.MyBean(); //Tightly Coupling Code
		obj1.display();*/
		
	}
}