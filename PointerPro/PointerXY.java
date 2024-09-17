package PointerPro;
import java.util.*;

public class PointerXY
{
    public static int parsingX(String str)
    {
        int index = str.indexOf("," , 0);

        String str1 = str.substring(1 , index);
        int X = Integer.parseInt(str1);
        return X;
    }
    public static int parsingY(String str)
    {
        int index = str.indexOf("," , 0);

        String str2 = str.substring(index+1 , str.length()-1);
        int Y = Integer.parseInt(str2);
        return Y;
    }
    public static void main(String[]args)
    {
        Scanner edg = new Scanner(System.in);
        System.out.print("(X,Y) :: ");
        String edu = edg.next().trim();
        int X = parsingX(edu);
        int Y = parsingY(edu);
        if(X == 0 && Y == 0)
            System.out.println('*');
        if(X == 0 && Y > 0 )
        {
            while(Y!=0)
            {
                if(Y > 1)
                    System.out.println();
                --Y;
            }
            System.out.print("*");
        }
        if(X > 0 && Y == 0 )
        {
            while(X > 0)
            {
                System.out.print(" ");
                if(X > 0)
                    --X;
                if(X == 1)
                    break;
            }
            System.out.print("*");
        }
        while(Y!=0)
        {
            if(Y > 1)
                System.out.println();
            --Y;
        }
        X -=1;
        while(X > 0)
        {
            System.out.print(" ");
            if(X > 0)
                --X;
            if(X == 0)
                System.out.print('*');
        }
        edg.close();
    }
}