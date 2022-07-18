
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public Integer calculator (Integer a, Character sign, Integer b) throws Exception {
		
		Integer result = null;
		
		
		if(sign == '+') {
			result = a + b;
		}else if (sign == '-') {
			result = a-b;
		}else if(sign == '*') {
			result = a*b;
		}else if (sign == '/') {
			if(a == 0 || b ==0) {
				throw new Exception ("Dalyba is 0 negalima");
			}
			result = a/b;
		}
		
		
		return result;
		
	}
	
	public Integer calculator2 (String row) {
		
		
		String numberRow[] = row.split("\\*|\\/|\\+|\\-");
		String operatorRow []= row.split("[0-9()]+");
		
		int total = Integer.parseInt(numberRow[0]);
		
		for(int i = 1; i < operatorRow.length; i++) {
			switch(operatorRow[i]) {
			case "+" :
				total += Integer.parseInt(numberRow[i]);
				break;
			case "-" :
				total -= Integer.parseInt(numberRow[i]);
				break;
			case "*" :
				total *= Integer.parseInt(numberRow[i]);
				break;
			case "/" :
				total /= Integer.parseInt(numberRow[i]);
				break;
			}
		if(i+2 >= operatorRow.length) continue; 
			numberRow[i+1] = String.valueOf(total);

		}
		
		return total;
		
	}
	
	public Integer countWords(String text) {
		
		
		
		return text.split(" ").length;
	}

}
