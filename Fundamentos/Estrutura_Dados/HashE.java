package Fundamentos.Estrutura_Dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
}
