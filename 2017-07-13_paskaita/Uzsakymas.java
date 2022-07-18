import java.util.ArrayList;

public class Uzsakymas {
	
	String UzsakymoNr;
	ArrayList<Pica> Picos;
	
	
	public Integer skaiciuotiUzsakymoSuma () throws Exception {
		
		Integer suma = 0;
		
		if(Picos.isEmpty()) {
			throw new NullPointerException ("Uzsakymas tuscia");
		}else {
		
		for(int i = 0; i < Picos.size(); i++) {
			suma += Picos.get(i).skaiciuotiKaina();
		}
		}
		
		return suma;
	}

	
	
	
	public Uzsakymas(String uzsakymoNr, ArrayList<Pica> picos) {
		super();
		UzsakymoNr = uzsakymoNr;
		Picos = picos;
	}




	public String getUzsakymoNr() {
		return UzsakymoNr;
	}


	public void setUzsakymoNr(String uzsakymoNr) {
		UzsakymoNr = uzsakymoNr;
	}


	public ArrayList<Pica> getPicos() {
		return Picos;
	}


	public void setPicos(ArrayList<Pica> picos) {
		Picos = picos;
	}

}
