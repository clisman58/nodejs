public class SyMdMatrices
{
	private int[] M1;
	private int[] M2;

	public void Matriz(int fil1, int col1, int fil2, int col2){
		M1 = int [fil1][col1];
		M2 = int [fil2][col2];
	}
	public void  agregarValor(int numFila, int numCol, int valorMatr, int numFila1, int numCol1, int valorMatr1 ){
		M1[numFila][numCol] = valorMatr;
		M2[numFila1][numCol1] = valorMatr1;
	}
	public void MostrarValor(int numFila, int numCol, int valorMatr, int numFila1, int numCol1, int valorMatr1)
	{
		return M1[numFila][numCol];
		return M1[numFila1][numCol1];
	}
	public static void main(String[] args)
	{
		SyMdMatrices M1 = new SyMdMatrices(2,2);
		SyMdMatrices M2 = new SyMdMatrices(2,2);

		M1.agregarValor(0,0,2);
		M1.agregarValor(0,1,5);
		M1.agregarValor(1,0,3);
		M1.agregarValor(2,0,1);

		M2.agregarValor(0,0,8);
		M2.agregarValor(0,1,7);
		M2.agregarValor(1,0,4);
		M2.agregarValor(2,0,6);

		for (int i=0; i<2; i++){
			for(int j=0;j<2; j++){
				
				System.out.print(M1.MostrarValor(i, j));
				
			}
			System.out.println();
			
		}

		System.out.println();

		for (int i=0; i<2 ;i++){
			for(int j=0;j<2; j++){
				
				System.out.print(M2.MostrarValor(i, j));
			}
			System.out.println();
		}
		System.out.println("suma");
		for (int i=0; i<2 ;i++){
			for(int j=0;j<2; j++){
				suma[i][j]=M1.MostrarValor(i, j)+M2.MostrarValor(i, j);
				System.out.print(suma[i][j]);
			}
			System.out.println();
		}
		System.out.println("Multiplicacion");
		for (int i=0; i<2 ;i++){
			for(int j=0;j<2; j++){
				mult[i][j] = (M1[0][1]*M2[1][0]);
				System.out.print(mult[i][j]);
			}
			System.out.println();
		}
	}
}