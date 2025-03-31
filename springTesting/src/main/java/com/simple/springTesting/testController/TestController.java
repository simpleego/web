package com.simple.springTesting.testController;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    // [Request sample]
    // GET http://localhost:8080/hello/request/star/Robbie/age/95 (보내고자 하는 데이터를 경로에 추가)
    // 필요한 데이터 부분에 중괄호
    // http://localhost:8080/test/simple/age/25
    //@GetMapping("/test/{age}/name/{name}")
    @GetMapping("/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable("age") int age) {
        return String.format("Hello, @PathVariable.<br> age = %d", age);
    }

    @GetMapping("/name/{name}")
    @ResponseBody
    public String name(@PathVariable("name") String name) {
        return String.format("result, @PathVariable name = %s", name);
    }

    @GetMapping("/name/{name}/age/{age}")
    @ResponseBody
    public String nameAge(@PathVariable("name") String name,
                          @PathVariable("age") int age) {
        return String.format("result, @PathVariable: name = %s,  age=%d", name, age);
    }
}
