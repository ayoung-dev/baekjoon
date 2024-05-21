class Solution {
    public int solution(int[] num_list) {
        
        int mul = 1, sum = 0;
        
        for (int i: num_list) {
            mul *= i;
            sum += i;
        }
        
        return mul > sum * sum ? 0 : 1;
    }
}