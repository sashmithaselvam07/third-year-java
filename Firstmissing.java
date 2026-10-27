public class Firstmissing
{
    public static void main(String[] args)
    {
    int arr[]={6,1,0,2,9,5,6,3,7,4};
    int n = arr.length;
    int missing  = 1;
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n-1;j++)
     {
        if(arr[j] >arr[j+1])
        {
         int temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
        }
        }
     }
     for (int i= 0;i<n;i++)
     {
        if(arr[i]==missing)
        {
            missing++;
        }
        else if(arr[i]>missing)
        {
            break;
        }
     }
     System.out.println("First missing positive number:"+missing);
    }
}