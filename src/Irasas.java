import java.time.LocalDateTime;

public class Irasas {
    private int id = 0;
    private static int counter = 0;
    float suma;
    LocalDateTime data;
    String papildomaInfo;
    Irasas(float sum, String info) {
        counter++;
        id = counter;
        data = LocalDateTime.now();

        suma = sum;
        papildomaInfo = info;
    }

    Irasas(float sum, String info, LocalDateTime dateTime) {
        counter++;
        id = counter;
        data = dateTime;
        suma = sum;
        papildomaInfo = info;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Irasas)) {
            return false;
        }
        Irasas temp = (Irasas) obj;
        return getId() == temp.getId();
    }
}
