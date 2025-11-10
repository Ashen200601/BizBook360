package com.bizbook360;

import jdk.internal.misc.InnocuousThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BizBook360Application {


    public static void main(String[] args) {
        SpringApplication.run(BizBook360Application.class, args);
        System.out.println("🚀 BizBook360 Application Started Successfully!");
        System.out.println("📱 Access the application at: http://localhost:8080");
    }
}