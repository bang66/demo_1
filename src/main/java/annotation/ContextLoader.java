package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoader {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ParentConfig.class);
        Car car1= (Car) context.getBean("toyota");
        car1.print();
        System.out.println("-----------");
        Car car2= (Car) context.getBean("bmw");
        car2.print();

    }
}
