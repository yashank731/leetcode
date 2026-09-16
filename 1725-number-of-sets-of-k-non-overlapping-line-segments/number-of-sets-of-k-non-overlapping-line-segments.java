class Solution {
    public int numberOfSets(int n, int k) {
        int MOD = 1000000007;
        int[] dp = new int[n];
        int[] Sums = new int[n + 1];
        for (int j = 0; j < n; j++) {
            dp[j] = 1;
            Sums[j + 1] = (Sums[j] + dp[j]) % MOD;
        }
        for (int i = 0; i < k; i++) {
            dp[0] = 0;
            for (int j = 1; j < n; j++) {
                dp[j] = (dp[j - 1] + Sums[j]) % MOD;
            }
            Sums[0] = 0;
            for (int j = 0; j < n; j++) {
                Sums[j + 1] = (Sums[j] + dp[j]) % MOD;
            }
        }
        return (int) dp[n - 1];
    }
}