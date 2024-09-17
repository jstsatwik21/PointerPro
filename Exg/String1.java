package Exg;
import java.util.*;
public class String1 {
    public static void main(String[]args) {
        Scanner edge = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = edge.nextLine();
        str = str.trim();
        String str1 = "";
        for(int j = 0; j < str.length(); j++) {
            int index = str.indexOf(" " , j);
            if (index == -1) {
                index = str.length();
            }
            String str2 = str.substring(j , index);
            str1 = str2 + " " + str1;
            j = index;
        }
        System.out.println(str1);
        edge.close();
    }
}
