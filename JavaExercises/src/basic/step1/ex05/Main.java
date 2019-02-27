package basic.step1.ex05;

public class Main {

	public static void main(String[] args) {
		int N = 7;
		
		printStar(N);
	}
	
	public static void printStar(int N) {
		//---------------------------------------
		// TODO : Write code below
		
		// 라인수=별수, 빈칸수는 전체수-라인수. 한번 루프 돌릴때 x 번째일때 별을 찍기 시작. 
		for(int x=N; x>0; x--) {
			String line = "";
			for(int y=1; y<=N; y++) {
				
				if(y>=x) {
					line+="*";
				}else {
					line+=" ";
				}
				
			}
			System.out.println(line);
		}
		
		
		//---------------------------------------
	}

}
