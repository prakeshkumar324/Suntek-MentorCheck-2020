package recursion_BinarySearch_Segmenttrees;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Return_Frequency {
	static void get_Frequency(ArrayList<Integer> ar,int k,int pos,int count) {
		if(pos==ar.size()) {
			System.out.println(count);
			return;
		}
		if(ar.get(pos)==k)
			count++;
		get_Frequency(ar,k,pos+1,count);
	}
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		ArrayList<Integer> ar=new ArrayList<>();
		while(st.hasMoreTokens())
			ar.add(Integer.parseInt(st.nextToken()));
		int k=Integer.parseInt(br.readLine());
		get_Frequency(ar,k,0,0);	
	}

}
