public interface Funcionario {
    double calcularBonus();
}

public class FuncionarioAssalariado implements Funcionario {
    private static final double BONUS_FIXO = 5000.00;

    @Override
    public double calcularBonus() {
        return BONUS_FIXO;
    }
}

public class FuncionarioHorista implements Funcionario {
    private double salarioAnual;

    public FuncionarioHorista(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularBonus() {
        return salarioAnual * 0.10; 
    }
}

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado();
        System.out.printf("Bônus do Funcionário Assalariado: R$ %.2f%n", funcionarioAssalariado.calcularBonus());

        
        Funcionario funcionarioHorista = new FuncionarioHorista(60000.00);
        System.out.printf("Bônus do Funcionário Horista: R$ %.2f%n", funcionarioHorista.calcularBonus());
    }
}
