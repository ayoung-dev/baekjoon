import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> list = new ArrayList<>(numlist.length);
        
        for (int i: numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}