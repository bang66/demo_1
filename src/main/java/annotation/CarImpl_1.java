package annotation;


import org.springframework.stereotype.Component;

@Component
public class CarImpl_1 implements Car{
    @Override
    public void print() {
        System.out.println("----toyota-------");
    }
}
