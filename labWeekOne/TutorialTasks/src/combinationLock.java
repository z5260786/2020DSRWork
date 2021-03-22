import java.util.Scanner;


public class combinationLock {
	Scanner scan = new Scanner(System.in);
	
	private int[] combo = new int[3];
	private int[] test = new int[3];
	
	public combinationLock() {
		combo = new int[]{0, 6, 0};
	}
	
	public boolean Open() {
		
		System.out.println("Enter the three digit combination code:");
		int temp = scan.nextInt();
		boolean stat = false;

		if(String.valueOf(temp).length() > 3) {
			System.out.print("Invalid combination length");
			return false;
		} else {
			if(String.valueOf(temp).length() == 2) {
				test[0] = 0;
				for(int i = test.length-1; i > 0; i--) {
					test[i] = temp % 10;
					temp = temp / 10;
				}
			} else if(String.valueOf(temp).length() == 1) {
				test[0] = 0;
				test[1] = 0;
				test[2] = temp % 10;
				temp = temp % 10;
			} else if(String.valueOf(temp).length() == 0) {
				for(int i = 0; i < test.length; i++) {
					test[i] = 0;
				}
			} else {
				for(int i = test.length-1; i > 0; i--) {
					test[i] = temp % 10;
					temp = temp % 10;
				}
			}
			for(int i = 0; i < test.length; i++) {
				if(test[i] == combo[i]){
					stat = true;
				} else {
					stat = false;
					break;
				}
			}
			
			if(stat) {
				System.out.println("yes");
				return true;
			} else {
				System.out.println("no");
				return false;
			}
		}
		
		
	}

	public boolean changeCombo() {
		System.out.println("--Running change combination--");
		
		if(Open()) {
			System.out.println("Enter the new three digit combination code:");
			int temp = scan.nextInt();

			if(String.valueOf(temp).length() > 3) {
				System.out.print("Invalid combination length");
				return false;
			} else {
				if(String.valueOf(temp).length() == 2) {
					test[0] = 0;
					for(int i = test.length-1; i > 0; i--) {
						test[i] = temp % 10;
						temp = temp / 10;
					}
				} else if(String.valueOf(temp).length() == 1) {
					test[0] = 0;
					test[1] = 0;
					test[2] = temp % 10;
					temp = temp % 10;
				} else if(String.valueOf(temp).length() == 0) {
					for(int i = 0; i < test.length; i++) {
						test[i] = 0;
					}
				} else {
					for(int i = test.length; i > 0; i--) {
						test[i] = temp % 10;
						temp = temp % 10;
					}
				}
				for(int i = 0; i < test.length; i++) {
					combo[i] = test[i];
				}
			}
			
			return true;
		} else {
			System.out.println("Incorrect combination");
			return false;
		}
	}
	public static void main(String[] args) {
		combinationLock loc = new combinationLock();
		
		loc.Open();
		loc.changeCombo();
		loc.Open();
	}
}
