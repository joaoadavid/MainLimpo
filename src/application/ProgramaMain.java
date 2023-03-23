package application;

public class ProgramaMain {
	public static void main(String[] args) {
	    char[][] arr = letraA();
	    escrever(arr);
	  }
	  public static char[][] letraA() {
	    char[][] arr = {
	      {'A', 'A', 'A', 'A', 'A'},
	      {'A', ' ', ' ', ' ', 'A'},
	      {'A', 'A', 'A', 'A', 'A'},
	      {'A', ' ', ' ', ' ', 'A'},
	      {'A', ' ', ' ', ' ', 'A'}
	    };
	    return arr;
	  }
	  public static void escrever(char[][] arr) {
		  for (char[] linha : arr) {
		    for (char c : linha) {
		      System.out.print(c + " ");
		    }
		    System.out.println();
		  }
		}
}
		  
