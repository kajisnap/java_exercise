package basic.step1.ex03;

public class Main {

	public static void main(String[] args) {
		int N = 7;
		
		printStar(N);
	}
	
	public static void printStar(int N) {
		//---------------------------------------
		// TODO : Write code below
		
		for(int x=0; x<N; x++) {
			String line="";
			for(int y=0; y<=x; y++) {
				line += "*";
			}
			System.out.println(line);
		}

		
		//---------------------------------------
	}

}
