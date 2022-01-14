import javax.swing.*;

public class Matriz
{
	private int[][] matriz;
	private int fila;
	private int columna;
	

	public void agregarOrdenMatriz(){
		fila=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de filas"));
		columna=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de columnas"));
		matriz = new int[fila][columna];
	}
	public void agregarValor(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				int valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese valores"));
				matriz[i][j] = valor;
			}
			System.out.println();
		}
	}
	public void mostrarMatriz(){
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){

				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public void transpuesta(){
		int x;
		for(int i=0; i<3;i++){
			for(int j=0; j<i; j++){
				x=matriz[i][j];
				matriz[i][j]=matriz[j][i];
				matriz[j][i]=x;	
			}
		}
	}
	public void mostrarTranspuesta(){
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				System.out.print(matriz[j][i]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Matriz matriz = new Matriz();
		matriz.agregarOrdenMatriz();
		matriz.agregarValor();
		matriz.mostrarMatriz();
		matriz.mostrarTranspuesta();

	}

}
