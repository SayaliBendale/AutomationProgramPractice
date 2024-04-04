 
import java.util.scanner;
 class primeno {

	public static void main(String[] args) {
	int n=7, count=0;
	System.out.println("Enter any number");
	scanner r=new scanner(System.in);
	n=r.nextInt();
	for(int i=1; i<=n; i++)
	{if (n%i==0)
	{
		count++;
	}
	}
	if(count==2)
		System.out.println("Prime Number");
	else
		System.out.println("Not Prime Number");
	
	}

}
