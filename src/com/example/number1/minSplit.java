package com.example.number1;

import java.util.Vector;

public class minSplit {

    static int deno[] = {1,5, 10, 20,
            50};
    static int n = deno.length;

    static int minSplit(int amount){


        Vector<Integer> ans = new Vector<>();

        for (int i = n - 1; i >= 0; i--)
        {
            while (amount >= deno[i])
            {
                amount -= deno[i];
                ans.add(deno[i]);
            }
        }
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                    " " + ans.elementAt(i));
        }

        return ans.size();
    }

}
