public class t_21 {
        public static void main(String []args){
        String str = "";
        long startTime = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            str += " denzap";
        }
        long endTime = System.nanoTime();
        System.out.println("String += time: " + (endTime - startTime));
        str = "";
        StringBuilder strBuilder = new StringBuilder(str);
        startTime = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            strBuilder.append(" denzap");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime));
    }

}
