package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cyber.Customer;

public class customerApp {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("customer.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Customer customerObj=(Customer)factory.getBean("obj1");
		
		
		customerObj.setCustomerId(101);
		customerObj.setCustomerName("Sandesh");
		customerObj.setCustomerPhone(965759316);
		customerObj.setCustomerEmail("Sandesh@gmail.com");
		System.out.println(customerObj);
		
		
	}

}
