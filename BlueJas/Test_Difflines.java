import java.util.Scanner;
class Test_Difflines{
    public static void main(){
        Scanner edge = new Scanner(System.in);
        System.out.println("Input any sentence: ");
        String sen = edge.nextLine();
        sen = sen.trim();
        sen = sen + " ";
        for(int i = 0;i < sen.length();i++){
            int index = sen.indexOf(" ",i);
            String str2 = sen.substring(i , index);
            System.out.println(str2);
            i = index;
        }
        edge.close();
    }
}