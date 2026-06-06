import View.*;
import Controller.*;
public class MainClass 
{
public static void main(String[] args) throws CloneNotSupportedException 
{

TaxiView tv=new TaxiView();
TaxiController tc=new TaxiController(tv);
tc.start();


}
}