package com.topic3.p1;

public class Amount {

	

	public Amount() {
		
	}

	public int length(int number) {
		String num = Integer.toString(number);
		return num.length();
	}
	
	public String convert(int number) {
		
		if (number != 0) {
			String num = Integer.toString(number);
			
			if (length(number) == 4){
				int number0 = Integer.parseInt(num.charAt(0)+"");
				number = number - 1000*number0;			
				return NumberAmount.valueOf(number0)+" thousand "+ convert(number);
				
			}
			
			if (length(number) == 3){
				int number0 = Integer.parseInt(num.charAt(0)+"");
				number = number - 100*number0 ; 			
				return NumberAmount.valueOf(number0)+" hundred "+ convert(number);
				
			}
			
			if (number >= 20){
				int number0 = Integer.parseInt(num.charAt(0)+""+0);
				number = number - number0;		
				return NumberAmount.valueOf(number0)+ "-"  + convert(number);
			}
			else
				return NumberAmount.valueOf(number) ;
		
		}
		else
			return "";
		
	}
	
	
	public String convertNumber(double d) {
		String num = Double.toString(d);
		
		
		String[] parts = num.split("\\.");
		String integer = parts[0];
		String doble = parts[1];
		
		int in = Integer.parseInt(integer);
				
		return convert(in)+" "+doble+"/100 dollars";
	}
	
	
	public enum NumberAmount{
		
		one(1), two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10),
		eleven(11), twelve(12), thirteen(13), fourteen(14), fifteen(15), sixteen(16), seventeen(17),
		eighteen(18), nineteen(19), twenty(20), thirty(30), forty(40), fifty(50), sixty(60), seventy(70), 
		eighty(80), ninety(90);
		
		private final int num;
		
		NumberAmount(int number){
			this.num = number;
		}

		public static String valueOf(int number) {
			NumberAmount[] values = NumberAmount.values();
			for(NumberAmount aux : values){
				if (aux.num == number){
					return aux.name();
				}
			}
			return null;
		}

	}

		
}
