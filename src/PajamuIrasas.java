import java.time.LocalDateTime;

public class PajamuIrasas extends Irasas {
    int pajamuKategorija;
    boolean pozymisArIBanka;
    PajamuIrasas(float sum, int kat, boolean pozymis, String info) {
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
}
