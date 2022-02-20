package javastarter.personaldataapp;

public class PersonalData {

    public static void main(String[] args) {
        /* Printing "Hello World!" in console */
        System.out.println("Hello World!");
        // Say "Hello, your name."
        System.out.println("Hello, Tomek!");

        // Variables
        String name = "Tomek";
        int age = 35;
        boolean married = true;
        Gender myGender = Gender.MALE;

        String me = showPersonData(name, age, married, myGender);
        System.out.println(me);

        String broName = "Jakub";
        int broAge = 32;
        boolean broMarried = true;
        Gender broGender = Gender.MALE;

        String brother = showPersonData(broName, broAge, broMarried, broGender);
        System.out.println(brother);

        String sisName = "Justyna";
        int sisAge = 35;
        boolean sisMarried = false;
        Gender sisGender = Gender.FEMALE;
        System.out.println(showPersonData(sisName, sisAge, sisMarried, sisGender));  // try to avoid it

    }

    public static String showPersonData(String name, int age, boolean married, Gender gender) {
        String info = "------------------------------\n";
        info = info + "Name: " + name + "\n";
        info = info + "Age: " + age + "\n";
        info = info + "Married: " + married + "\n";
        info = info + "javastarter.personaldataapp.Gender: " + gender + "\n";
        return info;
    }
}
