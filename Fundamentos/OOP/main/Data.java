package Fundamentos.OOP.main;

public class Data {
    public int dia; 
    public int mes;
    public int ano;

    String formataData()
    {
        return "\n" + this.dia + "/" + this.mes + "/" + this.ano; 
    }
}
