
public class Craps {

	
	
	static boolean craps(int[] rolls){
		
		if(rolls.length == 0){
			return false;
		}
		else if (rolls[0] == 7 || rolls[0] == 11){
			return true;
		}
		else if(rolls[0] == 2 || rolls[0] == 3 || rolls[0] == 12){
			return false;	
		}
		else{
			int point = rolls[0];
			for(int i = 1; i < rolls.length; i++){
				if(rolls[i] == point){
					return true;
				}
				else if(rolls[i] == 7){
					return false;
				}
			}
			return false;
		}
	}
	
}