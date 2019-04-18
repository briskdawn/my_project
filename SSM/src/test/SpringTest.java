package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;
import pojo.user01;
import pojo.user01Factory;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConf.xml");
		user01 people = ac.getBean("user01",user01.class);
		System.out.println(people);
        
		user01Factory f= new user01Factory();
		user01 p1 = f.newInstance();
		System.out.println(p1);
		
		User p2 = ac.getBean("user",User.class);
		System.out.println(p2);
	}

}
