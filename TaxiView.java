package View;
import java.util.*;
public class TaxiView {

public static int choice()
{
	System.out.println("Choose any one\n1.Book Taxi\n2.Display Details\n3.Exit");
	Scanner s=new Scanner (System.in);
	return s.nextInt();
}

public static char choice11()
{	Scanner s=new Scanner (System.in);
	System.out.println("Enter Pickup Location");
return	 s.next().charAt(0);

}
public static char choice12()
{	Scanner s=new Scanner (System.in);

	System.out.println("Enter Drop Location");
	return s.next().charAt(0);

}
public static int choice13()
{	Scanner s=new Scanner (System.in);

	System.out.println("Enter Pickup Time");
	return s.nextInt();

}
public void disp(String m)
{
	System.out.println(m);
}
public void thank()
{
	System.out.println("ThankYouuu");
}
public void dash()
{
	System.out.println("-----------------");
}

}
