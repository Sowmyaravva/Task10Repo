package task10;

public class Task10seventhprogram {

	public static void main(String[] args) {
		 Tea2[] teas = new Tea2[3];
	        teas[0] = new BlackTea2();
	        teas[1] = new GreenTea2();
	        teas[2] = new HerbalTea2();

	        for (Tea2 tea : teas) {
	            tea.prepareTea();
	        }


	}

}
