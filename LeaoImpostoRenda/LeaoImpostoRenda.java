public class LeaoImpostoRenda {

    public static void main(String[] args){
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda();

        System.out.print(String.format("%,.2f",impostoDeRenda.impostoRendaTradicional(2500.00, 0, 0.00)));
        System.out.println(" ");
        System.out.println(String.format("%,.2f",impostoDeRenda.impostoRendaSimplificado(2500.00)));

    }
}
