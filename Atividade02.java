import java.util.*;

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
        
        //----------------------------------------------
        //TreeSet (100.000)

        Set<Integer> conjunto_treeset = new TreeSet<>();
        long starttime5 = System.nanoTime();
        for(int i = 1 ; i <= TOTAL_ELEMENTOS; i++){
            conjunto_treeset.add(i);
        }
        long endtime5 = System.nanoTime();
        double tempofinal5 = endtime5 - starttime5;
        System.out.printf("Tempo gasto para adicionar %d elementos no TreeSet: %f segundos%n", TOTAL_ELEMENTOS, tempofinal5/1000000000);
    }
    
}
