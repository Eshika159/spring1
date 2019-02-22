package main;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//fileappctx
		
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("");
		//AppContext subclass of BeanFactory
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		
		BeanFactory bf=new ClassPathXmlApplicationContext("Bean.xml");
		
		Employee emp=(Employee)bf.getBean("employee");
		//Employee emp1=ctx.getBean(Employee.class);
		emp.sayHello();
		
		//by default singleton
		//emp.sayHello();
		//emp1.sayHello();
		

	}

}
