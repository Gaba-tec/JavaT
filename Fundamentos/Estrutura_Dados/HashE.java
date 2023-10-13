package Fundamentos.Estrutura_Dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        Map<Integer,Long> map = new HashMap<Integer,Long>();
        long max = Integer.MIN_VALUE;

        for(int i = 0; i < queries.size(); i++)
        {
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            
            
            while(a <= b)
            {
                long k = queries.get(i).get(2);

                if(map.get(a) != null)
                {
                    k += map.get(a);
                    map.put(a,k);
                }
                else
                {
                    map.put(a,k);
                }

                if(k > max)
                {
                    max = k;
                }

                a++;
            }
           
        
        }

        return max;
    
    }

}

/*
 for(int x = queries.get(i).get(0); x <= queries.get(i).get(1); x++)
            {
                long k = queries.get(i).get(2);

                if(map.get(x) != null)
                {
                    k += map.get(x);
                    map.put(x, k);
                }
                else
                {
                    map.put(x, k);
                }
                
            }
 */