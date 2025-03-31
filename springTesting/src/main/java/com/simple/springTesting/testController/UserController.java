package com.simple.springTesting.testController;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // 빌더 패턴을 이용하여 사용자 객체를 생성
    User user = User.builder().userId("simpleego").password("1234").name("심플")
            .email("simple@gmail.com").build();
    User user1 = User.builder().userId("test").password("4567").name("홍길동")
            .email("test@gmail.com").build();
    User user2 = User.builder().userId("pjc").password("89786").name("망나니")
            .email("pjc@gmail.com").build();

    @GetMapping("/info")
    public String index(Model model) {
        String name = "홍길동";
        int age = 25;
        model.addAttribute("name",name);
        model.addAttribute("age",age);

        model.addAttribute("user",user);

        // 사용자 정보를 컬렉션에 저장
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        model.addAttribute("userList",userList);
        System.out.println("user:"+user);
        System.out.println("user:"+user1);
        System.out.println("user:"+user2);

        return "user";
    }
}

@Builder
@ToString
@Getter
@Setter
class User {
    private String userId;
    private String password;
    private String name;
    private String email;
}

