import java.io.*;

public class Class03 {

	public static void main(String[] args) throws IOException {
		// TODO �۰ʲ��ͪ���k Stub
		int n,sum=0;
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��J:");
		str=buf.readLine();
		n=Integer.parseInt(str);
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("1+..+"+n+"="+sum);
				
	}

}
