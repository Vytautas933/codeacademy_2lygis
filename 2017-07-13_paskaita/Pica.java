
public class Pica {
	
	Dydziai dydziai;
	Integer suriai;
	Integer peperoni;
	
	
	
	public Pica(Dydziai dydziai, Integer suriai, Integer peperoni) {
		super();
		this.dydziai = dydziai;
		this.suriai = suriai;
		this.peperoni = peperoni;
	}
	
	
	public Integer skaiciuotiKaina() {
		
		Integer kaina = 0;
		
		if(dydziai.equals(dydziai.MAZAS)) {
			kaina += 11;
		}else if(dydziai.equals(dydziai.VIDUTINIS)){
			kaina += 12;
		}else if (dydziai.equals(dydziai.DIDELIS)) {
			kaina += 14;
		
		}else {
			return null;
		}
		
		kaina += suriai*2;
		kaina += peperoni * 2;
		
		
		return kaina;
	}
	



	public Dydziai getDydziai() {
		return dydziai;
	}



	public void setDydziai(Dydziai dydziai) {
		this.dydziai = dydziai;
	}



	public Integer getSuriai() {
		return suriai;
	}



	public void setSuriai(Integer suriai) {
		this.suriai = suriai;
	}



	public Integer getPeperoni() {
		return peperoni;
	}



	public void setPeperoni(Integer peperoni) {
		this.peperoni = peperoni;
	}
	
	
	
	

}
