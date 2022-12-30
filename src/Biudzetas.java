public class Biudzetas {
    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private int pajamuIndex = 0;
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    private int islaiduIndex = 0;

    public void pridetiPajamuIrasa(String suma) {
        float s = Float.parseFloat(suma);
        pajamos[pajamuIndex] = new PajamuIrasas();
        pajamos[pajamuIndex].suma = s;
        pajamuIndex++;
    }

    public void pridetiIslaiduIrasa(String suma) {
        float s = Float.parseFloat(suma);
        islaidos[islaiduIndex] = new IslaiduIrasas();
        islaidos[islaiduIndex].suma = s;
        islaiduIndex++;
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
