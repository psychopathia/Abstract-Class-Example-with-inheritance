
public class Daire extends Sekil {
	
	int yar�Cap;
	
	
	public Daire(String isim,int yar�Cap) {
		super(isim);
		this.yar�Cap=yar�Cap;
}

	@Override
	void alanHesapla() {
		System.out.println(getIsim()+" alan�: "+(yar�Cap*yar�Cap*3) );
	}
	
}
