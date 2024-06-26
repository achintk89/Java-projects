//You are conducting a contest at your college. This contest consists of two problems and
// participants. You know the problem that a candidate will solve during the contest.
//
//You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:
//
// 1. Use green-colored balloons for the first problem and purple-colored balloons for the second problem
// 2. Use purple-colored balloons for the first problem and green-colored balloons for the second problem
//You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.
import java.util.*;
public class CostOfBallons {
    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int priceGreen = sc.nextInt();
            int pricePurple = sc.nextInt();
            int n = sc.nextInt();
            int cost1 = 0, cost2 = 0;
            for(int i=0; i<n; i++) {
                cost1 += sc.nextInt();//sum of the ans
                cost2 += sc.nextInt();//sum of the ans
            }
            //multiply min cost with max ans and max cost with min ans
            int minCost = Math.min(cost1, cost2) * Math.max(priceGreen, pricePurple) + Math.max(cost1, cost2) * Math.min(priceGreen, pricePurple);
            System.out.println(minCost);
        }
    }
}
