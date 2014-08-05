package com.springinaction.chapter03.springidol;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AudienceAdvice implements MethodBeforeAdvice,
		AfterReturningAdvice, ThrowsAdvice {

	private Audience audience;
	
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public AudienceAdvice(){}
	
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		audience.takeSeats();
		audience.turnOffCellPhones();
	}
	
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		audience.apploud();
	}

	public void afterThrowing(Throwable throwable){
		audience.demandRefund();
	}

}
