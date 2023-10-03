package Fundamentos.OOP.main;

public class Conta {
    
    private double saldo;
    private int numero;
    private String titular;
    public Data dataDeAbertura;
    private double limite = 400;
    private static int totalDeContas;



    Conta(String titular, int numero)
    {
        this.titular = titular;
        this.numero = numero;
        Conta.totalDeContas++;
    }


    public static int getTotalDeContas()
    {
        return Conta.totalDeContas;
    }


    public double getSaldo()
    {
        return this.saldo + this.limite;
    }

    public String getTitular()
    {
        return this.titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }


    public void saca(double valor)
    {
        if(valor > this.saldo)
        {
            System.out.println("Saldo Insuficiente: " + this.saldo);
        }
        else
        {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor)
    {
        this.saldo += valor;
    }


    public void calculaRendimento()
    {
        this.saldo *= 0.01;
    }

    public String recuperaDadosParaImpressao()
    {
        String dados = "\nTitular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;

        dados += dataDeAbertura.formataData();
        
        return dados;
        
    }

}
