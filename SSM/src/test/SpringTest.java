package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConf.xml");
				User people = ac.getBean("User",User.class);
				System.out.println(people);

	}

}
