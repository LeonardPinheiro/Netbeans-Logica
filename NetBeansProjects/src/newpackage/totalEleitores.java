package newpackage;


import java.util.Scanner;

public class totalEleitores {
    public static void main(String[] args){
    
    Scanner leitor = new Scanner(System.in);
    
    int votosNulos, votosBrancos, votosValidos, totalEleitores;
        
    System.out.println("Este programa exibira a quantidade de eleitores e seu percentual");
    
    System.out.println("Digite os votos validos");
    votosValidos = leitor.nextInt();
    
    System.out.println("Digite os votos em brancos");
    votosBrancos = leitor.nextInt();
    
    System.out.println("Digite os votos nulos");
    votosNulos = leitor.nextInt();
    
    totalEleitores = votosBrancos+votosNulos+votosValidos;
    
    System.out.println("A quantidade de votos brancos é "+votosBrancos+" e seu percentual é "+ 100*votosBrancos/totalEleitores+"%");
    System.out.println("A quantidade de votos nulos é "+votosNulos+" e seu percentual é "+ 100*votosNulos/totalEleitores+"%");
    System.out.println("A quantidade de votos validos é "+votosValidos+" e seu percentual é "+ 100*votosValidos/totalEleitores+"%");
    System.out.println("A quantidade total de eleitores é "+totalEleitores);
    }
}
