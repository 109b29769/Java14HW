import java.io.*;

public class Class03 {

	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		int n,sum=0;
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入:");
		str=buf.readLine();
		n=Integer.parseInt(str);
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("1+..+"+n+"="+sum);
				
	}

}
