package annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//IOC容器
@Configuration

public class JavaConfigB {

    @Bean("bmw")
    public Car getBMW(){
        return new CarImpl_2();
    }
}
