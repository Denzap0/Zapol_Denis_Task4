public class t_19 {
    public static int numOfWords(String str){
        int num = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                while(i < str.length() && str.charAt(i) != ' '){
                    i++;
                }
                num++;
            }
        }
        return num;
    }
    public static void main(String []args){
        String str = " hi   den   hi      ";
        System.out.println(numOfWords(str));
    }
}
