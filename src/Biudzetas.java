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
        if(i > 100 || pajamos[i] == null) {
            System.out.println("Irasas nerastas");
            return;
        }
        System.out.println("suma: " + pajamos[i].suma + "; kategorija: " + pajamos[i].kategorija + "; ar i banka: " + pajamos[i].pozymisArIBanka + "; papildoma informacija: " + pajamos[i].papildomaInfo);
    }

    public void gautiIslaiduIrasa(String index) {
        int i = Integer.parseInt(index);
        if(i > 100 || islaidos[i] == null) {
            System.out.println("Irasas nerastas");
            return;
        }
        System.out.println("suma: " + islaidos[i].suma + "; kategorija: " + islaidos[i].kategorija + "; atsiskaitymo budas: " + islaidos[i].atsiskaitymoBudas + "; papildoma informacija: " + islaidos[i].papildomaInfo);
    }
}
