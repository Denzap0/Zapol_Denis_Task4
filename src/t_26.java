import java.util.ArrayList;
import java.util.Random;

public class t_26 {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            marks.add(rand.nextInt(5));
        }
        System.out.println(marks);
        marks.removeIf(x -> x <= 2);
        System.out.println("New, without bad marks: " + marks);
    }
}
