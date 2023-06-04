import java.util.Scanner;
public class CalculoInssPunk {
    Integer confirmar;
    Scanner ler = new Scanner(System.in);
    Funcionario trab = new Funcionario();
    Inss inss = new Inss();

    public void recebeSalarioBruto(){
        System.out.print("Digite o salario bruto: ");
        while(!ler.hasNextDouble()){
            System.out.println("[ERRO] Salário não aceito, por favor, repita.");
            System.out.println("");
            System.out.print("Digite o salario bruto: ");
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
        char caracterChatAt;
        Integer tamanhoCaracter;
        int verificaAceitacao = 0;
        Integer problemaEncontrado = 0;

        while(verificaAceitacao == 0){
            problemaEncontrado = 0;

            System.out.print("Nome do funcionário: ");
            trab.nome = ler.nextLine();
            trab.nome = trab.nome.toUpperCase();
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
                if(problemaEncontrado == 1){
                    verificaAceitacao = 0;
                }
                if(problemaEncontrado!=0){
                    System.out.print("[ERRO] NOME NÃO ACEITO, POR FAVOR, REFAÇA.");
                }
            System.out.println(" ");
            System.out.println(" ");
        }
    }  

    public void mostraDados(){
        Double descontoDoInss = 0.0;
        Double salarioInteiro = 0.0;
        Double salarioRecebido = 0.0;
        receberNome();
            recebeSalarioBruto();
            System.out.println("");
            System.out.print("Funcionário: "+trab.nome);

            System.out.println("");
            salarioInteiro = trab.salarioBruto;
            System.out.print("Salário bruto: R$ "+Math.round(salarioInteiro));

            System.out.println("");
            descontoDoInss = inss.calcularDescontoInss(trab.salarioBruto);
            /*System.out.print("Desconto do INSS: R$ "+Math.round(descontoDoInss) );*/
            System.out.print("Desconto do INSS: R$ "+descontoDoInss);

            System.out.println("");
            salarioRecebido = inss.calcularInss(trab.salarioBruto);
            /*System.out.print("Salário líquido: "+Math.round(salarioRecebido));*/
            System.out.print("Salário líquido: "+salarioRecebido);
        }

    public static void main(String[] args){
    CalculoInssPunk programa = new CalculoInssPunk();
    programa.confirmar = 1;
        while(programa.confirmar==1){
            programa.mostraDados();
            System.out.println("");
            System.out.println("");
            System.out.println("Deseja continuar ? (1:Sim e qualquer outro:Não)");
            programa.confirmar = programa.ler.nextInt();
        }
    }
}
