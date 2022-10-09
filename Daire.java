
public class Daire extends Sekil {
	
	int yarıCap;
	
	
	public Daire(String isim,int yarıCap) {
		super(isim);
		this.yarıCap=yarıCap;
}

	@Override
	void alanHesapla() {
		System.out.println(getIsim()+" alanı: "+(yarıCap*yarıCap*3) );
	}
	
}
