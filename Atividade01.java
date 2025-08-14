
import java.util.*;

public class Atividade01 {

    public static void main(String[] args){
        //----------------------------------------------
        //ArrayList (100.000)

        int TOTAL_ELEMENTOS = 100000;

        List<Integer> lista_arraylist = new ArrayList<>();

        long starttime1 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS; i++){

            lista_arraylist.add(i);
        }
        long endtime1 = System.nanoTime();
        double tempofinal1 = endtime1 - starttime1;
        System.out.printf("Tempo gasto para adicionar %d elementos no ArrayList: %f segundos%n", TOTAL_ELEMENTOS, tempofinal1/1000000000);

        long starttime2 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS; i++){

            lista_arraylist.contains(i);
        }
        long endtime2 = System.nanoTime();
        double tempofinal2 = endtime2 - starttime2;
        System.out.printf("Tempo gasto para verificar o contains() no ArrayList: %f segundos%n", tempofinal2/1000000000);

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
        

        long starttime4 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS; i++){
            lista_linkedlist.contains(i);
        }
        long endtime4 = System.nanoTime();
        double tempofinal4 = endtime4 - starttime4;
        System.out.printf("Tempo gasto para verificar o contains() no LinkedList: %f segundos%n", tempofinal4/1000000000);  
        
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

        long starttime6 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS; i++){
            lista_linkedlist.contains(i);
        }
        long endtime6 = System.nanoTime();
        double tempofinal6 = endtime6 - starttime6;
        System.out.printf("Tempo gasto para verificar o contains() no TreeSet: %f segundos%n", tempofinal6/1000000000);

    }





    
}
