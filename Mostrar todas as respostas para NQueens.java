package nQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;


//Mostrar todas as soluções para o problema N-Queens


public class nQueens {
	
	static boolean[] temRainhaNaColuna;
	static boolean[] diagonalEsquerda;
	static boolean[] diagonalDireita; 
	static List<List<Integer>> answer;
	
	static List<List<Integer>> queens(int n) {
		
		answer= new ArrayList<List<Integer>>();
		List aux = new ArrayList<>();
		
		//tem rainha na coluna N?
		temRainhaNaColuna = new boolean[n];
		
		//diagonalEsquerda[i] = tem rainha na diagonal esquerda?
		//i= (row + col)th diagonal esquerda
		diagonalEsquerda = new boolean[n*2];
		
		//diagonalDireita[i] = tem rainha na diagonal direita?
		//i = (row - col + n-1)th diagonal direita
		diagonalDireita = new boolean[2*n];
		
		
		for (int i = 0; i < n; i++) {
			aux.add(0);// inicializa			
		} 
		solve(answer,n,0,aux);
				
		return answer;
	}
	 
	 
	private static void solve(List answer, int n, int row, List aux) {
		
		 //condição de parada
		 if (row ==n) {
			answer.add(new ArrayList<>(aux)); //armazena a resposta
			return;
		}
		 
		 for (int col = 0; col < n; col++) {
			
			 if (temRainhaNaColuna[col] || diagonalEsquerda[col+row] || diagonalDireita[row-col+n]) {
				 //vai pular pra próxima se der true;
				 continue;
			 }
			 //se não pular no if, colocar uma rainha
			 //e trocar a coluna atual e diagonais para true
			 temRainhaNaColuna[col] = diagonalEsquerda[col+row] = diagonalDireita[row-col+n] = true;
			 aux.set(col,row+1);
			 
			 //passar para a próxima coluna
			 solve(answer,n,row+1,aux);
			 
			 //backtrack 
			 //remove a última queen
			 temRainhaNaColuna[col]=false;
			 diagonalEsquerda[col+row]=false;
			 diagonalDireita[row-col+n]=false;
			 
			 
		}
		 
		 
		 
	}

	public static void main(String[] args) {
	
		int n = 4;
		List<List<Integer>> resp = queens(n);
		System.out.println(resp);
		
		escreve(resp);
		
	}

	private static void escreve(List<List<Integer>> resp) {
		// TODO Auto-generated method stub
		int lista=0;
		System.out.println("Inicio");
		
		while (lista<resp.size()) {
			int elemento = 0;
			
			while(elemento<temRainhaNaColuna.length) {
				int times = resp.get(lista).get(elemento);
//				System.out.println("Times: "+times);
				for (int i = 1; i <= temRainhaNaColuna.length; i++) {
//					System.out.println("I: "+i);
					if (i==times) {
						System.out.print(" Q ");
						continue;
					}
					System.out.print(" _ ");
				}
				System.out.println("");
				elemento++;
			}
			System.out.println("#################");
		lista++;	
			
		}
		System.out.println("Fim");
	}
	

	private static void printListOfLists(List<List<Integer>> listOfLists) {
	    System.out.println("\n           List of Lists          ");
	    System.out.println("-------------------------------------");
	    listOfLists.forEach(innerList -> {
	        String line = String.join(", ", innerList.toString());
	        System.out.println(line);
	    });
	}

	private static void printa(int[][] answer) {
		// TODO Auto-generated method stub
	System.out.println("--------------");
	for (int i = 0; i < answer.length; i++) {
		for (int j = 0; j < answer.length; j++) {
			System.out.print(answer[i][j]);
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println("--------------");	
	}
	
	private static int[][] reseta(int[][] board, int i) {
	// TODO Auto-generated method stub
//		if(i>0) {
//			last--;
//			return board;
//		}
		if(i<0) {
			return board;
		}
		for (int j = 0; j < board.length; j++) {
			board[i][j]=0;
		}
		return board;
}

	private static boolean pode(int[][] board, int x, int y) {
		// TODO Auto-generated method stub
		//esquerda direita e cima e baixo
		if (x<0 || y<0) {
			return false;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i][y]!=0 || board[x][i]!=0) {
				return false;
			}
		}
		
		//diagonal positiva
		for (int i=x,j = y; i < board.length&&j<board.length; i++,j++) {
				if (board[i][j]!=0) {
					return false;
				}
			}
			
		//diagonal negativa	
		for (int i=x,j = y; i>0&&j>0; i--,j--) {
					if (board[i][j]!=0) {
						return false;
					}
			}
			
		
		
		return true;
	}

}
