/*
LUCAS FLORES DA 353 QUE FEZ. 
  SE GOSTAR E PEGAR, PARABÉNS, VOCÊ ME DEVE ROYALTIES. $$$ 
*/
public class Inss {
    Double descontoInss;
    Double aliquota1 = 0.075;
    Double aliquota2 = 0.09;
    Double aliquota3 = 0.12;
    Double aliquota4 = 0.14;
    Double faixaSalarial1 = 1320.00;
    Double faixaSalarial2 = 2571.29;
    Double faixaSalarial3 = 3856.94;
    

    public Double calcularDescontoInss(Double salario) {
        if(salario > 7507.49){
            salario = 7507.49;
        }

        if (salario<=1320.00){
            descontoInss = salario * aliquota1;
        }

        else if(salario<=2571.29){
            descontoInss = ((salario - faixaSalarial1) * aliquota2);

            descontoInss += (faixaSalarial1 * aliquota1);
        }

        else if(salario<=3856.94){
            descontoInss = ((salario - faixaSalarial2) * aliquota3);

            descontoInss += (faixaSalarial1 * aliquota1); 

            descontoInss += ((faixaSalarial2 - faixaSalarial1) * aliquota2);
        }

        else if(salario<=7507.49){
            descontoInss = (salario - faixaSalarial3) * aliquota4;

            descontoInss += (faixaSalarial1 * aliquota1);
            
            descontoInss +=  ((faixaSalarial2 - faixaSalarial1) * aliquota2);

            descontoInss += ((faixaSalarial3 - faixaSalarial2) * aliquota3);
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

