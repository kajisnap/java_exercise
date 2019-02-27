package addex;

public class Slash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5;
		
		//대각선 사선만들기. 각 라인에 해당하는 공간에만 별을 찍기. x=y 일때.
		
		for(int x=0; x<N; x++) {
			String line="";
			for(int y=0; y<=x; y++) {
				if(x==y) {
					line+="*";
					}
				else {
					line+=" ";
				}
			}
			System.out.println(line);
		}
		
		

	}

}
