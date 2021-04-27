package com.example.number1;

import java.util.Scanner;

public class GFG {


    public static void main (String[] args)
    {

        ////////////////// first task

        System.out.println("please input text: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (isPalindrome.isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");

        ////////////////// second task

        int intArray[] = {1,2,4,3,10,5,6,3,11,23,2,3,8,7};
        com.example.number1.notContains.notContains(intArray);
        System.out.println("               ");
        System.out.println(com.example.number1.notContains.notContains(intArray));

        ////////////////// third task

        System.out.println("there are:  ");
        int coin=minSplit.minSplit(105);
        System.out.println("  " +"      " + coin + "  " + "coins");

        ////////////////// fourth task

        String text="(())())";
        if(isProperly.isProperly(text)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        ///////////////// fifth task

        int s = 3;
        System.out.println("Number of ways = " + countVariants.countWays(s));

        ////////////////// sixth task

        MyDataStructure myDS = new MyDataStructure();
        myDS.add(1);
        myDS.add(2);
        myDS.add(3);
        myDS.add(4);
        myDS.add(5);
        System.out.println(myDS.arr.toString());

        myDS.remove(3);
        System.out.println(myDS.arr.toString());

        myDS.remove(2);
        System.out.println(myDS.arr.toString());

        myDS.remove(1);
        System.out.println(myDS.arr.toString());

        myDS.remove(4);
        System.out.println(myDS.arr.toString());

        myDS.remove(5);
        System.out.println(myDS.arr.toString());
    }


}


