package recursion_BinarySearch_Segmenttrees;
import java.io.*;
public class Valid_Paranthesis {
	static void PrintvalidParanthesis(char[] st,int n,int pos,int open,int close)
	{
		if(close==n) {
			System.out.println(st);
			return;
		}
		if(open>close)
		{
			st[pos]='}';
			PrintvalidParanthesis(st,n,pos+1,open,close+1);
		}
		if(open<n)
		{
			st[pos]='{';
			PrintvalidParanthesis(st,n,pos+1,open+1,close);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		n=Integer.parseInt(br.readLine());
		char[] st=new char[2*n];
		PrintvalidParanthesis(st,n,0,0,0);
	}

}
