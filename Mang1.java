import java.util.Scanner;


public class Mang1 {

public static float Tong(int []arr,int n)
{
	int tong=0;
	for(int i=0;i<n;i++)
		tong+=arr[i];
	return tong;
}

public static float min(int []arr,int n)
{
	int m=arr[0];
	for(int i=1;i<n;i++)
		if(m>arr[i])
			m=arr[i];
	return m;
					
}
public static float max(int []arr,int n)
{
	int m=arr[0];
	for(int i=1;i<n;i++)
		if(m<arr[i])
			m=arr[i];
	return m;
					
}
public static float avg(int []arr,int n)
{
	return Tong(arr,n)/n;
					
}

public static boolean snt(int n)
{
	if(n<2)
		return false;
	for(int i=2;i<=n/2;i++)
		if(n%i==0)
			return false;
	return true;
}
public static float Tongsnt(int []arr,int n)
{
	int tong=0;
	for(int i=0;i<n;i++)
		if(snt(arr[i]))
		tong+=arr[i];
	return tong;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr =new Scanner(System.in);
		int n;
		System.out.print("nhap vao so phan tu mang ");
		n=sr.nextInt(); 
	
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			{System.out.print("\nnhap phan tu thu " + (i+1) + " : ");
		    arr[i]=sr.nextInt();
			}
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				 if(arr[i]>arr[j])
				 {
					 int t=arr[i];
					 arr[i]=arr[j];
					 arr[j]=t;
				 }
		System.out.print("\n Mang sau khi sap xep : ");
		for(int i=0;i<n;i++)
		{System.out.print("\n "+arr[i]);
	    
		}
		System.out.print("\n Tong cac phan tu trong mang : "+Tong(arr,n));
		System.out.print("\n Min : "+min(arr,n));
		System.out.print("\n Max : "+max(arr,n));
		System.out.print("\n AVG : "+avg(arr,n));
		System.out.print("\n Tong cac so nguyen to trong mang : "+Tongsnt(arr,n));
		sr.close();
		
	}

}
