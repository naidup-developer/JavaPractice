import java.util.Scanner;
public class BinarySum2
{
	public static void main(String[] args) {
		int b1,b2;
		int i=0,carry=0;

		int[] sum=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num1 : ");
		b1=s.nextInt();
		System.out.println("Enter num2 : ");
		b2=s.nextInt();

		s.close();

		while(b1 !=0 && b2!=0)
		{
			sum[i++]=(int)((b1%10+b2%10+carry)%2);
			carry=(int)((b1%10+b2%10+carry)/2);

			System.out.println(((b1%10+b2%10+carry)%2)+" "+((b1%10+b2%10+carry)/2));

			b1=b1/10;
			b2=b2/10;
			System.out.println(b1+" "+b2);
		}
		if (carry != 0) 
		{
			System.out.println("Carry :"+i+" "+carry);
			sum[i++]=carry;
		}
		--i;

		System.out.println("output : ");

		while (i>=0)
		{
			System.out.print(sum[i--]);	
		}

		System.out.println("\n");
	}
}