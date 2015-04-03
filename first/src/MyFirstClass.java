/**
 * Created by Anatolii on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] params) {
        greetings();
        /*String a ="Hello World";*/ // 1st way
        String a;
        /*String a; String b;        String c;   ==    String a, b, c; //other way
        */
        a = "Hello World";//other way
        System.out.println(a);

        double height = 174;
        double weight = 74;

        double ratio = weight / height;

        String greeting = "My name is ";
        String name = "Anatoliy";
        String result = greeting + name;
        System.out.println(result);
        int age = 26;
        int i = -1;
        System.out.println("I'm " + (i + age)+" and my ratio is " + ratio);
    }

    public static void greetings() {
    //commented text
    }
}
