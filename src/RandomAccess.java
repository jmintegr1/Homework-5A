import java.util.Random;

public class RandomAccess {
    public static void main(String[] args) {
        Random ra = new Random();
        int number;

        for(int counter=2; counter<=15;counter++){
            number = 1+ra.nextInt(10);
            System.out.println(number + " ");
        }

    }
}
