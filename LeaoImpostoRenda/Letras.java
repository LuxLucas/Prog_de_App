import java.util.Scanner;
public class Letras {
  Scanner lerLetras = new Scanner(System.in);

    public Boolean verificaLetra(String letra){
        Boolean eLetra;
        eLetra = false;

        if(letra.equals("A") || letra.equals("Á") || letra.equals("À") || letra.equals("Â") || letra.equals("Ã") || letra.equals("Ä") || letra.equals("B") || letra.equals("C") || letra.equals("Ç") || letra.equals("D") || letra.equals("E") || letra.equals("É") || letra.equals("È") || letra.equals("Ê") || letra.equals("F") || letra.equals("G") || letra.equals("H") || letra.equals("I") || letra.equals("Í") || letra.equals("Ì") || letra.equals("Î") || letra.equals("J") || letra.equals("K") || letra.equals("L") || letra.equals("M") || letra.equals("N") || letra.equals("O") || letra.equals("Ó") || letra.equals("Ò") || letra.equals("Ô") || letra.equals("Õ") || letra.equals("Ö") || letra.equals("P") || letra.equals("Q") || letra.equals("R") || letra.equals("S") || letra.equals("T") || letra.equals("U") || letra.equals("Ú") || letra.equals("Ù") || letra.equals("Û") || letra.equals("Ü") || letra.equals("V") || letra.equals("W") || letra.equals("X") || letra.equals("Y") || letra.equals("Z") || letra.equals(" "))
        {
          eLetra = true;
        }
        return eLetra;
    }
    public void comoProcederWhile(){
      Integer controleWith = 0;
      Integer confirmar = null;

      while(controleWith == 0){
          System.out.print("DESEJA CONTINUAR ? (1 = SIM || 2 = NÃO): ");
          while(!lerLetras.hasNextInt()){
              System.out.println("[ERRO] VALOR NÃO ACEITO, POR FAVOR, REPITA.");
              System.out.println("");
              System.out.print("DESEJA CONTINUAR ? (1 = SIM || 2 = NÃO): ");
              lerLetras.next();
          }
          confirmar = lerLetras.nextInt();
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
    System.out.println(" ");
  }

}
