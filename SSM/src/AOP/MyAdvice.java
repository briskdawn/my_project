package AOP;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void mybefore(String name1,int age1){
		System.out.println("前置"+name1 );
	}
	public void mybefore1(String name1){
		System.out.println("前置:"+name1);
	}
	public void myaftering(){
		System.out.println("后置 2");
	}
	public void myafter(){
		System.out.println("后置 1");
	}
	public void mythrow(){
		System.out.println("异常");
	}
	
	public Object myarround(ProceedingJoinPoint p) throws Throwable{
		System.out.println("执行环绕");
		System.out.println("环绕-前置");
		Object result = p.proceed();
		System.out.println("环绕后置");
	return result;
	}
}
