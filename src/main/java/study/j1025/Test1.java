package study.j1025;

public class Test1 {
	public static void main(String[] args) {
		int i=0, tot=0;
		
		while(1<100) {
			i++; // i가 99가 될 때까지 누적
			tot += i; 
			System.out.println("1~100까지의 합은? "+tot+" 입니다.");
		}
		
	}
}
