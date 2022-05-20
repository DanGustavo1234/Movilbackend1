/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cordova.movilbackend1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author danyg
 */
@SpringBootApplication
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class Movilbackend1 {

    public static void main(String[] args) {
        SpringApplication.run(Movilbackend1.class, args);
    }
}

            