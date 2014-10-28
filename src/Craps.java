
public class Craps {

       public static final boolean WIN = true;
       public static final boolean LOSE = false;
	
	
	static boolean craps(int[] rolls){
		
		if(rolls.length == 0){
			return LOSE;
		}
		else if (rolls[0] == 7 || rolls[0] == 11){
			return WIN;
		}
		else if(rolls[0] == 2 || rolls[0] == 3 || rolls[0] == 12){
			return LOSE;	
		}
		else{
			int point = rolls[0];
			for(int i = 1; i < rolls.length; i++){
				if(rolls[i] == point){
					return WIN;
				}
				else if(rolls[i] == 7){
					return LOSE;
				}
			}
			return LOSE;
		}
	}
	
}