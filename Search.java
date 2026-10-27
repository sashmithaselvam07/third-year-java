public class Search
{
    public static void main(String[] args)
    {
    int arr[]={10,20,10,40,20,20,10};
    int search=10;
    int count=0;
    for(int i : arr)
    {
        if(i == search)
        {
            count ++;
        }
    }
    System.out.println("Element Found"+count+"times");
}

}