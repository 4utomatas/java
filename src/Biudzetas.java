import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
    private ArrayList<Irasas> irasai = new ArrayList<>();

    public ArrayList<Irasas> getIrasai() {
        return irasai;
    }

    public void setIrasai(ArrayList<Irasas> list) {
        irasai = list;
    }

    public void pridetiIrasa(Irasas irasas) {
        irasai.add(irasas);
    }

    public void pridetiPajamuIrasa(Scanner sc) {
        try {
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
            pridetiIrasa(p);

            System.out.println("Pridetas irasas");
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public void pridetiIslaiduIrasa(Scanner sc) {
        try {
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
            if(i instanceof IslaiduIrasas) {
                list.add((IslaiduIrasas) i);
            }
        }
        return list;
    }

    public void atvaizduotiPajamuIrasa(Scanner sc) {
        PajamuIrasas irasas = gautiPajamuIrasa(sc);
        if (irasas != null) System.out.println(irasas.getDisplayString());
    }

    public PajamuIrasas gautiPajamuIrasa(Scanner sc) {
        try {
            System.out.println("Iveskite id");
            String id = sc.next();
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
        }
        return null;
    }

    public void atvaizduotiIslaiduIrasa(Scanner sc) {
        IslaiduIrasas irasas = gautiIslaiduIrasa(sc);
        if (irasas != null) System.out.println(irasas.getDisplayString());
    }

    public IslaiduIrasas gautiIslaiduIrasa(Scanner sc) {
        try {
            System.out.println("Iveskite id");
            String id = sc.next();
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
        }
        return null;
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
            System.out.println(p.getDisplayString());
        }
    }

    public void atvaizduotiIslaiduIrasus() {
        ArrayList<IslaiduIrasas> islaidos = gautiIslaiduIrasus();
        if(islaidos.size() == 0) {
            System.out.println("Irasu nerasta");
            return;
        }

        for(IslaiduIrasas p : islaidos) {
            System.out.println(p.getDisplayString());
        }
    }

    public void pasalintiPajamuIrasa(Scanner sc) {
        try {
            System.out.println("Iveskite id");
            String id = sc.next();
            int pId = Integer.parseInt(id);
            for (int i = 0; i < irasai.size(); i++) {
                if (irasai.get(i).getId() == pId) {
                    irasai.remove(i);
                    System.out.println(pId + " irasas pasalintas");
                    return;
                }
            }
        } catch(NumberFormatException nfe) {
            System.out.println("Klaida! Ivestas ne skaicius!");
        }
    }

    public void pasalintiIslaiduIrasa(Scanner sc) {
        try {
            System.out.println("Iveskite id");
            String id = sc.next();
            int pId = Integer.parseInt(id);
            for (int i = 0; i < irasai.size(); i++) {
                if (irasai.get(i).getId() == pId) {
                    irasai.remove(i);
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
            PajamuIrasas item = gautiPajamuIrasa(sc);
            if (item == null) return;

            String input = processChange(sc, "Suma: " + item.suma);
            if (input != null) {
                item.suma = Float.parseFloat(input);
            }

            input = processChange(sc, "Kategorija: " + item.pajamuKategorija);
            if (input != null) {
                item.pajamuKategorija = input;
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
            IslaiduIrasas item = gautiIslaiduIrasa(sc);
            if (item == null) return;

            String input = processChange(sc, "Suma: " + item.suma);
            if (input != null) {
                item.suma = Float.parseFloat(input);
            }

            input = processChange(sc, "Kategorija: " + item.islaiduKategorija);
            if (input != null) {
                item.islaiduKategorija = input;
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
