import java.util.Random;

public class ArrayTest {

        public static void main(String[] args) {

            int limit = 50;
            int  arrayT[] = new int[limit];

            Random random  = new Random();

            for (int i = 0; i < arrayT.length; i++) {
                /* arrayT[i] = (int) (Math.random() * 100 + 1);*/
                arrayT[i] = random.nextInt(100);
            }
            for(int j = 0; j < arrayT.length; j++) {
                System.out.println(arrayT[j]);
            }
        }
    }
