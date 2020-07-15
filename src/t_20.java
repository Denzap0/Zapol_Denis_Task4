public class t_20 {

        public static void numOfWords(String str){
        int num = 0;

        for(int i = 0; i < str.length(); i++){
            if(i != 0 && str.charAt(i) == ' ' && str.charAt(i - 1) != ' '){
                System.out.print(str.charAt(i - 1));
            }
            else if(i == str.length() - 1 && str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            }
        }

    }
    public static void main(String []args){
        String str = " hello denzap f      de  ax    gsd                   ";
        numOfWords(str);
    }

}
