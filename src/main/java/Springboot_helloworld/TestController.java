package Springboot_helloworld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    //返回信息
    @ResponseBody
    @RequestMapping("/hello")
    public String say(){
        return "hello world";
    }


}
