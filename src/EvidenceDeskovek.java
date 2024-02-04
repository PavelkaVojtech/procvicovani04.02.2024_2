import java.util.ArrayList;
import java.util.List;

public class EvidenceDeskovek {
    private List<Deskovka> seznamDeskovek = new ArrayList<>();

    public EvidenceDeskovek() {
        Deskovka deskovka1 = new Deskovka("Šachy", true, 3);
        seznamDeskovek.add(deskovka1);
        seznamDeskovek.add(new Deskovka("Človecenezlobse", false, 2));
        seznamDeskovek.add(new Deskovka("uz nevim", false, 1));
    }

    public Deskovka vratDeskovku(int index) {
        return seznamDeskovek.get(index);
    }

}
