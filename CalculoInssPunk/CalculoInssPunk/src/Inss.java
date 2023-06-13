/*
LUCAS FLORES DA 353 QUE FEZ. 
  SE GOSTAR E PEGAR, PARABÉNS, VOCÊ ME DEVE ROYALTIES. $$$
  QUERO MEUS R$ 500,00 PRA ONTEM.
*/
public class Inss {
    Double descontoInss = null;
    Double[] aliquota = {0.075, 0.09, 0.12, 0.14};
    Double[] faixaSalarialInss = {1320.00, 2571.29, 3856.94, 7507.49};

    public Double calcularDescontoInss(Double salario) {
        Double[] descontoSequencialInss = new Double[3];
        descontoSequencialInss[0] = (faixaSalarialInss[0] * aliquota[0]);
        descontoSequencialInss[1] = ((faixaSalarialInss[1] - faixaSalarialInss[0]) * aliquota[1]);
        descontoSequencialInss[2] = ((faixaSalarialInss[2] - faixaSalarialInss[1]) * aliquota[2]);


        if(salario > faixaSalarialInss[3]){
            salario = faixaSalarialInss[3];
        }

        if (salario <= faixaSalarialInss[0]){
            descontoInss = salario * aliquota[0];
        }

        else if(salario <= faixaSalarialInss[1]){
            descontoInss = ((salario - faixaSalarialInss[0]) * aliquota[1]);

            descontoInss += descontoSequencialInss[0];
        }

        else if(salario <= faixaSalarialInss[2]){
            descontoInss = ((salario - faixaSalarialInss[1]) * aliquota[2]);

            descontoInss += descontoSequencialInss[0];
            descontoInss += descontoSequencialInss[1];
        }

        else if(salario <= faixaSalarialInss[3]){
            descontoInss = ((salario - faixaSalarialInss[2]) * aliquota[3]);

            descontoInss += descontoSequencialInss[0];
            descontoInss += descontoSequencialInss[1];
            descontoInss += descontoSequencialInss[2];
        }
     return descontoInss;
    }

    public Double calcularInss(Double salario){
    Inss desconto = new Inss();
    Double salarioDescontado;

        salarioDescontado = salario - desconto.calcularDescontoInss(salario);
        return salarioDescontado;
    }
}

