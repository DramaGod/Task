package com.example.number1;

public class notContains {

    public static int notContains(int array[]) {

        int a = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=a){
                a=a;
            }
            else{
                i=0;
                a++;
            }

        }
        return a;
    }
}
