public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person Maks = new Person(23,true,false);
        Person Anjelika = new Person(21,false,false);
        Maks.Marry(Anjelika);
        System.out.println(Maks.spouse);
        System.out.println(Anjelika.spouse);

    }
}

