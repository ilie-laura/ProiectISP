
public class Cerere {
private Integer suma;
private String numeBeneficiar;
private TipCerere tipCerere;
private Integer IDCerere;
private String descriere;
private TipCaz tipCaz;

//

public Cerere(Integer s,String nb,TipCerere tc,Integer id,String desc,TipCaz tcz) {
	this.suma=s;
	this.descriere=desc;
	this.IDCerere=id;
	this.numeBeneficiar=nb;
	this.tipCaz=tcz;
	this.tipCerere=tc;
}
public void afisare() {
	System.out.println("Detalii Cerere:");
	System.out.println("Tip cerere:"+tipCerere.getDesc());
	System.out.println("Tip caz:"+tipCaz.getDesc());
	System.out.println("Descriere:"+descriere);
	System.out.println("Suma :"+suma);
	System.out.println("Nume Beneficiar:"+numeBeneficiar);
	System.out.println("ID:"+IDCerere);

	
}

public Integer getSuma() {
	return suma;
}
public TipCaz getCaz() {
	return tipCaz;
}
public TipCerere getCerere() {
	return tipCerere;
}
}
