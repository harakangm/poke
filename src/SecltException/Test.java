package SecltException;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			test(1);
		} catch (StException e) {
			System.out.println("체크");
		}
	}
	
	public static void test(int put2) throws StException{
		if( put2 > 4 || put2 <0) {
			throw new StException("스타팅 중에서 선택해주세요");			
		}else {
			System.out.println("테스트확인");
		}
				
	}
	
}
