package Fundamentos.licoes;

import java.util.Set;

public class Aluno {
    
    private String name;
    private int idade;
    private float notaTotal;

    public float Media(float n1, float n2, float n3, float n4)
    {
        this.notaTotal = (n1 + n2 + n3 + n4) / 4;
        return this.notaTotal;
    }

    public void SetAluno(String Nome, int Idade)
    {
        this.name = Nome;
        this.idade = Idade;
    }

    public void FichaAluno()
    {
        System.out.println("Nome: " + this.name + "\nIdade: " + this.idade + "\nMedia: " + this.notaTotal);
    }

}
