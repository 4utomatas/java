import java.util.Scanner;
import java.util.ArrayList;

public class Biudzetas {
    private ArrayList<PajamuIrasas> pajamos = new ArrayList<PajamuIrasas>();
    private ArrayList<IslaiduIrasas> islaidos = new ArrayList<IslaiduIrasas>();

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

        PajamuIrasas p = new PajamuIrasas(s, kategorija, b, papildomaInfo);
        pajamos.add(p);

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

        IslaiduIrasas i = new IslaiduIrasas(s, kategorija, atsiskaitymoBudas, papildomaInfo);
        islaidos.add(i);

        System.out.println("Pridetas irasas");
    }

    public void gautiPajamuIrasa(Scanner sc) {
        System.out.println("Iveskite id");
        String id = sc.next();
        int pId = Integer.parseInt(id);
        for (int i = 0; i < pajamos.size(); i++) {
            if (pajamos.get(i).id == pId) {
                PajamuIrasas p = pajamos.get(i);
                System.out.println(p.getDisplayString());
                return;
            }
        }
        System.out.println("Irasas nerastas.");
    }

    public void gautiIslaiduIrasa(Scanner sc) {
        System.out.println("Iveskite id");
        String id = sc.next();
        int pId = Integer.parseInt(id);
        for (int i = 0; i < islaidos.size(); i++) {
            if (islaidos.get(i).id == pId) {
                IslaiduIrasas p = islaidos.get(i);
                System.out.println(p.getDisplayString());
                return;
            }
        }
        System.out.println("Irasas nerastas.");
    }

    public float balansas() {
        float suma = 0;
        for (PajamuIrasas p : pajamos) {
            suma += p.suma;
        }

        for (IslaiduIrasas i : islaidos) {
            suma -= i.suma;
        }

        return suma;
    }

    public void atvaizduotiPajamuIrasus() {
        if(pajamos.size() == 0) {
            System.out.println("Irasu nerasta");
            return;
        }

        for(PajamuIrasas p : pajamos) {
            System.out.println(p.getDisplayString());
        }
    }

    public void atvaizduotiIslaiduIrasus() {
        if(islaidos.size() == 0) {
            System.out.println("Irasu nerasta");
            return;
        }

        for(IslaiduIrasas p : islaidos) {
            System.out.println(p.getDisplayString());
        }
    }

    public void pasalintiPajamuIrasa(Scanner sc) {
        System.out.println("Iveskite id");
        String id = sc.next();
        int pId = Integer.parseInt(id);
        for (int i = 0; i < pajamos.size(); i++) {
            if (pajamos.get(i).id == pId) {
                pajamos.remove(i);
                System.out.println(pId + " irasas pasalintas");
                return;
            }
        }
    }

    public void pasalintiIslaiduIrasa(Scanner sc) {
        System.out.println("Iveskite id");
        String id = sc.next();
        int pId = Integer.parseInt(id);
        for (int i = 0; i < islaidos.size(); i++) {
            if (islaidos.get(i).id == pId) {
                islaidos.remove(i);
                System.out.println(pId + " irasas pasalintas");
                return;
            }
        }
    }
}
