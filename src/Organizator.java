
public class Organizator {
private String parola;
private Integer nrPublicari=0;
private String username;

public Organizator(String p,String u) {
	this.parola=p;
	this.username=u;
}

public void afisare() {
	System.out.println("Detalii Organizator");
	System.out.println("Username : "+username);
	System.out.println("Nr. Publicari : "+nrPublicari);
	
}

public void crearePagina() {
	
}
public void verificareTipCerere() {
	
}
public void stergerePagina() {
}

}
