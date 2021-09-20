import java.util.Scanner;
class C	
//change1	
{
	public static void main(String[] args) 
	{
       System.out.println("enter the number of rows");
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   for(int i=0;i<n;i++)
		{
		   for(int j=0;j<n;j++)
			{
			   if( j==0||(i!=0&&i!=n-1)||(i==0||i==n-1)&&(j>0&&j<n/2))
				{
                   System.out.print("*");
				}
				else
			    {
			      System.out.print(" ");
				}
		     }
			 System.out.println();
         }
	}
}

