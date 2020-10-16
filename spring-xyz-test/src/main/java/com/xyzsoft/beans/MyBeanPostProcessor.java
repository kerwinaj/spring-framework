package com.xyzsoft.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 在set方法之后
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[MyBeanPostProcessor.postProcessBeforeInitialization]coming, bean:" + bean + ", beanName:"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[MyBeanPostProcessor.postProcessAfterInitialization]coming, bean:" + bean + ", beanName:"+beanName);
		return bean;
	}
}
