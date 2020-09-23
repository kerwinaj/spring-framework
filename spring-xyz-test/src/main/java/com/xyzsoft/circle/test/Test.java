package com.xyzsoft.circle.test;

import com.xyzsoft.circle.app.App;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 鲁班
//		useAnnotation();

		// 连鹏举
		useXml();
	}

	private static void useXml() {
		String configLocation = "application.xml";
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
	}

	public static void useAnnotation(){
		// 初始化容器, 所有的单例bean已经实例化好了, 已经放在了容器中
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(App.class);
	}


}
