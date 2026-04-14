package modele;

public class Donatie {
private Integer suma;
private Donator donator;
private Cerere cerere;

public Donatie(Integer s,Donator d,Cerere c) {
	suma=s;
	donator=d;
	cerere=c;
}


public void afisare() {
	System.out.println("Detalii Donatie");
	System.out.println("Suma donata:"+suma);
	System.out.println("Donator: ");
	donator.afisare();
	System.out.println("Cerere: ");
	cerere.afisare();
}

public Integer getSuma() {
	return suma;
}
public Cerere getCerere() {
	return cerere;
}
}
