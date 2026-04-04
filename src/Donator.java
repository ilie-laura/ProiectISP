import java.util.Scanner;

public class Donator {
private String nume;
private String prenume;
private String IBAN;

public Donator ( String n,String p,String i) {
	nume=n;
	prenume=p;
	IBAN=i;
}
public Donator() {
	
}
public void afisare() {
	System.out.println("Date Donator:\n");
	System.out.print("Nume si Prenume : "+nume+" "+prenume+"\n");
	System.out.print("IBAN: "+IBAN);
}

public void IntroducereDate() {
	try (Scanner sc = new Scanner(System.in)) {
		String n,p,i;
		System.out.println("Introduceti noile date: \n");
		System.out.println("Nume Donator:\n");
		n=sc.nextLine();
		System.out.println("Prenume Donator:\n");
		p=sc.nextLine();
		System.out.println("IBAN Donator:\n");
		i=sc.nextLine();
		//to add metoda de aduahe--maybe array cu donatori?
	}
}
public void alegeCaz() {
	System.out.println("Alegeti cazul: ");
	//afisare cazuri si selcatre prin id??
	System.out.println("Caz ales! ");
}

}
