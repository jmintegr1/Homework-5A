public class RunException {
    public static void main (String[] args) {
        int a, b, m = 0;
        int z[] = new int[7];
        a = 10;
        b = 2;      //If I make value of b = 0 then the exception message
        try {      //reads: sout message below with ArithmeticException: / by zero
                m= a / b;
            for (int e = 0; e <= 7; e++) {
                z[e] = e + 1;
            }
            for (int l : z) {
                System.out.println(l);
            }
        }
        catch(ArithmeticException e)
                {
                    System.out.println("This cannot take place, you must not divide by Zero " + e);
                }
                System.out.println(m);
            }
        }