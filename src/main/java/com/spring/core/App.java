package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
    	String file_locaiton="./com/spring/resources/Config.xml";
      ApplicationContext context =new ClassPathXmlApplicationContext(file_locaiton);
       Student stu= context.getBean("student", Student.class);
       System.out.println(stu);
       
    }
}
