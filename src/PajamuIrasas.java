import java.time.LocalDateTime;

public class PajamuIrasas extends Irasas {
    String pajamuKategorija;
    boolean pozymisArIBanka;
    PajamuIrasas(float sum, String kat, boolean pozymis, String info) {
        super(sum, info);
        pajamuKategorija = kat;
        pozymisArIBanka = pozymis;
    }
    @Override
    public String toString() {
        return  "Id=" + getId() +
                ", pajamuKategorija=" + pajamuKategorija +
                ", ar i banka='" + pozymisArIBanka + '\'' +
                ", suma=" + suma +
                ", data=" + data +
                ", papildomaInfo='" + papildomaInfo + '\'';
    }

    String getDisplayString() {
        return this.data + "; suma: " + this.suma + "; kategorija: " + this.pajamuKategorija + "; ar i banka: " + this.pozymisArIBanka + "; papildoma informacija: " + this.papildomaInfo;
    }
}
