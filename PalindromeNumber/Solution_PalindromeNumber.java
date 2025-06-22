package org.example;

class Solution {
    public boolean isPalindrome(int x) {

        int intLength = 0;
        int reversive = 0;
        int oldX = x;
        int digit;

        int temp = x == 0 ? 1 : x;

        if(x < 0){
            return false;
        }

        else if(x == 0) {
            return true;
        }
        else if(x % 10 == 0 && x != 0){
            return false;
        }
        
        
        while(temp > 0) {
            temp /= 10;
            intLength++;
        } //расчет длинны int x

        for(int i = 0; i < intLength; i++){
            digit = x % 10;
            reversive = reversive * 10 + digit;
            x = x / 10;
        }

        if(oldX == reversive){
            return true;
        }

        return false;
    }
}

/* 5ms of runtime (Beats 68.93%) :) */