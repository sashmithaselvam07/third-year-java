public class Firstoccurence
{
    public static void main (String[] args)
    {
        int[] arr={10,20,30,40,20};
        int target = 20;
        int first  = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                if(first==-1)
            
            {
                first=i;
            }
            {
            last=i;
            }
        }
        }
        System.out.println("First Occurence:"+first);
        System.out.println("last Occurence:"+last);
    }
}
