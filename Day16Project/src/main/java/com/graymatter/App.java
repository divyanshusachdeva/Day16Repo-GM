package com.graymatter;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.graymatter.beans.Customer;
import com.graymatter.beans.HelloBean;
import com.graymatter.beans.Order;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {

//    	HelloBean hb = new HelloBean();
//    	hb.sayHello();
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
//    	HelloBean hb = (HelloBean) context.getBean("hello"); // this is down casting
//    	hb.sayHello();
//    	
//    	HelloBean hb1 = (HelloBean) context.getBean("hello");
//    	hb.sayHello();
    	
//    	Customer c = new Customer("Divyanshu",123,"9868543210");
//    	System.out.println(c);
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("customer-bean.xml");
//    	Customer c = (Customer) context.getBean("cust");
//    	System.out.println(c);
//    	System.out.println(c.hashCode());
//    	
//    	Customer c1 = (Customer) context.getBean("cust");
//    	System.out.println(c1);
//    	System.out.println(c1.hashCode());
//    	
//    	Customer c2 = (Customer) context.getBean("cust");
//    	System.out.println(c2);
//    	System.out.println(c2.hashCode());
//    	
//    	Customer c3 = (Customer) context.getBean("cust");
//    	System.out.println(c3);
//    	System.out.println(c3.hashCode());
    	
//    	Customer c1 = (Customer) context.getBean("cust1");
//    	System.out.println(c1);
    	
//    	Order ord = (Order) context.getBean("ord");
//    	System.out.println(ord);
    	
    	XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("db-bean.xml"));
    	DataSource ds = (DataSource) beanFactory.getBean("dbCon");
    	
    	Connection con = ds.getConnection();
    	System.out.println("Connection Established");
    	
    	
    	
    }
}
