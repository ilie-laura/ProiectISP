
public class Evaluator {
private String parola;
private String username;
private Integer nrCereri=0;


public Evaluator(String p,String u) {
	this.parola=p;
	this.username=u;
}

public void afisare() {
	System.out.println("Detalii Evaluator");
	System.out.println("Username:"+username);
	System.out.println("Nr. Cereri:"+nrCereri);
	
}
public TipCerere evaluareCerere(Cerere c) {
	//primeste cerere si conform unor param
	//returneaza tip cerere-->
	if(c.getSuma()>0)
	return TipCerere.Aprobata;
	else return TipCerere.Respinsa;
}
}
