import java.util.Scanner;
/*
LUCAS FLORES DA 353 QUE FEZ. 
  SE GOSTAR E PEGAR, PARABÉNS, VOCÊ ME DEVE ROYALTIES. $$$ 
*/
public class CalculoInssPunk {
    Integer confirmar;
    Scanner ler = new Scanner(System.in);
    Funcionario trab = new Funcionario();
    Inss inss = new Inss();

    public void recebeSalarioBruto(){
        System.out.print("DIGITE O SALÁRIO BRUTO: R$ ");
        while(!ler.hasNextDouble()){
            System.out.println("[ERRO] SALÁRIO NÃO ACEITO, POR FAVOR, REPITA.");
            System.out.println("");
            System.out.print("DIGITE O SALÁRIO BRUTO: R$ ");
            ler.next();
        }
        trab.salarioBruto = ler.nextDouble();
        
    }

    public Boolean verificaLetra(String letra){
        Boolean eLetra;
        eLetra = false;

        if(letra.equals("A") || letra.equals("Á") || letra.equals("À") || letra.equals("Â") || letra.equals("Ã") || letra.equals("Ä") || letra.equals("B") || letra.equals("C") || letra.equals("Ç") || letra.equals("D") || letra.equals("E") || letra.equals("É") || letra.equals("È") || letra.equals("Ê") || letra.equals("F") || letra.equals("G") || letra.equals("H") || letra.equals("I") || letra.equals("Í") || letra.equals("Ì") || letra.equals("Î") || letra.equals("J") || letra.equals("K") || letra.equals("L") || letra.equals("M") || letra.equals("N") || letra.equals("O") || letra.equals("Ó") || letra.equals("Ò") || letra.equals("Ô") || letra.equals("Õ") || letra.equals("Ö") || letra.equals("P") || letra.equals("Q") || letra.equals("R") || letra.equals("S") || letra.equals("T") || letra.equals("U") || letra.equals("Ú") || letra.equals("Ù") || letra.equals("Û") || letra.equals("Ü") || letra.equals("V") || letra.equals("W") || letra.equals("X") || letra.equals("Y") || letra.equals("Z") || letra.equals(" "))
        {
          eLetra = true;
        }
        return eLetra;
    }
    public void receberNome(){
        String recebeChar = "";
        String nomeRepete = null;
        char caracterChatAt;
        Integer tamanhoCaracter;
        int verificaAceitacao = 0;
        Integer problemaEncontrado = 0;

        while(verificaAceitacao == 0){
            problemaEncontrado = 0;
            System.out.println("");
            System.out.print("NOME DO FUNCIONÁRIO: ");
            nomeRepete = ler.next();
            trab.nome = nomeRepete.toUpperCase();
            tamanhoCaracter = trab.nome.length();

            for(Integer contadorCaracter = 0;contadorCaracter<=tamanhoCaracter-1;
            contadorCaracter++){
                caracterChatAt = trab.nome.charAt(contadorCaracter);
                recebeChar = String.valueOf(caracterChatAt);
                if((verificaLetra(recebeChar))){
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

    public void mostraDados(){
        Double descontoDoInss = 0.0;
        Double salarioInteiro = 0.0;
        Double salarioRecebido = 0.0;

            System.out.print("////////NOME//////////////////////////////////////////");
            receberNome();
            System.out.println("///////FIM NOME///////////////////////////////////////");
            System.out.println("");

            System.out.println("///////SALÁRIO BRUTO//////////////////////////////////");
            recebeSalarioBruto();
            System.out.println("///////FIM SALÁRIO BRUTO//////////////////////////////");
            System.out.println("");

            System.out.println("///////MOSTRAR DADOS//////////////////////////////////");

            System.out.println("FUNCIONÁRIO: "+trab.nome);

            salarioInteiro = trab.salarioBruto;
            System.out.println("SALÁRIO BRUTO: R$ "+String.format("%,.2f",salarioInteiro));

            descontoDoInss = inss.calcularDescontoInss(trab.salarioBruto);
            System.out.print("DESCONTO DO INSS: R$ "+String.format("%,.2f",descontoDoInss));

            System.out.println("");
            salarioRecebido = inss.calcularInss(trab.salarioBruto);
            System.out.println("SALÁRIO LÍQUIDO: R$ "+String.format("%,.2f",salarioRecebido));
            System.out.print("///////FIM DO MOSTRAR DADOS///////////////////////////////////////");
            System.out.println("");
        }

        public void comoProceder(){
            Integer controleWith = 0;

            while(controleWith == 0){
                System.out.print("DESEJA CONTINUAR ? (1 = SIM || 2 = Não): ");
                while(!ler.hasNextInt()){
                    System.out.println("[ERRO] VALOR NÃO ACEITO, POR FAVOR, REPITA.");
                    System.out.println("");
                    System.out.print("DESEJA CONTINUAR ? (1 = SIM || 2 = Não): ");
                    ler.next();
                }
                confirmar = ler.nextInt();
                switch(confirmar){
                    case 1:
                        confirmar = 1;
                        controleWith = 1;
                    break;   
                    case 2:
                        confirmar = 2;
                        controleWith = 2;
                        System.out.println("");
                        System.out.print("[AVISO] FIM DO PROGRAMA, TENHA UM BOM DIA");
                    break;
                    default:
                        controleWith = 0;
                        System.out.println("");
                        System.out.print("[AVISO] RESPOSTA NÃO ACEITA");
                    break;
                }
          }   
        }

    public static void main(String[] args){
    CalculoInssPunk programa = new CalculoInssPunk();
    programa.confirmar = 1;
        while(programa.confirmar==1){
            System.out.println("");
            programa.mostraDados();
            System.out.println("");
            programa.comoProceder();
        }        
    }
}
