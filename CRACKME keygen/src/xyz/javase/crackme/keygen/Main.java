package xyz.javase.crackme.keygen;

public class Main {

	public static void main(String[] args) {
	  final StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= (10101-3); i++) {
			
			if(i == 10000) {
				sb.append("#");
			} else {
				sb.append("1");
			}
				
			
		}
		System.out.println("Key is: \n" +sb);
	}
	
}
