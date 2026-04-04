
public enum TipCaz {
 Cultural("Cultural"),
  Social("Social"),
Infrastructural("Infrastructural");
	
private String desc;


private TipCaz(String string) {
this.desc=string;
}

public String getDesc() {
	return this.desc;
}
		  
}
