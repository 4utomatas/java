import java.time.LocalDateTime;

public class PajamuIrasas {
    int id = 0;
    static int counter = 0;
    float suma;
    int kategorija;
    LocalDateTime data;
    boolean pozymisArIBanka;
    String papildomaInfo;

    PajamuIrasas() {
        counter++;
        id = counter;
        data = LocalDateTime.now();
    }
}
