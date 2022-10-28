package com.practica01;

import java.util.Calendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica01Application {

    public static void main(String[] args) {
        SpringApplication.run(Practica01Application.class, args);
        Calendar c = Calendar.getInstance();
        System.out.println("Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }

}
