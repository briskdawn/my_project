package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;
import pojo.user01;
import pojo.user01Factory;
import service.impl.UserImpl;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConf.xml");
		user01 people = ac.getBean("user",user01.class);
		System.out.println(people);
        
		user01Factory f= new user01Factory();
		user01 p1 = f.newInstance();
		System.out.println(p1);
		
		UserImpl ui = ac.getBean("userService",UserImpl.class);
		List<User> l =ui.show();
		for(User u:l) {
			System.out.println(u);
		}
	}

}
