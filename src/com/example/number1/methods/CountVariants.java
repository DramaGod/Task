package com.example.number1;

public class countVariants {

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int countWays(int s)
    {
        return fib(s + 1);
    }

}
