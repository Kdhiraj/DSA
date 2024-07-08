import java.util.ArrayList;

// 1672. Richest Customer Wealth
/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17

* */
public class MaxWealth {
    public static void main(String[] args) {
        int[][] numbs1 = {
                {1, 2, 3},
                {3, 2, 1}
        };

        int[][] numbs2 = {
                {1, 5}, {7, 3}, {3, 5}
        };
        int[][] numbs3 = {
                {2, 8, 7}, {7, 1, 3}, {1, 9, 5}
        };
//
//        System.out.println(maximumWealth(numbs1));
//        System.out.println(maximumWealth(numbs2));
//        System.out.println(maximumWealth(numbs3));
        System.out.println(maxWealth(numbs1));
        System.out.println(maxWealth(numbs2));
        System.out.println(maxWealth(numbs3));

    }

    /*
     * logic:
     * 1. iterate over each row and do sum of each column element
     * 2. check greatest by comparing with sum of array
     * 3. return greatest
     *
     */

    //In one method to find max wealth of customer
    static int maxWealth(int[][] accounts) {
        //person = row
        //account = column
        int max = Integer.MIN_VALUE;
        for (int customer = 0; customer < accounts.length; customer++) {
            int sum = 0;
            for (int account = 0; account < accounts[customer].length; account++) {
                sum = sum + accounts[customer][account];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }


    static int maximumWealth(int[][] numbs) {
        ArrayList<Integer> sumList = new ArrayList<>();
        for (int[] numb : numbs) {
            int sum = sumOfArray(numb);
            sumList.add(sum);
        }
        return greatestNum(sumList);
    }

    //return greatestNum
    static int greatestNum(ArrayList<Integer> numbs) {
        int max = numbs.getFirst();
        for (int num : numbs) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //Do sum of arrays
    static int sumOfArray(int[] numb) {
        int sum = 0;
        for (int num : numb) {
            sum = sum + num;
        }
        return sum;
    }


}
