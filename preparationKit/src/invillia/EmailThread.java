package invillia;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getEmailThreads' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts STRING_ARRAY emails as parameter.
     */

    public static List<List<Integer>> getEmailThreads(List<String> emails) {
        int contaThread = 0;
        int contaEmailsPorThread = 1;

        List<List<Integer>> lista = new ArrayList<List<Integer>>();
        List<String> listaEmailUnico = new ArrayList<>();
        for(String e: emails){
            String[] arrStr = e.split(",",3);
            listaEmailUnico.add(arrStr[0]);
            if(arrStr[0] != arrStr[1] && !listaEmailUnico.contains(arrStr[0])){
                listaEmailUnico.add(arrStr[1]);
                contaThread++;
            }
        }

        return  lista;
    }

}

public class EmailThread {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int emailsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> emails = IntStream.range(0, emailsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<List<Integer>> result = Result.getEmailThreads(emails);



        bufferedReader.close();

    }
}
