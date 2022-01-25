import javax.swing.*;

public class Matriz
{
	private int[][] matriz;
	private int[][] matriz1;
	private int x;
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
		matriz1=new int[3][3];
		for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
          	 matriz1[i][j]=matriz[j][i];
        	}
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

	public void inversa(){
		
		for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
       
             int cont=0;
             int aux=1;
             int aux1=1;
               
           for(int a=0;a<=2;a++){
                 for(int b=0;b<=2;b++){
               
              if(a!=i && b!=j){
                   cont=cont+1;
                    if(cont ==1  || cont==4){
                       aux=aux*matriz[a][b];
                   }
                    if(cont ==2  || cont==3){
                        aux1=aux1*matriz[a][b];
                   }
                   
                    if(i+j==1 || i+j==3){
                        x = -(aux-aux1);
                  }
                  if((i+j)%2==0){
                        x=(aux-aux1);
                  }
               }
             }
          }
        System.out.print("("+x+")"+",");
      }
    }
}
	public static void main(String[] args)
	{
		Matriz matriz = new Matriz();
		matriz.agregarOrdenMatriz();
		matriz.agregarValor();
		matriz.mostrarMatriz();
		matriz.inversa();
		matriz.mostrarinversa();

	}

}