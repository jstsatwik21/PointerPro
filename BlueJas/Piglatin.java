class Piglatin{
    public static void main(String str){
        str = str.trim();
        for(int i = 0;i < str.length();i++){
            char K = str.charAt(i);
            if(K == 'A'||K == 'E'|| K == 'I'||K == 'O'||K == 'U'||K == 'a'||K == 'e'|| K == 'i'||K == 'o'||K == 'u'){
                String str0 = str.substring(0,i);
                String str1 = str.substring(i);
                str = str1 + str0 + "ay";
                System.out.print(str);
                break;
            }
            
        }
    }
}