class Solution {
    public int solution(int n, String control) {
        
        for (char ch: control.toCharArray()) {
            switch (ch) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                default:
                    n -= 10;
                    break;
            }
        }
        
        return n;
    }
}