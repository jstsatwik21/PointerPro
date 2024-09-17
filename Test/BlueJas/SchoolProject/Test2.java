package SchoolProject;
import java.util.*;
public class Test2 {
    public static void main(String[]args){
        Scanner edge = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = edge.nextLine();
        str = str.toUpperCase();
        str = str.trim();
        str = str + " ";
        int pal = 0;
        for(int i = 0;i < str.length();i++){
            int index = str.indexOf(" ",i);
            String str2 = str.substring(i , index);
            String w = "", rw = "";
            char k;
            for(int j = 0;j < str2.length();j++){
                k = str.charAt(j);
                w = w + k;
                rw = k + rw;
            }
            if(rw.equalsIgnoreCase(w))
                pal++;
            w = "";
            rw = "";
            
            i = index;
        }
        System.out.println("No. of palindrom words present in the given sentence: "+pal);
        edge.close();
    }
}
