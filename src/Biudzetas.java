import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
    private ArrayList<Irasas> irasai = new ArrayList<>();

    public void pridetiIrasa(Irasas irasas) {
        irasai.add(irasas);
    }

    public void pridetiPajamuIrasa(String suma, String kategorija, String arIBanka, String papildomaInfo) {
        try {
            float s = Float.parseFloat(suma);
            int k = Integer.parseInt(kategorija);
            int arIB = Integer.parseInt(arIBanka);
            boolean b = arIB == 1;

            PajamuIrasas p = new PajamuIrasas(s, k, b, papildomaInfo);
            pridetiIrasa(p);

            System.out.println("Pridetas irasas");
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public void pridetiIslaiduIrasa(String suma, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        try {
            float s = Float.parseFloat(suma);
            int k = Integer.parseInt(kategorija);

            IslaiduIrasas i = new IslaiduIrasas(s, k, atsiskaitymoBudas, papildomaInfo);
            pridetiIrasa(i);

            System.out.println("Pridetas irasas");
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public ArrayList<PajamuIrasas> gautiPajamuIrasus() {
        ArrayList<PajamuIrasas> list = new ArrayList<>();
        for(Irasas i : irasai) {
            if(i instanceof PajamuIrasas) {
                list.add((PajamuIrasas) i);
            }
        }
        return list;
    }

    public ArrayList<IslaiduIrasas> gautiIslaiduIrasus() {
        ArrayList<IslaiduIrasas> list = new ArrayList<>();
        for(Irasas i : irasai) {
            if(i instanceof PajamuIrasas) {
                list.add((IslaiduIrasas) i);
            }
        }
        return list;
    }

    public PajamuIrasas gautiPajamuIrasa(String id) {
        try {
            int pId = Integer.parseInt(id);
            ArrayList<PajamuIrasas> pajamos = gautiPajamuIrasus();
            for (int i = 0; i < pajamos.size(); i++) {
                if (pajamos.get(i).getId() == pId) {
                    return pajamos.get(i);
                }
            }
            System.out.println("Irasas nerastas");
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        } finally {
            return null;
        }
    }

    public IslaiduIrasas gautiIslaiduIrasa(String id) {
        try {
            ArrayList<IslaiduIrasas> islaidos = gautiIslaiduIrasus();
            int pId = Integer.parseInt(id);
            for (int i = 0; i < islaidos.size(); i++) {
                if (islaidos.get(i).getId() == pId) {
                    return islaidos.get(i);
                }
            }
            System.out.println("Irasas nerastas");
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        } finally {
            return null;
        }
    }

    public float balansas() {
        float suma = 0;
        for (PajamuIrasas p : gautiPajamuIrasus()) {
            suma += p.suma;
        }

        for (IslaiduIrasas i : gautiIslaiduIrasus()) {
            suma -= i.suma;
        }

        return suma;
    }

    public void atvaizduotiPajamuIrasus() {
        ArrayList<PajamuIrasas> pajamos = gautiPajamuIrasus();
        if(pajamos.size() == 0) {
            System.out.println("Irasu nerasta");
            return;
        }

        for(PajamuIrasas p : pajamos) {
            System.out.println(p.getId() + " - suma: " + p.suma + "; kategorija: " + p.pajamuKategorija + "; ar i banka: " + p.pozymisArIBanka);
        }
    }

    public void atvaizduotiIslaiduIrasus() {
        ArrayList<IslaiduIrasas> islaidos = gautiIslaiduIrasus();
        if(islaidos.size() == 0) {
            System.out.println("Irasu nerasta");
            return;
        }

        for(IslaiduIrasas p : islaidos) {
            System.out.println(p.getId() + " - suma: " + p.suma + "; kategorija: " + p.islaiduKategorija + "; atsiskaitymo budas: " + p.atsiskaitymoBudas);
        }
    }

    public void pasalintiPajamuIrasa(String id) {
        try {
            ArrayList<PajamuIrasas> pajamos = gautiPajamuIrasus();
            int pId = Integer.parseInt(id);
            for (int i = 0; i < pajamos.size(); i++) {
                if (pajamos.get(i).getId() == pId) {
                    pajamos.remove(i);
                    System.out.println(pId + " irasas pasalintas");
                    return;
                }
            }
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public void pasalintiIslaiduIrasa(String id) {
        try {
            ArrayList<IslaiduIrasas> islaidos = gautiIslaiduIrasus();
            int pId = Integer.parseInt(id);
            for (int i = 0; i < islaidos.size(); i++) {
                if (islaidos.get(i).getId() == pId) {
                    islaidos.remove(i);
                    System.out.println(pId + " irasas pasalintas");
                    return;
                }
            }
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public void redaguotiPajamuIrasa(Scanner sc) {
        try {
            System.out.println("Iveskite Id");
            String input = sc.next();

            PajamuIrasas item = gautiPajamuIrasa(input);
            if (item == null) return;

            input = processChange(sc, "Suma: " + item.suma);
            if (input != null) {
                item.suma = Float.parseFloat(input);
            }

            input = processChange(sc, "Kategorija: " + item.pajamuKategorija);
            if (input != null) {
                item.pajamuKategorija = Integer.parseInt(input);
            }

            input = processChange(sc, "Ar i banka: " + item.pozymisArIBanka);
            if (input != null) {
                item.pozymisArIBanka = Integer.parseInt(input) == 1;
            }

            input = processChange(sc, "Papildoma informacija: " + item.papildomaInfo);
            if (input != null) {
                item.papildomaInfo = input;
            }
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public void redaguotiIslaiduIrasa(Scanner sc) {
        try {
            System.out.println("Iveskite Id");
            String input = sc.next();

            IslaiduIrasas item = gautiIslaiduIrasa(input);
            if (item == null) return;

            input = processChange(sc, "Suma: " + item.suma);
            if (input != null) {
                item.suma = Float.parseFloat(input);
            }

            input = processChange(sc, "Kategorija: " + item.islaiduKategorija);
            if (input != null) {
                item.islaiduKategorija = Integer.parseInt(input);
            }

            input = processChange(sc, "Ar i banka: " + item.atsiskaitymoBudas);
            if (input != null) {
                item.atsiskaitymoBudas = input;
            }

            input = processChange(sc, "Papildoma informacija: " + item.papildomaInfo);
            if (input != null) {
                item.papildomaInfo = input;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    private String processChange(Scanner sc, String message) {
        System.out.println(message + " [1] – redaguoti, [2] – toliau.");
        String input = sc.next();
        if (input.compareTo("1") == 0) {
            System.out.println("Įveskite naują reikšmę.");
            input = sc.next();
            return input;
        }
        return null;
    }

    private void atnaujintiIrasa(Irasas irasas) {
        for (int i = 0; i < irasai.size(); i++) {
            if(irasai.get(i).equals(irasas)) {
                irasai.set(i, irasas);
            }
        }
    }
}
