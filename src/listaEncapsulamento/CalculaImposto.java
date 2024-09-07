package listaEncapsulamento;

import java.util.Scanner;

public class CalculaImposto {
    private String nome;
    private double salarioBruto;

    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void recebeDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        setNome(scanner.nextLine());

        System.out.println("Digite o salario: ");
        setSalarioBruto(scanner.nextDouble());

        scanner.close();
    }

    public double calculaImposto(double salarioBruto) {
        if (salarioBruto <= 2259.20){
            return 0;
        } else if (salarioBruto <=2826.65) {
            return (salarioBruto * 7.5) / 100;
        } else if (salarioBruto <= 3751.05) {
            return (salarioBruto *15)/ 100;
        } else if (salarioBruto <=4664.68) {
            return (salarioBruto * 22.5) / 100;
        }else {
            return (salarioBruto * 27.5) / 100;
        }
    }

    public void exibeInformacoes() {
        double imposto = calculaImposto(salarioBruto);
        double salarioLiquido = salarioBruto - imposto;
        System.out.printf("""
                        Nome: %s
                        Salario bruto: %.2f
                        Imposto: %.2f
                        Salario líquido: %.2f
                        """, nome, salarioBruto, imposto, salarioLiquido);
    }

    public static void main(String[] args) {
        CalculaImposto calculo = new CalculaImposto();
        calculo.recebeDados();
        calculo.exibeInformacoes();
    }
}

