public class HelloWorld {

    public static void main(String[] args) {
        /* Printing "Hello World!" in console */
        System.out.println("Hello World!");
        // Say "Hello, your name."
        System.out.println("Hello, Tomek!");

        // Variables
        String name = "Tomek";
        int age = 35;
        boolean married = true;
        String me = showPersonData(name, age, married);
        System.out.println(me);

        String bro_name = "Jakub";
        int bro_age = 32;
        boolean bro_married = true;
        String brother = showPersonData(bro_name, bro_age, bro_married);
        System.out.println(brother);

        String sis_name = "Justyna";
        int sis_age = 35;
        boolean sis_married = false;
        System.out.println(showPersonData(sis_name, sis_age, sis_married));  // try to avoid it

    }

    public static String showPersonData(String name, int age, boolean married) {
        String info = "------------------------------\n";
        info = info + "Name: " + name + "\n";
        info = info + "Age: " + age + "\n";
        info = info + "Married: " + married + "\n";
        return info;
    }
}
