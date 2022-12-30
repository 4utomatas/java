import java.util.Scanner;

public class Biudzetas {
    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private int pajamuIndex = 0;
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    private int islaiduIndex = 0;

    public void pridetiPajamuIrasa(Scanner sc) {
        System.out.println("Iveskite suma");
        String suma = sc.next();
        System.out.println("Iveskite kategorija");
        String kategorija = sc.next();
        System.out.println("Iveskite Ar i banka? Taip: 1, Ne: 0");
        String arIBanka = sc.next();
        System.out.println("Iveskite papildoma informacija");
        String papildomaInfo = sc.next();

        float s = Float.parseFloat(suma);
        int arIB = Integer.parseInt(arIBanka);
        boolean b = arIB == 1;

        pajamos[pajamuIndex] = new PajamuIrasas(s, kategorija, b, papildomaInfo);
        pajamuIndex++;

        System.out.println("Pridetas irasas");
    }

    public void pridetiIslaiduIrasa(Scanner sc) {
        System.out.println("Iveskite suma");
        String suma = sc.next();
        System.out.println("Iveskite kategorija");
        String kategorija = sc.next();
        System.out.println("Iveskite Atsiskaitymo buda");
        String atsiskaitymoBudas = sc.next();
        System.out.println("Iveskite papildoma informacija");
        String papildomaInfo = sc.next();

        float s = Float.parseFloat(suma);

        islaidos[islaiduIndex] = new IslaiduIrasas(s, kategorija, atsiskaitymoBudas, papildomaInfo);
        islaiduIndex++;
        System.out.println("Pridetas irasas");
    }

    public void gautiPajamuIrasa(Scanner sc) {
        System.out.println("Iveskite index");
        String index = sc.next();
        int i = Integer.parseInt(index);
        if(i > 100 || pajamos[i] == null) {
            System.out.println("Irasas nerastas");
            return;
        }
        System.out.println(pajamos[i].getDisplayString());
    }

    public void gautiIslaiduIrasa(Scanner sc) {
        System.out.println("Iveskite index");
        String index = sc.next();
        int i = Integer.parseInt(index);
        if(i > 100 || islaidos[i] == null) {
            System.out.println("Irasas nerastas");
            return;
        }
        System.out.println(islaidos[i].getDisplayString());
    }
}
