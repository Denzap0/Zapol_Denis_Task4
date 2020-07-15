public class t_18 {
    public static int numOfSymbols(String str){
        int num = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.toCharArray()[i] == ',' ||
            str.toCharArray()[i] == '.' ||
            str.toCharArray()[i] == '!' ||
            str.toCharArray()[i] == '?' ||
            str.toCharArray()[i] == '(' ||
            str.toCharArray()[i] == ')'){
            num++;
        }
    }
        return num;
    }
    public static void main(String []args){
        String str = "h.e?l!l,o";
        System.out.println(numOfSymbols(str));
   }
}
