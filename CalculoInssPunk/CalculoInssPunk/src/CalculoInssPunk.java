import java.sql.SQLOutput;
import java.util.Scanner;
public class CalculoInssPunk {

    public static void main(String[] args){
        Integer Confirmar=1, Controle;
        Scanner Ler = new Scanner(System.in);
        Funcionario Trab = new Funcionario();

        while(Confirmar==1){
            System.out.println("");
            System.out.printf("/n");

            System.out.print("Nome do funcionário: ");
            Trab.Nome = Ler.nextLine();

            System.out.print("Salário do funcionário: ");
            Trab.SalarioBruto = Ler.nextDouble();

            System.out.println("");
            System.out.println("Deseja continuar ? (1:Sim e qualquer outro:Não)");
            Confirmar = Ler.nextInt();
            System.out.println("");
        }

    }

}
