import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

import Fundamentos.licoes.Aluno;
import Fundamentos.licoes.test01;
import Fundamentos.licoes.Calculo;
import Fundamentos.Busca_Cep.Endereco;
import Fundamentos.Busca_Cep.ServicoDeCep;
import Fundamentos.Estrutura_Dados.*;
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
        

        for(int x = 1; x <= 100; x++){
            if(x % 3 == 0)
            {
                System.out.println(x);
            }
        }

        Calculo calculo = new Calculo();

        calculo.Fatorial(24);

        
        Dynamic dynamic = new Dynamic();

        //System.out.print(dynamic.DynamicArray(2, queries));



        List<Integer> queries2 = new ArrayList<>();

        //queries2.add(1);
        //queries2.add(2);

        //queries.add(queries2);

        /* 
        for (List<Integer> lista : queries) 
        {
            System.out.println(lista);
        }
        */
        
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(dynamic.rotateLeft(4, arr));


        List<String> strings = new ArrayList<String>();
        List<String> querieStrings = new ArrayList<String>();

        strings.add("abcde");
        strings.add("sdaklfj");
        strings.add("asdjf");
        strings.add("na");
        strings.add("basdn");
        strings.add("sdaklfj");
        strings.add("asdjf");
        strings.add("na");
        strings.add("asdjf");
        strings.add("na");
        strings.add("basdn");
        strings.add("sdaklfj");
        strings.add("asdjf");
        

        querieStrings.add("abcde");
        querieStrings.add("sdaklfj");
        querieStrings.add("asdjf");
        querieStrings.add("na");
        querieStrings.add("basdn");

        HashE hashTestes = new HashE();

        hashTestes.comparaLista(strings, querieStrings);


         List<List<Integer>> queries = Arrays.asList(Arrays.asList(1,2,100),
                                        Arrays.asList(2,5,100),
                                        Arrays.asList(3,4,100));

        hashTestes.arrayManipulation(10, queries);
    }
    
}
