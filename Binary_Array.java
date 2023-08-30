package binary_array;

public class Binary_Array {

    public static void main(String[] args) 
    {

        int[] a = {70,30,40,50,10};
        
        int key = 70;

        int min = 1;
        int max = a.length - 1;

        while (min <= max) 
        {
            int mid = (min + max) / 2;
            
            if (key == a[mid])
            {
                System.out.println("Found " + key + " at position " + mid);
                break;         //  key is present
            } 
            else if (key < a[mid])
            {
                max = mid - 1;
            } 
            else 
            {
                min = mid + 1;
            }
        }
        
        if (min > max)
        {
            System.out.println(key + " is not present in the array.");
        }
    }
}
