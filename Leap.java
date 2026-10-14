import java.util.*;
public class Leap
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
System.out.println("enter a year");
int year=ss.nextInt();
if(year%4==0)
{
System.out.println("it is Leap year");
}
else
{
System.out.println("it is not Leap year");
}
}
}