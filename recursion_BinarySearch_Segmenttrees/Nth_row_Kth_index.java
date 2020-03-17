package recursion_BinarySearch_Segmenttrees;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nth_row_Kth_index {
	static char[] Find_row(int row,int len,int n,char[] ar)
	{
		if(row==n)
			return ar;
		int l=(len>>1)<<1;
		for(int i=len>>1;i<len;i++)
		{
			if(ar[i]=='0')
			{
				ar[l++]='0';
				ar[l++]='1';
			}
			else
			{
				ar[l++]='1';
				ar[l++]='0';
			}
		}
		return Find_row(row+1,l,n,ar);
	}
	static char Find_Kth_element(int n,int k,char[] ar)
	{
		return Find_row(1,1,n,ar)[k-1];		
	}
	public static void main(String[] args) throws IOException{
		int n,k;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		k=Integer.parseInt(br.readLine());
		char[] ar=new char[1<<(n-1)];
		ar[0]='0';
		System.out.println(Find_Kth_element(n,k,ar));
	}
}
