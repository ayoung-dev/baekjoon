class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = n; i > 3; i--) {
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    count++;
                    break;
                }
        }
        
        return count;
    }
}