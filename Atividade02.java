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
        System.out.printf("Tempo gasto para adicionar %d no inicio do ArrayList: %f segundos%n", TOTAL_ELEMENTOS, tempofinal1/1000000000);

        //----------------------------------------------
        //LinkedList (100.000)

        List<Integer> lista_linkedlist = new LinkedList<>();
        long starttime2 = System.nanoTime();
        for(int i = 1 ; i <= TOTAL_ELEMENTOS; i++){
            lista_linkedlist.add(0, i);
        }
        long endtime2 = System.nanoTime();
        double tempofinal2 = endtime2 - starttime2;
        System.out.printf("Tempo gasto para adicionar %d elementos no LinkedList: %f segundos%n", TOTAL_ELEMENTOS, tempofinal2/1000000000);

        //----------------------------------------------
        //ArrayList (500.000)

        int TOTAL_ELEMENTOS2 = 500000;
        List<Integer> lista_arraylist_500k = new ArrayList<>();

        long starttime3 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_arraylist_500k.add(0,i);
        }
        long endtime3 = System.nanoTime();
        double tempofinal3 = endtime3 - starttime3;
        System.out.printf("Tempo gasto para adicionar %d no inicio do ArrayList: %f segundos.%n",TOTAL_ELEMENTOS2, tempofinal3/1000000000);

        //----------------------------------------------
        //LinkedList (500.000)

        List<Integer> lista_linkedlist_500k = new LinkedList<>();
        long starttime4 = System.nanoTime();
        for (int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_linkedlist_500k.add(0,i);
        }
        long endtime4 = System.nanoTime();
        double tempofinal4 = endtime4 - starttime4;
        System.out.printf("Tempo gasto para adicionar %d no início do LinkedList: %f segundos.%n", TOTAL_ELEMENTOS2, tempofinal4/1000000000);

    }
    
}
