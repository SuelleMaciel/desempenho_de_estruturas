import java.util.*;

public class Atividade01 {

    public static void main (String[] args){

        List<Integer> lista_arraylist = new ArrayList<>();
        List<Integer> lista_linkedlist = new LinkedList<>();
        Set<Integer> conjunto_treeset = new TreeSet<>();
        Set<Integer> conjunto_hashset = new HashSet<>();

        int TOTAL_ELEMENTOS1 = 100000;
        int TOTAL_ELEMENTOS2 = 250000;
        int TOTAL_ELEMENTOS3 = 500000;

        long starttime;
        long endtime;

        

        //----------------- TESTES COM 100.000: -----------------



        System.out.println("\n" + " ".repeat(12) + "TESTE PARA UMA MASSA DE DADOS = 100.000\n");



        //----------------------------------------------
        //ArrayList (100.000)

        lista_arraylist = new ArrayList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){
            lista_arraylist.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final1 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no ArrayList: %f segundos%n", TOTAL_ELEMENTOS1, tempo_final1/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){

            lista_arraylist.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains1 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no ArrayList: %f segundos%n", tempofinal_contains1/1000000000);

        //----------------------------------------------
        //LinkedList (100.000)

        lista_linkedlist = new LinkedList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){
            lista_linkedlist.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final2 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no LinkedList: %f segundos%n", TOTAL_ELEMENTOS1, tempo_final2/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){

            lista_linkedlist.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains2 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no LinkedList: %f segundos%n", tempofinal_contains2/1000000000);

        //----------------------------------------------
        //TreeSet (100.000)

        conjunto_treeset = new TreeSet<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){
            conjunto_treeset.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final3 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no TreeSet: %f segundos%n", TOTAL_ELEMENTOS1, tempo_final3/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){

            conjunto_treeset.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains3 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no TreeSet: %f segundos%n", tempofinal_contains3/1000000000);

        //----------------------------------------------
        //HashSet (100.000)

        conjunto_hashset = new HashSet<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){
            conjunto_hashset.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final4 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no HashSet: %f segundos%n", TOTAL_ELEMENTOS1, tempo_final4/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){

            conjunto_hashset.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains4 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no HashSet: %f segundos%n", tempofinal_contains4/1000000000);



        //----------------- TESTES COM 250.000: -----------------



        System.out.println("\n" + " ".repeat(12) + "TESTE PARA UMA MASSA DE DADOS = 250.000\n");



        //----------------------------------------------
        // ArrayList (250.000)

        lista_arraylist = new ArrayList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <=TOTAL_ELEMENTOS2; i++){
            lista_arraylist.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final5 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no ArrayList: %f segundos%n", TOTAL_ELEMENTOS2, tempo_final5/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){

            lista_arraylist.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains5 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no ArrayList: %f segundos%n", tempofinal_contains5/1000000000);

        //----------------------------------------------
        // LinkedList (250.000)

        lista_linkedlist = new LinkedList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_linkedlist.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final6 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no LinkedList: %f segundos%n", TOTAL_ELEMENTOS2, tempo_final6/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){

            lista_linkedlist.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains6 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no LinkedList: %f segundos%n", tempofinal_contains6/1000000000);

        //----------------------------------------------
        // TreeSet (250.000)

        conjunto_treeset = new TreeSet<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            conjunto_treeset.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final7 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no TreeSet: %f segundos%n", TOTAL_ELEMENTOS2, tempo_final7/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){

            conjunto_treeset.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains7 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no TreeSet: %f segundos%n", tempofinal_contains7/1000000000);

        //----------------------------------------------
        // HashSet (250.000)

        conjunto_hashset = new HashSet<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            conjunto_hashset.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final8 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no HashSet: %f segundos%n", TOTAL_ELEMENTOS2, tempo_final8/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){

            conjunto_hashset.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains8 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no HashSet: %f segundos%n", tempofinal_contains8/1000000000);



        //----------------- TESTES COM 500.000: -----------------



        System.out.println("\n" + " ".repeat(12) + "TESTE PARA UMA MASSA DE DADOS = 500.000\n");



        //----------------------------------------------
        // ArrayList (500.000)

        lista_arraylist = new ArrayList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <=TOTAL_ELEMENTOS3; i++){
            lista_arraylist.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final9 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no ArrayList: %f segundos%n", TOTAL_ELEMENTOS3, tempo_final9/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){

            lista_arraylist.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains9 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no ArrayList: %f segundos%n", tempofinal_contains9/1000000000);

        //----------------------------------------------
        // LinkedList (500.000)

        lista_linkedlist = new LinkedList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){
            lista_linkedlist.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final10 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no LinkedList: %f segundos%n", TOTAL_ELEMENTOS3, tempo_final10/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){

            lista_linkedlist.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains10 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no LinkedList: %f segundos%n", tempofinal_contains10/1000000000);

        //----------------------------------------------
        // TreeSet (500.000)

        conjunto_treeset = new TreeSet<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){
            conjunto_treeset.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final11 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no TreeSet: %f segundos%n", TOTAL_ELEMENTOS3, tempo_final11/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){

            conjunto_treeset.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains11 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no TreeSet: %f segundos%n", tempofinal_contains11/1000000000);

        //----------------------------------------------
        // HashSet (500.000)

        conjunto_hashset = new HashSet<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){
            conjunto_hashset.add(i);
        }
        endtime = System.nanoTime();

        double tempo_final12 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d elementos no HashSet: %f segundos%n", TOTAL_ELEMENTOS3, tempo_final12/1000000000);

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){

            conjunto_hashset.contains(i);
        }
        endtime = System.nanoTime();
        double tempofinal_contains12 = endtime - starttime;
        System.out.printf("Tempo gasto para verificar o contains() no HashSet: %f segundos%n", tempofinal_contains12/1000000000);  
    }  
}