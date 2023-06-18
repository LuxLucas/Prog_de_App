import java.util.Scanner;
public class LeaoImpostoRenda {
    Funcionario trab = new Funcionario();
    Scanner lerImpostoRenda = new Scanner(System.in);
    String tipoImpostoDeRenda;
    Integer fimPrograma = 0;

    public void recebeDados(){
        System.out.println("//////TIPO DE IMPOSTO////");
        receberTipoImpostoDeRenda();
        System.out.println("////FIM TIPO DE IMPOSTO//");
        System.out.println(" ");
        System.out.print("//////////NOME///////////");
        trab.receberNome();
        System.out.println("////////FIM NOME/////////");
        System.out.println(" ");
        System.out.print("////////SALÁRIO//////////");
        System.out.println(" ");
        trab.recebeSalarioBruto();
        System.out.println("//////FIM SALÁRIO////////");
        System.out.println(" ");
        if(tipoImpostoDeRenda.equals("T")){
            System.out.print("///////DEPENDENTES///////");
            System.out.println(" ");
            trab.recebeDependentes();
            System.out.println("////FIM DEPENDENTES//////"); 
            System.out.println(" ");
            System.out.println("////OUTRAS DEDUÇÕES//////"); 
            trab.recebeOutrasDeducoes();
            System.out.println("///FIM OUTRAS DEDUÇÕES////"); 
            System.out.println(" ");  
        }
    }

    public void mostrarResultados(){
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda();
        Inss inss = new Inss();
        Double valorImpostoInss = null;
        Double valorSobreImpostoDeRenda = null;

        System.out.println("//////////MOSTRAR RESULTADOS//////////");
        System.out.println("NOME: "+trab.nome); 
        System.out.println("SALÁRIO BRUTO: R$ "+trab.salarioBruto);
        if(tipoImpostoDeRenda.equals("T")){
            System.out.println("QUANTIDADE DE DEPENDENTES: "+trab.quantidadeDeDependentes);
            System.out.println("OUTRAS DEDUÇÕES: R$ "+trab.outrasDeducoes);
        }

        valorImpostoInss = inss.calcularDescontoInss(trab.salarioBruto);
        if(valorImpostoInss == 0){
            System.out.println("DESCONTO INSS: ISENTO");
        }else{
            System.out.println("DESCONTO INSS: R$ "+String.format("%,.2f",valorImpostoInss));
        }

        if(tipoImpostoDeRenda.equals("T")){
            valorSobreImpostoDeRenda = impostoDeRenda.impostoRendaTradicional(trab.salarioBruto, trab.quantidadeDeDependentes, trab.outrasDeducoes);
        }else{
            valorSobreImpostoDeRenda = impostoDeRenda.impostoRendaSimplificado(trab.salarioBruto);
        }

        if(valorSobreImpostoDeRenda == 0){
            System.out.println("DESCONTO IMPOSTO DE RENDA: ISENTO");
        }else{
            System.out.println("DESCONTO IMPOSTO DE RENDA: R$ "+String.format("%,.2f",valorSobreImpostoDeRenda));
        }

        System.out.println("REDUÇÕES TOTAIS: R$"+String.format("%,.2f",(inss.descontoInss+valorSobreImpostoDeRenda)));
        System.out.println("SALÁRIO LÍQUIDO RESULTANTE: R$ "+String.format("%,.2f",trab.salarioBruto - (valorImpostoInss + impostoDeRenda.custoImpostoDeRenda)));
        //System.out.println("");
        System.out.println("////////FIM MOSTRAR RESULTADOS////////");
        System.out.println(" ");  
    }

    public void receberTipoImpostoDeRenda(){
        Integer testeWhile = 1;
        while(testeWhile == 1){
            tipoImpostoDeRenda = "ERRO DE REPETIÇÃO";
            System.out.print("QUAL CÁLCULO DESEJA USAR, O TRADICIONAL OU O SIMPLIFICADO ? (T/S): ");
            tipoImpostoDeRenda = lerImpostoRenda.next();
            tipoImpostoDeRenda = tipoImpostoDeRenda.toUpperCase();

            if(tipoImpostoDeRenda.equals("T") || tipoImpostoDeRenda.equals("TRADICIONAL")){
                tipoImpostoDeRenda = "T";
                testeWhile = 0;
            } else if(tipoImpostoDeRenda.equals("S") || tipoImpostoDeRenda.equals("SIMPLIFICADO")){
                tipoImpostoDeRenda = "S";
                testeWhile = 0;
            } else{
                System.out.println("[ERRO] RESPOSTA NÃO ACEITA, POR FAVOR, REFAÇA.");
            }
        }
    }

    public void comoProcederWhile(){
        Integer controleWhileMain = 0;
        Integer confirmar = null;
  
        while(controleWhileMain == 0){
            System.out.print("DESEJA CONTINUAR ? (1 = SIM || 2 = NÃO): ");
            while(!lerImpostoRenda.hasNextInt()){
                System.out.println("[ERRO] VALOR NÃO ACEITO, POR FAVOR, REPITA.");
                System.out.println("");
                System.out.print("DESEJA CONTINUAR ? (1 = SIM || 2 = NÃO): ");
                lerImpostoRenda.next();
            }
            confirmar = lerImpostoRenda.nextInt();
            switch(confirmar){
                case 1:
                    controleWhileMain = 1;
                break;   
                case 2:
                    controleWhileMain = 2;
                    fimPrograma = 2;
                    System.out.println("");
                    System.out.print("[AVISO] FIM DO PROGRAMA, APROVEITE O RESTO DO DIA");
                    System.out.println(" ");
                break;
                default:
                    controleWhileMain = 0;
                    System.out.println("");
                    System.out.print("[AVISO] RESPOSTA NÃO ACEITA");
                break;
            }
      }   
      System.out.println(" ");
    }

    public static void main(String[] args){
        LeaoImpostoRenda leaoImpostoRenda = new LeaoImpostoRenda();

        while (leaoImpostoRenda.fimPrograma == 0) {
            leaoImpostoRenda.recebeDados();
            leaoImpostoRenda.mostrarResultados();
            leaoImpostoRenda.comoProcederWhile();
            }
        }
}
