import java.util.*;
public class Greater
{
public static void main(String[]args)
{
Scanner ss= new Scanner(System.in);
System.out.println("Enter a first number");
int a = ss.nextInt();
System.out.println("Enter a second number");
int b = ss.nextInt();
System.out.println("Enter a third number");
int c = ss.nextInt();
if(a>b&&a>c)
{
System.out.println("Greater number is:+a");
}
else if(b>a && b>c)
{
System.out.println("Greater number is:"+b);
}
else
{
System.out.println("Greater number is:"+c);
}
}
}
