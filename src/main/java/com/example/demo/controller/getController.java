package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aa")
public class getController {

    @GetMapping("/getParam")
                           //생략 가능   이렇게 쓰지말것 , 정확한 이름을 줄 것
    public String getParam(@RequestParam String id, @RequestParam(name = "pw") String password){

        return "아이디비번 출력" + id + password;
    }

    @GetMapping("/getMultiParam")
    public void getMultiParameter(){
        System.out.println();
        System.out.println();
        System.out.println();
    }


}
