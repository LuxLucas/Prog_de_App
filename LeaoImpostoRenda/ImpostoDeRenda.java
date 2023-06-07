public class ImpostoDeRenda {
    Double[] faixaMaximaIr = {1903.98, 2826.65, 3751.05, 4664.68};
    Double[] aliquotaIr = {0.075, 0.15, 0.225, 0.275};
    Double[] valorDeduzirIr = {142.80, 354.80, 636.13, 869.36};
    Double impostoIr = null;

    public Double impostoRenda(Double salario){
        Inss inss = new Inss();
        Double descontoInss = null;
        Double salarioLiquidoInicial = null;
        Double impostoPagarIr = null;

        descontoInss = inss.calcularDescontoInss(salario);
        salarioLiquidoInicial = inss.calcularInss(salario);

        if(salarioLiquidoInicial <= faixaMaximaIr[0]){
            impostoIr = 0.0;

        }else if(salarioLiquidoInicial <= faixaMaximaIr[1]){
            impostoPagarIr = ((salario * aliquotaIr[0]) - valorDeduzirIr[0]);
            impostoIr = salario - (descontoInss + impostoPagarIr);

        }else if(salarioLiquidoInicial <= faixaMaximaIr[2]){
            impostoPagarIr = ((salario * aliquotaIr[1]) - valorDeduzirIr[1]);
            impostoIr = salario - (descontoInss + impostoPagarIr);
        
        }else if(salarioLiquidoInicial <= faixaMaximaIr[3]){
            impostoPagarIr = ((salario * aliquotaIr[2]) - valorDeduzirIr[2]);
            impostoIr = salario - (descontoInss + impostoPagarIr);
        
        }else if(salarioLiquidoInicial > faixaMaximaIr[3]){
            impostoPagarIr = ((salario * aliquotaIr[3]) - valorDeduzirIr[3]);
            impostoIr = salario - (descontoInss + impostoPagarIr);
        }
        return impostoIr;
    }



}
