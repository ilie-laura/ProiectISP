package modele;
import java.util.ArrayList;
import java.util.List;

public class Organizator {
private String parola;
private Integer nrPublicari=0;
private String username;

private List<Cerere> cereri=new ArrayList<>();

public Organizator(String p,String u) {
	this.parola=p;
	this.username=u;
}

public void afisare() {
	System.out.println("Detalii Organizator");
	System.out.println("Username : "+username);
	System.out.println("Nr. Publicari : "+nrPublicari);
	
	for(int i=0;i<cereri.size();i++) {
		System.out.println("Cererea "+i);
		cereri.get(i).afisare();
		
	}
	
}

public void crearePagina() {
	
}
public void verificareTipCerere() {
	
}
public void stergerePagina() {
}

}
