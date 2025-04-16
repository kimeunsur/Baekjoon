import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int[] cards=new int[n+1];
        String[] input=br.readLine().split(" ");
        for (int i=0;i<n;i++) {
            cards[i+1]=Integer.parseInt(input[i]);
        }
        int[] dp=new int[n+1];
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                dp[i]=Math.max(dp[i-j]+cards[j],dp[i]);
            }
        }
        bw.write(dp[n]+"\n");
        br.close();
        bw.close();
    }

}
