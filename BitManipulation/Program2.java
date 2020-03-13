package BitManipulation;
import java.io.*;
public class Program2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,flips=0;
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		while(((a | b) | c) != 0)
		{
			int ones_count=0;
			if((a & 1)==1)
				ones_count++;
			if((b & 1)==1)
				ones_count++;
			if((c & 1)==1 && ones_count==0)
				flips++;
			else if((c&1)==0 )
				flips+=ones_count;
			a=a>>1;
			b=b>>1;
			c=c>>1;
			
		}
		System.out.println(flips);
	}
}
