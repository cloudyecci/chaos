package com.tii;


import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(isPalindrome("123321"));
        System.out.println(LocalDateTime.now());
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
