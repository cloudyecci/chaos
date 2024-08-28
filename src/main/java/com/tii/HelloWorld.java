package com.tii;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(isPalindrome("123321"));
        //按照给定的格式显示当前时间
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(dtf));
    }
    //判断一个字符串是否是回文字符串
    public static boolean isPalindrome(String str){
        if(str == null){
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
