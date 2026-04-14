package modele;

public class Beneficiar extends Donator{
private String IBAN;
private TipCaz tipCaz;
private Integer IDCerere;
private String Nume;

private Cerere cerere;

public Beneficiar(String n,String ib,Integer id,TipCaz tc) {
    super();
	this.IBAN=ib;
	this.Nume=n;
	this.IDCerere=id;
	this.tipCaz=tc;
}

public void afisare() {
System.out.println("Date Beneficiar:");
System.out.println("Nume : "+Nume);
System.out.println("IBAN: "+IBAN);
System.out.println("Tip caz:"+tipCaz.getDesc());
System.out.println("ID cerere: "+IDCerere);

System.out.println("Cerere ");
cerere.afisare();

}
private void contestatie() {
	//trimite mai departe sau ceva la evaluator
	
}
private void creareCerere() {
	//apelare constructor cerere prin array list maybe?!
}
}
