package Fundamentos.Estrutura_Dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dynamic {
    
    
    public List<Integer> DynamicArray(int n, List<List<Integer>> queries) {
        
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> lastAnswers = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        for (List<Integer> querie : queries) 
        {
            int type = querie.get(0);
            int x = querie.get(1);
            int y = querie.get(2);

            int idx = (x ^ lastAnswer) % n;

            if(type == 1)
            {
                arr.get(idx).add(y);
            }
            else
            {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                lastAnswers.add(lastAnswer); 
            }

        }

        return lastAnswers;
    }

    public List<Integer> rotateLeft(int d, List<Integer> arr)
    {
        int x = 0;
        while(x < d)
        {
            for(int i = 0; i < arr.size() - 1; i++)
            {
                Collections.swap(arr,i,i+1);
            }

            x++;
        }

        return arr;
    }
}
