/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.test;

import java.util.*;

/**
 *
 * Mr Shaker
 *
 * @author lab502
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList(); 
        String z = "hello";
        a1.add("hello");
        a1.add("asdfa");
        boolean b =search(a1, z);
        System.out.println(b);
        ArrayList<String> a2 = new ArrayList(); 
        a2.addAll(a1);
        a2.add("do it");
        System.out.println(larg(a1, a2));
//        ArrayList<Integer> hello = new ArrayList();
//        ArrayList<Integer> a3 = new ArrayList();
//        insert10(a3);
//        insert10(hello);
//        System.out.println(sum(hello));
//        System.out.println(sum20(hello));
//System.out.println(min(hello));
//System.out.println(minTwoArray(hello,a3));
        //ما كتبنا اسم الكلاس لأنه بنفس الكلاس
//        if(1=9)shortHand
            
            
    }

    /////main mithod
    public static int min(ArrayList<Integer> a1) {
        int x=a1.get(0) ;
//        ArrayList<Integer> a2 = new ArrayList();
//        a2= Collections.sort(a1);
//        x=a2.get(0);
           for (int i = 1; i < a1.size(); i++) {
            if(a1.get(i)<x)
                x=a1.get(i);
                      } 
    return x;
    }
    // minmum value
    public static int minTwoArray(ArrayList<Integer> a1,  ArrayList<Integer> a2) {
          int sum1=a1.get(0);
     for (int i = 1; i < a1.size(); i++) {
            if(a1.get(i)>sum1)
                sum1=a1.get(i);
                      } 
            int sum2=a2.get(0);
     for (int i = 1; i < a2.size(); i++) {
            if(a2.get(i)>sum2)
                sum2=a2.get(i);
                      } 
     int x;
     if(sum2<sum1)
         x=sum1;
     else
         x=sum2;
    return x;
    }
    
    public static int sum(ArrayList<Integer> a1) {
        int sum = 0;
        for (int x : a1) {
            sum = x + sum;
        }
//    for(ArrayList<Integer> x : a1){
//    sum=x+sum;
//        for (int i = 0; i < a1.size(); i++) {
//            sum+=a1.get(i);
//        }
        return sum;
    }

    //sum method
    public static int sum20(ArrayList<Integer> a1) {
        int sum = 0;

        for (int x : a1) {
            if (x > 20) {
                sum = x + sum;
            }
        }
        return sum;
    }

    //sum over 20
    public static void insert10(ArrayList<Integer> a1) {
        Scanner S = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            a1.add(S.nextInt());

        }
        
    }
    //insert number
    public static  boolean search(ArrayList<String> a1 , String z ){
    if(a1.indexOf(z)==-1)
        return false;
    else
        return true;
    }
    public static  void searchAnother(ArrayList<String> a1 , String z ){
    if(a1.contains(z))
            System.out.println("yes");
    else
            System.out.println("no");
    }
    public static int larg(ArrayList<String> a1 , ArrayList<String> a2 ){
    if(a1.size()>a2.size())
        return a1.size();
    else
        return a2.size();
    }
}