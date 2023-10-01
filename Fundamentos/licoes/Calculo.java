package Fundamentos.licoes;

public class Calculo {
    

    private int fatorial;

    public void Fatorial(int n)
    {
        if(n<=1)
        {
            System.out.println(1);
        }
        else
        {
            this.fatorial = n;

            for(int i = 1; i < fatorial; i++)
            {
                n *= i;
            }

            System.out.println(n);
        }

    }
}
