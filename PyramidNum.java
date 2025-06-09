public class PyramidNum {

    public static void main(Strings args[])
    {
        int n=5;
        
        for(int i=0;i<=n;i++)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        
            System.out.println();
       }
    }
    
}
