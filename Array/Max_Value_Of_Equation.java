class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE, flag = 1;
        for (int i = 0; i < points.length; i++) {
            if (flag < i + 1)
                flag = i + 1;
            for (int j = flag; j < points.length; j++) {
                int mod = points[j][0] - points[i][0];
                if (mod <= k) {
                    int eq = points[i][1] + points[j][1] + mod;
                    if (eq > max) {
                        max = eq;
                        flag = j - 1;
                    }
                }else {
                    break;
                }
            }
        }
        return max;
    }
}
