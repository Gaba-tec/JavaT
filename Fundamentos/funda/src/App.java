import Fundamentos.licoes.Aluno;
import Fundamentos.licoes.test01;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        test01 t = new test01();

        System.out.println(t.getIdade());

        System.out.println("Faz o maldito L seu canalha\n" + "Vou fazer porra nenhuma seu verme\n");
        

        // Variaveis primitivas

        int i = 3;
        String s = "Teste";
        char c = 'g';
        float f = 1.0f;
        double d = 3.141592653589793f;
        boolean b = true;
        long l = 100000;

        System.out.println("Inteiro: " + i + " \nString: " + s + " \nChar: " + c + " \nFloat: " + f + " \nDouble: " + d + " \nBool: " + b + " \nLong: " + l); 


        // Condiçonas 


        Aluno aluno = new Aluno();

        aluno.SetAluno("Gabriel", 24);
        float media = aluno.Media(7.0f,8.2f,8.2f,6.1f);

        if(media >= 6)
        {
            aluno.FichaAluno();
            System.out.println("Parabéns aluno você foi aprovado");
        }
        else
        {
            System.out.println("BURRO DEMAIS, VAI ESTUDAR");
        }
        

    }
}
