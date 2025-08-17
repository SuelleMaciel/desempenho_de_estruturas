import java.util.*;

/*
    Para responder essa questão, utilizamos List<Integer> porque precisamos escolher o índice em que cada item será
adicionado. A interface Collection<Integer> não seria útil nesse caso, já que o método "add" só recebe o item como
parâmetro e não permite que eu especifique a posição de inserção.
 */

public class Atividade02 {

    public static void main(String[] args){

        List<Integer> lista_arraylist = new ArrayList<>();
        List<Integer> lista_linkedlist = new LinkedList<>();

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
            lista_arraylist.add(0,i);
        }
        endtime = System.nanoTime();
        double tempofinal1 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d no inicio do ArrayList: %f segundos%n", TOTAL_ELEMENTOS1, tempofinal1/1000000000);

        //----------------------------------------------
        //LinkedList (100.000)

        lista_linkedlist = new LinkedList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS1; i++){
            lista_arraylist.add(0,i);
        }
        endtime = System.nanoTime();
        double tempofinal2 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d no inicio do LinkedList: %f segundos%n", TOTAL_ELEMENTOS1, tempofinal2/1000000000);



        //----------------- TESTES COM 250.000: -----------------



        System.out.println("\n" + " ".repeat(12) + "TESTE PARA UMA MASSA DE DADOS = 250.000\n");



        //----------------------------------------------
        //ArrayList (250.000)

        lista_arraylist = new ArrayList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_arraylist.add(0,i);
        }
        endtime = System.nanoTime();
        double tempofinal3 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d no inicio do LinkedList: %f segundos%n", TOTAL_ELEMENTOS2, tempofinal3/1000000000);

        //----------------------------------------------
        //LinkedList (250.000)

        lista_linkedlist = new LinkedList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS2; i++){
            lista_arraylist.add(0,i);
        }
        endtime = System.nanoTime();
        double tempofinal4 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d no inicio do LinkedList: %f segundos%n", TOTAL_ELEMENTOS2, tempofinal4/1000000000);



        //----------------- TESTES COM 500.000: -----------------



        System.out.println("\n" + " ".repeat(12) + "TESTE PARA UMA MASSA DE DADOS = 500.000\n");



        //----------------------------------------------
        //ArrayList (500.000)
        lista_arraylist = new ArrayList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){
            lista_arraylist.add(0,i);
        }
        endtime = System.nanoTime();
        double tempofinal5 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d no inicio do ArrayList: %f segundos%n", TOTAL_ELEMENTOS3, tempofinal5/1000000000);

        //----------------------------------------------
        //LinkedList (500.000)

        lista_linkedlist = new LinkedList<>();

        starttime = System.nanoTime();
        for(int i = 1; i <= TOTAL_ELEMENTOS3; i++){
            lista_arraylist.add(0,i);
        }
        endtime = System.nanoTime();
        double tempofinal6 = endtime - starttime;
        System.out.printf("Tempo gasto para adicionar %d no inicio do LinkedList: %f segundos%n", TOTAL_ELEMENTOS3, tempofinal6/1000000000);
    }
}
