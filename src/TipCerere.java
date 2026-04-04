
public enum TipCerere {
Respinsa("Respins"),
Neevaluat("Neevaluat"),
Aprobata("Aprobata");

private String desc;

private TipCerere(String desc) {
	this.desc=desc;
}

public String getDesc() {
	return this.desc;
}
}
