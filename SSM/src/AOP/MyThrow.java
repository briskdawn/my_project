package AOP;

import org.springframework.aop.ThrowsAdvice;

public class MyThrow implements ThrowsAdvice {
	//Schema-base方式
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("执行异常通过-schema-base 方式");
	}
}
