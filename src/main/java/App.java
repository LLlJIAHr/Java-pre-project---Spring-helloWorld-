import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloBean1 == helloBean2);


        Cat catBean1 =
                applicationContext.getBean("cat", Cat.class);
        Cat catBean2 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean1 == catBean2);
    }
}