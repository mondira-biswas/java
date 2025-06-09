import java.util.*;
public class StringBuildier {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        sb.delete(2,4);
       // System.out.println(sb);s
        //char at 0 index1
       // System.out.println(sb.charAt(0));1
        //set char at index 01

         // sb.setCharAt(0,'p');1
        // sb.insert(0,'S');s

        System.out.println(sb);
        
    }
    
}
