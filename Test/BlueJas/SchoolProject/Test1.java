package SchoolProject;
import java.util.*;
class Test1{
 public static void main(String[]args){
    Scanner edge = new Scanner(System.in);
    System.out.print("Input any sentence: ");
    String sen = edge.nextLine();
    sen = sen.trim();
    sen = sen + " ";
    int vc = 0;
    for(int i = 0;i < sen.length();i++){
        int index = sen.indexOf(" ",i);
        String str2 = sen.substring(i , index);
        for(int j = 0;j < str2.length();j++){
            str2 = str2.toUpperCase();
            char ch = str2.charAt(j);
            if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
                vc++;
        }
        System.out.println(str2+" = "+vc);
        vc = 0;
        i = index;
    }
    edge.close();
 }
}