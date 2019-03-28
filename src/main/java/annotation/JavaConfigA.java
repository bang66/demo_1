package annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//IOC容器
@Configuration

public class JavaConfigA {

    @Bean("toyota")
    public Car getToyota(){
        System.out.println("=============");
        return new CarImpl_1();
    }
}
