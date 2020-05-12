

   
    import java.util.*;
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
            
            long no_of_days;
            long[] radious =new  long[1000000];
            long[] amount_of_horlicks=new long[100000];
            int count = 0;
            Scanner sc = new Scanner(System.in);
            no_of_days = sc.nextLong();
            for (int counter = 0; counter < no_of_days; counter++) {
                radious[counter] = sc.nextLong();
                amount_of_horlicks[counter] = sc.nextLong();
            }
            for (int counter = 0; counter < no_of_days; counter++) {
                if (700 * amount_of_horlicks[counter] >= 44 * radious[counter])
                    count++;
            }
            System.out.println(count);
     
        }
    }

Language: Java 8
