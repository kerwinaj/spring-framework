import com.xyzsoft.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://mp.weixin.qq.com/s/8yu69Ed-0R4UZ_mXn8M5uw
 * https://blog.csdn.net/u010999809/article/details/94293328
 */
public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName() + "," + person.getId());
	}
}
