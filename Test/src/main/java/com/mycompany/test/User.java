/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.*;

/**
 *
 * @author lab502
 */
public class User {

    String name;
    int age;
    ArrayList<User> a1 = new ArrayList();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static int Method1(ArrayList<User> a2) {
        int num = 0;
        for (User user : a2) {
            if (user.age < 25) {
                num++;
            }

        }
        return num;
    }

    static void Method2(ArrayList<User> a2) {
        for (User user : a2) {
            user.age+=5;
        }
    }

    static void Method3(ArrayList<User> a2) {
        for (User user : a2) {
            System.out.println(user.name + user.age);
        }
    }
    
}
