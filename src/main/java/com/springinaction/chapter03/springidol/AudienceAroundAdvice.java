package com.springinaction.chapter03.springidol;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.springinaction.chapter02.springidol.PerformanceException;

public class AudienceAroundAdvice implements MethodInterceptor {

	private Audience audience;
	
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		try{
			audience.takeSeats();
			audience.turnOffCellPhones();
			
			Object returnValue = invocation.proceed();
			
			audience.apploud();
			
			return returnValue;
		}catch(PerformanceException throwable){
			audience.demandRefund();
			throw throwable;
		}
	}
	
}
