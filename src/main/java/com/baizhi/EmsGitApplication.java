package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.sql.SQLOutput;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class EmsGitApplication {

    public static void main(String[] args) {
        System.out.println(123);
        SpringApplication.run(EmsGitApplication.class, args);
    }

}
