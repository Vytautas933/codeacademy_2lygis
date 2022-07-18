
public class FirstTask {
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(uzduotis(7));
		
		
	}

	
	public static String uzduotis (Integer skaicius) {
		
		String menesis = "";
		
		
		if (skaicius < 0 || skaicius > 12) {
			return "netinkamas skaicius";
		}else if (skaicius % 2 == 0) {
			switch (skaicius) {

            case 2:
                menesis = "Vasaris";
                break;
            case 4:
                menesis = "Balandis";
                break;
            case 6:
                menesis = "Birzelis";
                break;
            case 8:
                menesis = "Rugpjutis";
                break;
            case 10:
                menesis = "Spalis";
                break;
            case 12:
                menesis = "Gruodis";
                break;
            default:
                menesis = "Nera toko menesio";
                break;
        }
		}else {
			switch (skaicius) {

            case 1:
                menesis = "Sausis";
                break;
            case 3:
                menesis = "Kovas";
                break;
            case 5:
                menesis = "Geguze";
                break;
            case 7:
                menesis = "Liepa";
                break;
            case 9:
                menesis = "Rugsejis";
                break;
            case 11:
                menesis = "Lapkritis";
                break;
            default:
                menesis = "Nera toko menesio";
                break;
        }
		}
		
		
		
		return menesis;
		
	}
}
