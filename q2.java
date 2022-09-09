public class q2 {
    //25
    private static int soultion(int nums){
        int[] dp =new int[nums];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <nums ; i++) {
            dp[i]=dp[i-1]+i;
        }
        return dp[nums-1];
    }

    public static void main(String[] args) {
        System.out.println(q2.soultion(6));
    }
}
