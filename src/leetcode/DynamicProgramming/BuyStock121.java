package leetcode.DynamicProgramming;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuyStock121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            buyPrice = Math.min(buyPrice, prices[i]);
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }
}
