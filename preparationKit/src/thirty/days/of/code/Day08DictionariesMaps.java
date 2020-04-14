package thirty.days.of.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08DictionariesMaps {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> dicionario = new HashMap<>();
        
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dicionario.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(dicionario.containsKey(s)) {
            	System.out.println(s + "=" + dicionario.get(s));
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
