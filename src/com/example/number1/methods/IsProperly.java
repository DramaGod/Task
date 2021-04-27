package com.example.number1;

public class isProperly {

    static boolean isProperly(String sequence){

        char[]s=sequence.toCharArray();
        int i=0;
        for(char ch: s){
            if (ch=='('){
                i+=1;
            }
            else{
                if(ch==')'){
                    i-=1;
                }
            }
        }
        return i==0;
    }

}
