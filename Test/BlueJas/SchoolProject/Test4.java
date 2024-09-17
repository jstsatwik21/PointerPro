package SchoolProject;
import java.util.*;
class Test4{
    public static void main(String[]args){
        Scanner edge = new Scanner(System.in);
        System.out.print("Enter a Line: ");
        String str = edge.nextLine();
        str = str.toUpperCase();
        int i , j;
        for(i = 0; i < str.length(); i++){
            char k = str.charAt(i);
            if(k == 'A'||k == 'E'||k == 'I'||k == 'O'||k == 'U')
                break;
        }
        for(j = str.length() - 1; j < str.length(); j--){
            char c = str.charAt(j);
            if(c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U')
                break;
        }
        String fina = str.substring(i,j);
        System.out.print(fina);
    }
}