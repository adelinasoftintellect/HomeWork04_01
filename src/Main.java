public class Main {

	public static void main(String[] args) {

		int[][] a = new int[4][4];
		int c = 0;
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				a[i][j] = c++;
			}
		}
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				if (a[i][j] % 2 == 0) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("The sum is: " + sum);
	}
}