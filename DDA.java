import java.util.Scanner;

public class DDA {

public static void main(String[] args) {
	
		int [][] matriz = new int[11][11];
		
		int step;
		float X,Y, Xinc, Yinc;
		int X2, X1, Y2, Y1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quais são os valores de X1, X2, Y1 e Y2?");
		
		X1 = s.nextInt();
		X2 = s.nextInt();
		Y1 = s.nextInt();
		Y2 = s.nextInt();
		
		s.close();
		
		step = Math.max(Math.abs(Y2-Y1), Math.abs(X2-X1));
		Xinc = (X2-X1)/step;
		Yinc = (Y2-Y1)/step;
		X = X1;
		Y = X2;
		while(X < X2) {
			X = X + Xinc;
			Y = Y + Yinc;
		}
		
		System.out.println(X + " e " + Y);
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				if(l == Math.round(X) && c <= Math.round(Y)) {
						matriz[l][c] = 1;
						
				}
			}
		}
		
		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			
			System.out.println(" <" + l + ">");
			System.out.println();
		}
		
	}
}
