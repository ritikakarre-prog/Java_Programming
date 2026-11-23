import java.util.Scanner;

class program343
{
    public static void main(String A[])
    {

        int iCnt = 0, iSize = 0;
        int ptr[] = null;            // int *ptr = NULL;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = scanner.nextInt();

        //step 1 : Allocate the memory
        ptr = new int[iSize];

        // step 2 : Use the memory
        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt <ptr.length; iCnt++)
        {
            ptr[iCnt] = scanner.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < ptr.length; iCnt++)
        {
            System.out.println(ptr[iCnt]);
        }
        
        //step 3 : Deallocate the memory
        
    }
}