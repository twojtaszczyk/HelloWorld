package javastarter;

public class Notebook {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int sum = x + y;

        x = y;

        System.out.println(sum);
        System.out.println(x);

        String ala = "Ala";
        String kota = "kota";
        String sequence = ala + " ma " + kota;

        System.out.println(sequence);

        ala = "" + x;
        System.out.println(ala);

    }
}
