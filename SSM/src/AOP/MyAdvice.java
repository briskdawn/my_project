package AOP;

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
}
