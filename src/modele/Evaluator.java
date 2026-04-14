package modele;
import java.util.ArrayList;
import java.util.List;

public class Evaluator {
private String parola;
private String username;
private Integer nrCereri=0;

private List<Cerere> cereri=new ArrayList<>();
//impl metode

public Evaluator(String p,String u) {
	this.parola=p;
	this.username=u;
}

public void afisare() {
	System.out.println("Detalii Evaluator");
	System.out.println("Username:"+username);
	System.out.println("Nr. Cereri:"+nrCereri);
	for(int i=0;i<cereri.size();i++) {
		System.out.println("Cererea "+i);
		cereri.get(i).afisare();
		
	}
	
}
public TipCerere evaluareCerere(Cerere c) {
	//primeste cerere si conform unor param
	//returneaza tip cerere-->
	if(c.getSuma()>0)
	return TipCerere.Aprobata;
	else return TipCerere.Respinsa;
}
}
