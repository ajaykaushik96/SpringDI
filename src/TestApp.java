import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
		hw.sayHello();
        
	}

}
