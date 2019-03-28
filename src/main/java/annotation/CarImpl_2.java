package annotation;


import org.springframework.stereotype.Component;

@Component
public class CarImpl_2 implements Car{
    @Override
    public void print() {
        System.out.println( "------bmw--------");
    }
}
