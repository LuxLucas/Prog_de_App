import java.util.Scanner;
public class CalculoInssPunk {
    Integer confirmar;
    Scanner ler = new Scanner(System.in);
    Funcionario trab = new Funcionario();
    Inss inss = new Inss();
    

    public Boolean verificaLetra(String letra.charAt(0)){
        Boolean eLetra;
        eLetra = false;

        if(letra.equals("A") || letra.equals("Á") || letra.equals("À") || letra.equals("Â") || letra.equals("Ã") || letra.equals("Ä") || letra.equals("B") || letra.equals("C") || letra.equals("Ç") || letra.equals("D") || letra.equals("E") || letra.equals("É") || letra.equals("È") || letra.equals("Ê") || letra.equals("F") || letra.equals("G") || letra.equals("H") || letra.equals("I") || letra.equals("Í") || letra.equals("Ì") || letra.equals("Î") || letra.equals("J") || letra.equals("K") || letra.equals("L") || letra.equals("M") || letra.equals("N") || letra.equals("O") || letra.equals("Ó") || letra.equals("Ò") || letra.equals("Ô") || letra.equals("Õ") || letra.equals("Ö") || letra.equals("P") || letra.equals("Q") || letra.equals("R") || letra.equals("S") || letra.equals("T") || letra.equals("U") || letra.equals("Ú") || letra.equals("Ù") || letra.equals("Û") || letra.equals("Ü") || letra.equals("V") || letra.equals("W") || letra.equals("X") || letra.equals("Y") || letra.equals("Z")){

          eLetra = true;

        }

        return eLetra;
    }
    
    public void receberNome(){
        Integer nomeAceito, tamanhoCaracter;
        CalculoInssPunk programa = new CalculoInssPunk();
        nomeAceito = 1;

        while(nomeAceito == 1){

            System.out.print("Nome do funcionário: ");
            trab.nome = ler.nextLine();
            trab.nome = trab.nome.toUpperCase();

            tamanhoCaracter = trab.nome.length();

            for(Integer contadorCaracter = 0; contadorCaracter<=tamanhoCaracter-1; contadorCaracter++){

                if(programa.verificaLetra(trab.nome.charAt(contadorCaracter)) ){

                }

                }

            }

        }
        

    }

    public static void main(String[] args){
    CalculoInssPunk programa = new CalculoInssPunk();
    
    programa.confirmar = 1;

        while(programa.confirmar==1){
            System.out.println(" ");
            System.out.println(" ");

            

           /*  System.out.print("Salário bruto do funcionário: ");
            programa.trab.salarioBruto = programa.ler.nextDouble();

            programa.trab.salarioLiquido = inss.calcularInss(trab.salarioBruto);

            System.out.println(" ");
            System.out.println("Funcionário "+trab.nome);
            System.out.println("Salário bruto: R$"+trab.salarioBruto);
            System.out.println("Desconto do INSS: R$"+trab.salarioLiquido);*/

            System.out.println("Oi");

            /*System.out.println("Deseja continuar ? (1:Sim e qualquer outro:Não)");
            confirmar = ler.nextInt(); */
        }

    }

}
