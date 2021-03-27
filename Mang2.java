import java.util.Scanner;

public class Mang2 {
	static Scanner sr =new Scanner(System.in);
    public static void nhapMaTran(int [][]arr,int m,int n)
    {   
    
    	for(int i=0;i<m;i++)
    		for(int j=0;j<n;j++)
    		{
    			System.out.print("\n nhap pt ("+i+","+j+") :");
    			arr[i][j]=sr.nextInt();
    		}
    	
    }
    public static void xuatMaTran(int [][]arr,int m,int n)
    {   
    	for(int i=0;i<m;i++)
    	{for(int j=0;j<n;j++)
    		{
    			System.out.print(String.format("%3d ", arr[i][j]));
    			
    		}
    	System.out.print("\n");
    	}
    }
    public static int[][] tongMaTran(int [][]arr,int [][]ar,int m,int n)
    {   int mtc[][]=new int[m][n];
    	for(int i=0;i<m;i++)
    	{for(int j=0;j<n;j++)
    		{mtc[i][j]=arr[i][j]+ar[i][j];  			
    			
    		}
    	
    	}
    	return mtc;
    }
	public static void main(String[] args) {
		//Scanner sr =new Scanner(System.in);
    	System.out.print("nhap vao kich thuoc ma tran (mxn) ");
    	int m,n;
    	m=sr.nextInt();
		n=sr.nextInt(); 
    	
	 int mta[][]=new int[m][n],mtb[][]=new int[m][n];
	 System.out.print("\n Nhap ma tran a : ");
	 nhapMaTran(mta,m,n);
	 System.out.print("\n ma tran a : \n");
	 xuatMaTran(mta,m,n);
	 System.out.print("\n Nhap ma tran b : ");
	 nhapMaTran(mtb,m,n);
	 System.out.print("\n ma tran b : \n");
	 xuatMaTran(mtb,m,n);
	 System.out.print("\nTong cua 2 ma tran la : \n");
	 xuatMaTran(tongMaTran(mta,mtb,m,n), m, n);
	 sr.close();
        
	}

}
