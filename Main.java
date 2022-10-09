
public class Main {

	public static void main(String[] args) {
		Sekil kare = new Kare("Ahmet",4);
		Daire daire = new Daire("kenan",3);
		
		System.out.println(daire.getIsim());
		kare.alanHesapla();
		daire.alanHesapla();
		
	}

}
