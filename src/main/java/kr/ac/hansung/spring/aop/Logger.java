package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	@Pointcut("execution(void kr.ac.hansung.spring.aop.*.sound())")
	private void selectSound()
	{
		
	}
	
	@Before("selectSound()")
	public void aboutToSound() {
		System.out.println("before: about to sound");
	}
}
