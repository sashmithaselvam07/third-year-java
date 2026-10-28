public class sss
{
    public static void main(String[] args)
    {
        String s="456";
        String t="123";
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            a=a*10+(s.charAt(i)-'0');
        }
        int b=0;
        for(int i=0;i<t.length();i++)
        {
            b=b*10+(t.charAt(i)-'0');
        }
  int sum=a+b;
  System.out.println("Sum of two numbers:"+sum);
    }
}
        
