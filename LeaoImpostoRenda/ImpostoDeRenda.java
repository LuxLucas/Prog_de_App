public class ImpostoDeRenda {
    Double[] faixaMaximaIr = {2112.00,2826.65, 3751.05, 4664.68};
    Double[] aliquotaImpostoDeRenda = {0.075, 0.15, 0.225, 0.275};
    Double[] valorDeduzirImpostoDeRenda = {158.40, 370.40, 651.73, 884.96};

    public Double impostoRendaTradicional(Double salario, Integer dependentes, Double outrasDeducoes){
        Inss inss = new Inss();
        Double salarioLiquidoBase;
        Double custoImpostoDeRendaTradicional= null;
        Double deducaoImpostoDeRenda;
        Double valorPorDependente;

        valorPorDependente = 189.59;
        deducaoImpostoDeRenda = (inss.calcularDescontoInss(salario) + (dependentes * valorPorDependente) + outrasDeducoes);
        salarioLiquidoBase = salario - deducaoImpostoDeRenda;

        if(salarioLiquidoBase <= faixaMaximaIr[0]){
            custoImpostoDeRendaTradicional = 0.0;

        }else if(salarioLiquidoBase <= faixaMaximaIr[1]){
            custoImpostoDeRendaTradicional = ((salarioLiquidoBase * aliquotaImpostoDeRenda[0]) - valorDeduzirImpostoDeRenda[0]);

        }else if(salarioLiquidoBase <= faixaMaximaIr[2]){
            custoImpostoDeRendaTradicional = ((salarioLiquidoBase * aliquotaImpostoDeRenda[1]) - valorDeduzirImpostoDeRenda[1]);
        
        }else if(salarioLiquidoBase <= faixaMaximaIr[3]){
            custoImpostoDeRendaTradicional = ((salarioLiquidoBase * aliquotaImpostoDeRenda[2]) - valorDeduzirImpostoDeRenda[2]);
        
        }else if(salarioLiquidoBase > faixaMaximaIr[3]){
            custoImpostoDeRendaTradicional = ((salarioLiquidoBase * aliquotaImpostoDeRenda[3]) - valorDeduzirImpostoDeRenda[3]);
        }
        return custoImpostoDeRendaTradicional;
    }

    public Double impostoRendaSimplificado(Double salario){
        Double custoImpostoDeRendaSimplificado = null;
        Double salarioLiquidoBase;
        Double deducaoImpostoDeRenda;

        deducaoImpostoDeRenda = (faixaMaximaIr[0] * 0.25);
        salarioLiquidoBase = salario - deducaoImpostoDeRenda;

        if(salarioLiquidoBase <= faixaMaximaIr[0]){
            custoImpostoDeRendaSimplificado  = 0.0;

        }else if(salarioLiquidoBase <= faixaMaximaIr[1]){
            custoImpostoDeRendaSimplificado  = ((salarioLiquidoBase * aliquotaImpostoDeRenda[0]) - valorDeduzirImpostoDeRenda[0]);

        }else if(salarioLiquidoBase <= faixaMaximaIr[2]){
            custoImpostoDeRendaSimplificado  = ((salarioLiquidoBase * aliquotaImpostoDeRenda[1]) - valorDeduzirImpostoDeRenda[1]);

        }else if(salarioLiquidoBase <= faixaMaximaIr[3]){
            custoImpostoDeRendaSimplificado  = ((salarioLiquidoBase * aliquotaImpostoDeRenda[2]) - valorDeduzirImpostoDeRenda[2]);

        }else if(salarioLiquidoBase > faixaMaximaIr[3]){
            custoImpostoDeRendaSimplificado  = ((salarioLiquidoBase * aliquotaImpostoDeRenda[3]) - valorDeduzirImpostoDeRenda[3]);
        }
        return custoImpostoDeRendaSimplificado;
    }



}
