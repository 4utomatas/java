import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        String input;
        while (run) {
            pradzia();
            input = sc.next();
            switch(input) {
                case "1" -> {
                    System.out.println("Iveskite suma");
                    String suma = sc.next();
                    System.out.println("Iveskite kategorija");
                    String kategorija = sc.next();
                    System.out.println("Iveskite Ar i banka? Taip: 1, Ne: 0");
                    String arIBanka = sc.next();
                    System.out.println("Iveskite papildoma informacija");
                    String papildomaInfo = sc.next();
                    biudzetas.pridetiPajamuIrasa(suma, kategorija, arIBanka, papildomaInfo);
                }
                case "2" -> {
                    System.out.println("Iveskite suma");
                    String suma = sc.next();
                    System.out.println("Iveskite kategorija");
                    String kategorija = sc.next();
                    System.out.println("Iveskite Atsiskaitymo buda");
                    String atsiskaitymoBudas = sc.next();
                    System.out.println("Iveskite papildoma informacija");
                    String papildomaInfo = sc.next();
                    biudzetas.pridetiIslaiduIrasa(suma, kategorija, atsiskaitymoBudas, papildomaInfo);
                }
                case "3" -> {
                    System.out.println("Iveskite index");
                    input = sc.next();
                    biudzetas.gautiPajamuIrasa(input);
                }
                case "4" -> {
                    System.out.println("Iveskite index");
                    input = sc.next();
                    biudzetas.gautiIslaiduIrasa(input);
                }
                case "x" -> {
                    run = false;
                }
                default -> System.out.println("Bloga įvestis...");
            }
        }
        sc.close();
    }

    static void pradzia() {
        System.out.println("______________________");
        System.out.println("Pasirinkite:");
        System.out.println("______________________");
        System.out.println("[1] - prideti pajamu irasa");
        System.out.println("[2] - prideti islaidu irasa");
        System.out.println("[3] - gauti pajamu irasa");
        System.out.println("[4] - gauti islaidu irasa");
        System.out.println("[x] - pabaiga");
        System.out.println("______________________");
    }

    static String getTime() {
        LocalTime timeNow = LocalTime.now();
        return timeNow.format(DateTimeFormatter.ofPattern("[HH:mm:ss]"));
    }

}


