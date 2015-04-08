/**
 * Created by Anatolii on 08.04.2015.
 */
import java.util.Arrays;
import java.util.Scanner;
public class thuesday {

        public static void main(String[] args) {
       /*     int[] intArray = {1,2,3,4,5};
            intArray = new int[5];
            intArray = new int[10];

            int[] newIntArray = {1,2,3,4,5};
            int i = newIntArray[0];

            System.out.println(i);
            newIntArray[0] = 10;
            System.out.println(i);
            System.out.println(Arrays.toString(newIntArray));
            System.out.println(newIntArray.length);

            System.out.println("before for");

            for (int j=0; j<=newIntArray.length -1; j++) {
                if(j==3){continue;}
                int element = newIntArray[j];
                }
                System.out.println(element);*/

            boolean[] boolArray = {true, true, false};
            for(boolean element : boolArray) {
                element=true;
                System.out.println(element);
            }

            int i = 0;
            Scanner scanner = new Scanner(System.in);
            if(i==0) {
                while (!scanner.hasNextInt()) {
                    //scanner.next();
                    System.out.println(i + 1);
                }
                int input = scanner.nextInt();
                System.out.println("in " + input);

            }
            else{System.out.println(i);}
            }


            }




