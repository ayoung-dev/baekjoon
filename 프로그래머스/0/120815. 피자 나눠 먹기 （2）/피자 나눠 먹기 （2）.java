class Solution {
    public int solution(int n) {
        
        int i = 6;
        
        while (i % n != 0) {
            i += 6;
        }
        
        return i / 6;
    }
}