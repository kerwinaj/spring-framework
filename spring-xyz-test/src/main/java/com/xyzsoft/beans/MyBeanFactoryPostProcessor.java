package com.xyzsoft.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("[MyBeanFactoryPostProcessor.postProcessBeanFactory]coming");
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for (int i = 0; i < beanDefinitionNames.length; i++) {
			String beanDefinitionName = beanDefinitionNames[i];
			System.out.println("[MyBeanFactoryPostProcessor.postProcessBeanFactory]foreach, i:" + i + ", beanDefinitionName:" + beanDefinitionName);
			if ("person".equals(beanDefinitionName)) {
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
				MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
				System.out.println("[MyBeanFactoryPostProcessor.postProcessBeanFactory]beanDefinitionName:" + beanDefinitionName
						+ ", propertyValues:" + propertyValues
						+ ", values:" + propertyValues.getPropertyValueList()
						+ ", nameValue:" + propertyValues.getPropertyValue("name").getValue());
				if (propertyValues.contains("name")) {
					propertyValues.addPropertyValue("name", "yuk-change-this");
					System.out.println("[MyBeanFactoryPostProcessor.postProcessBeanFactory]changed, nameValue:" + propertyValues.getPropertyValue("name").getValue());
				}
			}
		}
		System.out.println("[MyBeanFactoryPostProcessor.postProcessBeanFactory]end");
	}
}
