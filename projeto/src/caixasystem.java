import java.util.Scanner;

public class caixasystem  {
    public static void main(String[] args) {

     System.out.println(" ====== Sistema de Caixa Registradora ======");

     Scanner input = new Scanner(System.in);

 // Dados de Entrada

     System.out.println("Digite o Nome do produto: ");
     String nomeProd = input.nextLine();

     System.out.println("Digite o valor do produto: ");
     double valorProd = input.nextDouble();

     System.out.println("Digite o quantidade de produto: ");
     int quantidadeProd = input.nextInt();

     System.out.println("Digite o valor recebido: ");
     double valorRecebido = input.nextDouble();

// Processamento

    double valorFinal = valorProd * quantidadeProd;

    double valorTroco = valorRecebido - valorFinal;

// Dados de Saída

    if(valorRecebido < valorFinal) {
        System.out.println("Saldo insuficiente para finalizar a compra!");

    } else {
        System.out.println(" ====== Compra Concluída ======");
        System.out.println("Produto: " + nomeProd);
        System.out.println("Quantidade: " + quantidadeProd);
        System.out.println("Valor Recebido: " + valorRecebido);
        System.out.println("Valor Final: " + valorFinal);

        if(valorTroco > 0){
            System.out.println("Troco: " + valorTroco);
        } else {
            System.out.println("Sem Troco");
        }
    }

  }
}