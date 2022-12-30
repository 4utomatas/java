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
            System.out.println("______________________");
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
                    System.out.println("Iveskite ID");
                    input = sc.next();
                    PajamuIrasas p = biudzetas.gautiPajamuIrasa(input);
                    System.out.println(p.getId() + " - suma: " + p.suma + "; kategorija: " + p.pajamuKategorija + "; ar i banka: " + p.pozymisArIBanka);
                }
                case "4" -> {
                    System.out.println("Iveskite ID");
                    input = sc.next();
                    IslaiduIrasas p = biudzetas.gautiIslaiduIrasa(input);
                    System.out.println(p.getId() + " - suma: " + p.suma + "; kategorija: " + p.islaiduKategorija + "; atsiskaitymo budas: " + p.atsiskaitymoBudas);
                }
                case "5" -> {
                    System.out.println("Balansas: " + biudzetas.balansas());
                }
                case "6" -> {
                    biudzetas.atvaizduotiPajamuIrasus();
                }
                case "7" -> {
                    biudzetas.atvaizduotiIslaiduIrasus();
                }
                case "8" -> {
                    System.out.println("Iveskite id");
                    input = sc.next();
                    biudzetas.pasalintiPajamuIrasa(input);
                }
                case "9" -> {
                    System.out.println("Iveskite id");
                    input = sc.next();
                    biudzetas.pasalintiIslaiduIrasa(input);
                }
                case "10" -> biudzetas.redaguotiPajamuIrasa(sc);
                case "11" -> biudzetas.redaguotiIslaiduIrasa(sc);
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
        System.out.println("[5] - patikrinti balansa");
        System.out.println("[6] - atspausdinti pajamu irasus");
        System.out.println("[7] - atspausdinti islaidu irasus");
        System.out.println("[8] - pasalinti pajamu irasa");
        System.out.println("[9] - pasalinti islaidu irasa");
        System.out.println("[10] - redaguoti pajamu irasa");
        System.out.println("[11] - redaguoti islaidu irasa");
        System.out.println("[x] - pabaiga");
        System.out.println("______________________");
    }
}


