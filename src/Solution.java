class Solution {
    public int numWays(int n) {
        int res = 1;
        final int MOD = 1000000007;
        int a , b=1;
        if(n < 2){
            return 1;
        }
        for(int i=2;i<=n;i++){
            a = b;
            b = res;
            res = (a + b) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.numWays(5);
        System.out.println("i = " + i);
    }
}