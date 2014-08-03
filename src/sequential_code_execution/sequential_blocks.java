package sequential_code_execution;

public class sequential_blocks {

	public void test1(){
		int i = 0;
	}
	
	public void test2(){
		
		int i = 0;
	}
	
	public void test3(){
		int i = 0;
		int k = 0;
	}
	
	public void test4(){
		int master = 0;
		int tester = 0;
	}
	
	public void test5(){
		int i = 0;
		
		switch (i) {
		case 0:
			int k = 0;
			break;

		case 1:
			i = 0;
			break;

		case 3:
			i = 2;
			break;

		default:
			break;
		}
	}
}
