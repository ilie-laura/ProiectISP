import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Donator {
private String nume;
private String prenume;
private String IBAN;
//in plus
private Integer venit;
private List<Donatie> donatii = new ArrayList<>();

public Donator ( String n,String p,String i,Integer v) {
	nume=n;
	prenume=p;
	IBAN=i;
	venit=v;
}
public Donator() {
	
}
public void afisare() {
	System.out.println("Date Donator:\n");
	System.out.println("Nume si Prenume : "+nume+" "+prenume+"\n");
	System.out.println("IBAN: "+IBAN);
	System.out.println("Venit: "+venit);
}
public Donator IntroducereDate() {
	try (Scanner sc = new Scanner(System.in)) {
		String n,p,i;
		Integer v;
		System.out.println("Introduceti noile date: \n");
		System.out.println("Nume Donator:\n");
		n=sc.nextLine();
		System.out.println("Prenume Donator:\n");
		p=sc.nextLine();
		System.out.println("IBAN Donator:\n");
		i=sc.nextLine();
		System.out.println("Venit:");
		v=sc.nextInt();
		Donator d=new Donator(n,p,i,v);
		return d;
	}
}public void alegeCaz(List<Cerere> cereri) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Selectati categoria:");
    TipCaz[] categorii = TipCaz.values();
    for (int i = 0; i < categorii.length; i++) {
        System.out.println(i + ". " + categorii[i]);
    }
    
    int optiuneCat = sc.nextInt();
    TipCaz categorieSelectata = categorii[optiuneCat];

    List<Cerere> filtrate = new ArrayList<>();
    for (Cerere c : cereri) {
        if (c.getCaz() == categorieSelectata) {
            filtrate.add(c);
        }
    }

    if (filtrate.isEmpty()) {
        System.out.println("Nu sunt cazuri disponibile.");
        return;
    }

    System.out.println("Cazuri din categoria " + categorieSelectata + ":");
    for (int i = 0; i < filtrate.size(); i++) {
        System.out.print(i + ". ");
        filtrate.get(i).afisare();
    }

    System.out.print("Selectati indexul cazului: ");
    int indexCaz = sc.nextInt();

    if (indexCaz >= 0 && indexCaz < filtrate.size()) {
        System.out.print("Suma donata: ");
        int suma = sc.nextInt();

        Donatie d = new Donatie(suma, this, filtrate.get(indexCaz));
        donatii.add(d);
        System.out.println("Donatie realizata!");
    }
}
public void afisareCazuriSustinute() {
    System.out.println("Donatorul " + nume + " a susținut:");
    for (Donatie d : donatii) {
   
        System.out.println("- " + d.getCerere().getCaz() + " | Sumă: " + d.getSuma());
    }
}
}
