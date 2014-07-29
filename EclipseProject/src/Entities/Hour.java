package Entities;

public class Hour {
	
	public final String[] days = new String[]{"Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
	
	public int day;
	
	
	public Hour(String s) {
		day = Character.getNumericValue(s.charAt(0));
		
	}
	
}
