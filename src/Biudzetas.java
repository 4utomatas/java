public class Biudzetas {
    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private int pajamuIndex = 0;
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    private int islaiduIndex = 0;

    public void pridetiPajamuIrasa(String suma, String kategorija, String arIBanka, String papildomaInfo) {
        float s = Float.parseFloat(suma);
        int arIB = Integer.parseInt(arIBanka);
        boolean b = arIB == 1;
        pajamos[pajamuIndex] = new PajamuIrasas(s, kategorija, b, papildomaInfo);
        pajamuIndex++;
        System.out.println("Pridetas irasas");
    }

    public void pridetiIslaiduIrasa(String suma, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        float s = Float.parseFloat(suma);
        islaidos[islaiduIndex] = new IslaiduIrasas(s, kategorija, atsiskaitymoBudas, papildomaInfo);
        islaiduIndex++;
        System.out.println("Pridetas irasas");
    }

    public void gautiPajamuIrasa(String index) {
        int i = Integer.parseInt(index);
        if(pajamos[i] == null) {
            System.out.println("Irasas nerastas");
            return;
        }
        System.out.println("Pajamos yra: " + pajamos[i].suma);
    }

    public void gautiIslaiduIrasa(String index) {
        int i = Integer.parseInt(index);
        if(islaidos[i] == null) {
            System.out.println("Irasas nerastas");
            return;
        }
        System.out.println("Islaidos yra: " + islaidos[i].suma);
    }
}
