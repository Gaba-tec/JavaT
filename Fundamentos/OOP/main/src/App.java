import Fundamentos.OOP.main.Conta;
import Fundamentos.OOP.main.Data;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();

        c1.titular = "Gabriel";
        c1.numero = 69;

        c1.dataDeAbertura = new Data();

        c1.dataDeAbertura.dia = 03;
        c1.dataDeAbertura.mes = 10;
        c1.dataDeAbertura.ano = 2023;

        c1.deposita(400);

        System.out.println(c1.recuperaDadosParaImpressao());

    }
}
