import java.util.*;

/*
    Para responder essa questão, utilizamos List<Integer> porque precisamos escolher o índice em que cada item será
adicionado. A interface Collection<Integer> não seria útil nesse caso, já que o método "add" só recebe o item como
parâmetro e não permite que eu especifique a posição de inserção.
 */

public class Atividade02 {

    public static void main(String[] args){
        //----------------------------------------------
        //ArrayList (100.000)

        int TOTAL_ELEMENTOS = 100000;

        List<Integer> lista_arraylist = new ArrayList<>();

        long starttime1 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS; i++){

            lista_arraylist.add(0,i);
        }
        long endtime1 = System.nanoTime();
        double tempofinal1 = endtime1 - starttime1;
        System.out.printf("Tempo gasto para adicionar um elemento no inicio do ArrayList: %f segundos%n", tempofinal1/1000000000);

        //----------------------------------------------
        //LinkedList (100.000)

        List<Integer> lista_linkedlist = new LinkedList<>();
        long starttime3 = System.nanoTime();
        for(int i = 1 ; i <= TOTAL_ELEMENTOS; i++){

            lista_linkedlist.add(i);
        }
        long endtime3 = System.nanoTime();
        double tempofinal3 = endtime3 - starttime3;
        System.out.printf("Tempo gasto para adicionar %d elementos no LinkedList: %f segundos%n", TOTAL_ELEMENTOS, tempofinal3/1000000000);
        
    }
    
}
