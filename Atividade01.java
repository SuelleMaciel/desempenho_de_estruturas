import java.util.*;

public class Atividade01 {

    public static void main(String[] args){
        //----------------------------------------------
        //ArrayList (100.000)

        int TOTAL_ELEMENTOS = 100000;
        int TOTAL_ELEMENTOS2 = 500000;

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
            conjunto_treeset.contains(i);
        }
        long endtime6 = System.nanoTime();
        double tempofinal6 = endtime6 - starttime6;
        System.out.printf("Tempo gasto para verificar o contains() no TreeSet: %f segundos%n", tempofinal6/1000000000);

        //----------------------------------------------
        //HashSet (100.000)

        HashSet<Integer> conjunto_HashSet = new HashSet<Integer>();
        long starttime7 = System.nanoTime();
        for (int i = 1; i<=TOTAL_ELEMENTOS; i++){
            conjunto_HashSet.add(i);
        }
        long endtime7 = System.nanoTime();
        double finaltime7 = endtime7 - starttime7;
        System.out.printf("Tempo gasto para adicionar %d elementos no HashSet: %f segundos%n", TOTAL_ELEMENTOS, finaltime7/1000000000);

        long starttime8 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS; i++){
            conjunto_HashSet.contains(i);
        }
        long endtime8 = System.nanoTime();
        double tempofinal8 = endtime8 - starttime8;
        System.out.printf("Tempo gasto para verificar o contains() no HashSet: %f segundos%n", tempofinal8/1000000000);

        //----------------------------------------------
        //Testes com 500.000:

        //ArrayList (500.000)
        lista_arraylist = new ArrayList<>();
        long starttime9 = System.nanoTime();
        for (int i= 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_arraylist.add(i);
        }
        long endtime9 = System.nanoTime();
        double tempofinal9 = endtime9 - starttime9;
        System.out.printf("Tempo gasto para adicionar %d elementos no ArrayList: %f segundos.\n", TOTAL_ELEMENTOS2, tempofinal9/1000000000);

        long starttime10 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_arraylist.contains(i);
        }
        long endtime10 = System.nanoTime();
        double tempofinal10 = endtime10 - starttime10;
        System.out.printf("Tempo gasto para verificar o contains() no ArrayList: %f segundos.\n", tempofinal10/1000000000);

        //LinkedList (500.000)
        lista_linkedlist = new LinkedList<>();
        long starttime11 = System.nanoTime();
        for (int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_linkedlist.add(i);
        }
        long endtime11 = System.nanoTime();
        double tempofinal11 = endtime11 - starttime11;
        System.out.printf("Tempo gasto para adicionar %d elementos na LinkedList: %f segundos.\n", TOTAL_ELEMENTOS2, tempofinal11/1000000000);

        long starttime12 = System.nanoTime();

        //comentem aqui até a linha 129
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_linkedlist.contains(i);
        }
        long endtime12 = System.nanoTime();
        double tempofinal12 = endtime12 - starttime12;
        System.out.printf("Tempo gasto para verificar o contains() no LinkedList: %f segundos.\n", tempofinal12/1000000000);

        //TreeSet (500.000)
        conjunto_treeset = new TreeSet<>();
        long starttime13 = System.nanoTime();
        for (int i = 1; i<=TOTAL_ELEMENTOS2; i++){
            conjunto_treeset.add(i);
        }
        long endtime13 = System.nanoTime();
        double finaltime13 = endtime13 - starttime13;
        System.out.printf("Tempo gasto para adicionar %d elementos no TreeSet: %f segundos%n", TOTAL_ELEMENTOS2, finaltime13/1000000000);

        long starttime14 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            conjunto_treeset.contains(i);
        }
        long endtime14 = System.nanoTime();
        double tempofinal14 = endtime14 - starttime14;
        System.out.printf("Tempo gasto para verificar o contains() no TreeSet: %f segundos%n", tempofinal14/1000000000);

        //HashSet (500.000)
        conjunto_HashSet = new HashSet<Integer>();
        long starttime15 = System.nanoTime();
        for (int i = 1; i<=TOTAL_ELEMENTOS2; i++){
            conjunto_HashSet.add(i);
        }
        long endtime15 = System.nanoTime();
        double finaltime15 = endtime15 - starttime15;
        System.out.printf("Tempo gasto para adicionar %d elementos no HashSet: %f segundos%n", TOTAL_ELEMENTOS2, finaltime15/1000000000);

        long starttime16 = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            conjunto_HashSet.contains(i);
        }
        long endtime16 = System.nanoTime();
        double tempofinal16 = endtime16 - starttime16;
        System.out.printf("Tempo gasto para verificar o contains() no HashSet: %f segundos%n", tempofinal16/1000000000);
    }
}