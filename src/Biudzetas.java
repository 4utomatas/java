import java.util.ArrayList;

public class Biudzetas {
    private ArrayList<PajamuIrasas> pajamos = new ArrayList<PajamuIrasas>();
    private ArrayList<IslaiduIrasas> islaidos = new ArrayList<IslaiduIrasas>();

    public void pridetiPajamuIrasa(String suma, String kategorija, String arIBanka, String papildomaInfo) {
        float s = Float.parseFloat(suma);
        int arIB = Integer.parseInt(arIBanka);
        boolean b = arIB == 1;

        PajamuIrasas p = new PajamuIrasas(s, kategorija, b, papildomaInfo);
        pajamos.add(p);

        System.out.println("Pridetas irasas");
    }

    public void pridetiIslaiduIrasa(String suma, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        float s = Float.parseFloat(suma);

        IslaiduIrasas i = new IslaiduIrasas(s, kategorija, atsiskaitymoBudas, papildomaInfo);
        islaidos.add(i);

        System.out.println("Pridetas irasas");
    }

    public void gautiPajamuIrasa(String id) {
        int pId = Integer.parseInt(id);
        for (int i = 0; i < pajamos.size(); i++) {
            if (pajamos.get(i).id == pId) {
                PajamuIrasas p = pajamos.get(i);
                System.out.println(p.data + " - " + p.id + " - suma: " + p.suma + "; kategorija: " + p.kategorija + "; ar i banka: " + p.pozymisArIBanka);
                return;
            }
        }
        System.out.println("Irasas nerastas.");
    }

    public void gautiIslaiduIrasa(String id) {
        int pId = Integer.parseInt(id);
        for (int i = 0; i < islaidos.size(); i++) {
            if (islaidos.get(i).id == pId) {
                IslaiduIrasas p = islaidos.get(i);
                System.out.println(p.data + " - " + p.id + " - suma: " + p.suma + "; kategorija: " + p.kategorija + "; atsiskaitymo budas: " + p.atsiskaitymoBudas);
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
            System.out.println(p.data + " - " + p.id + " - suma: " + p.suma + "; kategorija: " + p.kategorija + "; ar i banka: " + p.pozymisArIBanka);
        }
    }

    public void atvaizduotiIslaiduIrasus() {
        if(islaidos.size() == 0) {
            System.out.println("Irasu nerasta");
            return;
        }

        for(IslaiduIrasas p : islaidos) {
            System.out.println(p.data + " - " + p.id + " - suma: " + p.suma + "; kategorija: " + p.kategorija + "; atsiskaitymo budas: " + p.atsiskaitymoBudas);
        }
    }

    public void pasalintiPajamuIrasa(String id) {
        int pId = Integer.parseInt(id);
        for (int i = 0; i < pajamos.size(); i++) {
            if (pajamos.get(i).id == pId) {
                pajamos.remove(i);
                System.out.println(pId + " irasas pasalintas");
                return;
            }
        }
    }

    public void pasalintiIslaiduIrasa(String id) {
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
