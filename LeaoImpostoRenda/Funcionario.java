import java.util.Scanner;
/*
LUCAS FLORES DA 353 QUE FEZ. 
  SE GOSTAR E PEGAR, PARABÉNS, VOCÊ ME DEVE ROYALTIES. $$$ 
*/
public class Funcionario {
  Scanner ler = new Scanner(System.in);
  String nome;
  String cpf;
  Integer quantidadeDeDependentes;
  Double salarioBruto, salarioLiquido;
  Double outrasDeducoes;

    public void receberNome(){
    String recebeChar = "";
    String nomeRepete = null;
    char caracterChatAt;
    Integer tamanhoCaracter;
    int verificaAceitacao = 0;
    Integer problemaEncontrado = 0;
    Letras letra = new Letras();

      while(verificaAceitacao == 0){
          problemaEncontrado = 0;
          System.out.println("");
          System.out.print("NOME DO FUNCIONÁRIO: ");
          nomeRepete = ler.next();
          this.nome = nomeRepete.toUpperCase();
          tamanhoCaracter = this.nome.length();

          for(Integer contadorCaracter = 0;contadorCaracter<=tamanhoCaracter-1;
          contadorCaracter++){
              caracterChatAt = this.nome.charAt(contadorCaracter);
              recebeChar = String.valueOf(caracterChatAt);
              if((letra.verificaLetra(recebeChar))){
                  verificaAceitacao = 1;    
              }else{
                  problemaEncontrado = 1;
              }
          }
              if((problemaEncontrado == 1)){
                  verificaAceitacao = 0;
              }
              if(problemaEncontrado!=0){
                  System.out.print("[ERRO] NOME NÃO ACEITO, POR FAVOR, REFAÇA.");
                  System.out.println("");
              }
      }
  }

  public void mostrarNome(){
    System.out.print(this.nome);
  }
  
   public void recebeSalarioBruto(){
    System.out.print("DIGITE O SALÁRIO BRUTO: R$ ");
    while(!ler.hasNextDouble()){
        System.out.println("[ERRO] SALÁRIO NÃO ACEITO, POR FAVOR, REPITA.");
        System.out.println("");
        System.out.print("DIGITE O SALÁRIO BRUTO: R$ ");
        ler.next();
    }
    this.salarioBruto = ler.nextDouble();
}

    public void recebeDependentes(){
        System.out.print("QUANTIDADE DE DEPENDENTES: ");
        while(!ler.hasNextInt()){
            System.out.println("[ERRO] QUANTIDADE NÃO ACEITA, POR FAVOR, REPITA.");
            System.out.println("");
            System.out.print("DIGITE A QUANTIDADE DE DEPENDENTES: ");
            ler.next();
        }
        this.quantidadeDeDependentes = ler.nextInt();
    }

    public void recebeOutrasDeducoes(){
        System.out.print("OUTRAS DEDUÇÕES: R$ ");
        while(!ler.hasNextInt()){
            System.out.println("[ERRO] VALOR NÃO ACEITO, POR FAVOR, REPITA.");
            System.out.println("");
            System.out.print("DIGITE O VALOR DE OUTRAS DEDUÇÕES: R$ ");
            ler.next();
        }
        this.outrasDeducoes = ler.nextDouble();
    }

    public void mostrarSalarioBruto(){
        System.out.println(salarioBruto);
    }

}
