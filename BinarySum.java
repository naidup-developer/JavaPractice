import java.util.Scanner;
public class BinarySum
{
	

	public static void main(String[] args) 
	{
		int digit1,digit2,sum=0,carry=0;
	int[] res=new int[10];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number one : ");
		int num1=sc.nextInt();
		System.out.println("Enter Number Two : ");
		int num2=sc.nextInt();


		for (int i=res.length-1;i>0;i-- )
		{
			digit1=num1%10;
			digit2=num2%10;

			num1=num1/10;
			num2=num2/10;

			sum=digit1+digit2+carry;

			if (sum==0)
			{
				res[i]=0;
				carry=0;
				
			}else if (sum==1) 
			{
				res[i]=1;
				carry=0;
				
			}else if (sum==2) 
			{
				res[i]=0;
				carry=1;
				
			}else if (sum==3) {

				res[i]=1;
				carry=1;
				
				
			}
			
		}

		for (int j=0; j<res.length;j++ )
		{
			System.out.print(res[j]);			
		}
		
	}
	

}