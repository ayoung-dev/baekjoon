import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (check(br.readLine())) {
            	count++;
            }
        }
        System.out.println(count);
        
        br.close();
    }
    
    static boolean check(String str) {
        boolean[] arr = new boolean[26];
        int prev = -1;
    
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
        
            if (prev != now) {
                if(arr[now - 'a'] == false) {
                    arr[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}