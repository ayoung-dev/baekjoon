import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num1 = Integer.parseInt(st.nextToken());
        
        int num2 = Integer.parseInt(st.nextToken());
        
        int result = num1 - num2;
        
        System.out.println(result);
        
        br.close();

    }
}