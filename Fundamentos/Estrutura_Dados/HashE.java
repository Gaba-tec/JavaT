package Fundamentos.Estrutura_Dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashE {
    



    public List<Integer> comparaLista(List<String> stringList, List<String> queries)
    {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        // <chave,valor>

        List<Integer> listRepost = new ArrayList<>();

        for(String s: stringList)
        {
            int valor = 1;
            if(hashMap.containsKey(s)) valor += hashMap.get(s);
            hashMap.put(s, valor);
        }

        for(String q: queries)
        {
            int num = 0;
            if(hashMap.get(q) != null) num = hashMap.get(q);
            listRepost.add(num);
        }

        return listRepost;
    }


    public  long arrayManipulation(int n, List<List<Integer>> queries)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        long max = Integer.MIN_VALUE;
        Map<Integer,Long> min = new HashMap<Integer,Long>();

        /* 
        for(int i = 1; i <= n; i++)
        {
            map.put(i, 0);
        }
        */

        for(int x = 0; x < queries.size(); x++)
        {
            int a = queries.get(x).get(0);
            int b = queries.get(x).get(1);
            int valueK = queries.get(x).get(2);
            while(a <= b)
            {
                if(map.containsKey(a))valueK += map.get(a);

                map.put(a, valueK);

                valueK = queries.get(x).get(2);

                if(map.get(a) > max) max = map.get(a);

                a++;
            }

        }

        return max;
    
    }

}
