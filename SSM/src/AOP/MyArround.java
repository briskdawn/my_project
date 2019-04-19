package AOP;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArround implements MethodInterceptor{
	//环绕通知：Schema-base方式实现
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("环绕-前置");
		Object result = arg0.proceed();//放行,调用切点方式
		System.out.println("环绕-后置");
		return result;
	}

	

}
