package hr.filip.cecelja.interview;

public class Task2 {
	
	public static void main(String[] args) {
		
		int length  = 9;
		int n2 = 1;
		int n3 = length;
			
		for(int i = 0; i < length; i++) {
			for (int j = 1; j < length + length - 1; j++) {
				if (j == n3) {					
					for (int k = 1; k <= n2; k++) {
						if (n3 == length) {
							System.out.print(n3);
						} else {
							if (k == n2) {
								System.out.format("%d", n3);
							} else System.out.format("%d,", n3);							
						}
					}	
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			n2++;
			n3--;
		}
		
	}

}
