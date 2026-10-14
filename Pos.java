import java.util.*;
public class Pos
{
public static void main(String[] args)
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter a number");
int num=ss.nextInt();
if(num>0)
{
System.out.println("it is posiive");
}
else if(num<0)
System.out.println("it is negative");
else
{
System.out.println("it is neither positive nor negative");
}
}
}
