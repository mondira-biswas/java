import java.util.*;
public class Array2D {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int cols =sc.nextInt();
        int numbers[][] = new int [rows][cols];
        //input
        //rows
        for(int i=0;i<rows;i++)
        {
            //cols
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();

            }
        }
        int x = sc.nextInt();
        //ountput
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(numbers[i][j] == x)
                System.out.println("found at location ("+i +","+j +")");[[[]]]

            }
            
        }

    }
    
}
