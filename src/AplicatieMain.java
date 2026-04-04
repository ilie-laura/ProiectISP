import java.util.ArrayList;
import java.util.List;

public class AplicatieMain {
public static void main(String[] args) {
	List<Cerere> listaCereri = new ArrayList<>();
	listaCereri.add(new Cerere(
            5000, 
            "Asociatia Speranta", 
            TipCerere.Aprobata, 
            101, 
            "Reabilitare scoala rurala", 
            TipCaz.Infrastructural
        ));

        listaCereri.add(new Cerere(
            2500, 
            "Andrei Ionescu", 
            TipCerere.Aprobata, 
            102, 
            "Bursa pentru studii muzicale", 
            TipCaz.Cultural
        ));

        listaCereri.add(new Cerere(
            10000, 
            "Familia Popa", 
            TipCerere.Aprobata, 
            103, 
            "Ajutor reconstructie casa incendiu", 
            TipCaz.Social
        ));

        Donator d1 = new Donator("Ionescu", "Mihai", "RO99BTRL00001111", 7000);


        d1.alegeCaz(listaCereri);

        System.out.println("\n--- Raport Final ---");
        d1.afisareCazuriSustinute();
	
}
}
