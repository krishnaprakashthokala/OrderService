package org.ecommerce.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"META-INF/rr/**/*.xml"})
public class OrderServiceApp {
    public static void main(String[] args)
    {
      SpringApplication.run(OrderServiceApp.class, args);
    }
}