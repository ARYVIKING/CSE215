import java.util.Scanner;
public class Method {

    static int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int arr[]= new int [10];
        int mx = 0;
        int sum = 0;
        for(int i=0;i<10;i++)
        {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        for(int i=0;i<10;i++)
        {
            mx = arr[0];
            if (arr[i]>mx)
                mx = arr[i];

        }

        System.out.print("Sum is : "+sum +"\n");
        System.out.print("Max is : "+ mx +"\n");

    }
}













/*
    LM4PP1*/

/*LM4PP2
    */
