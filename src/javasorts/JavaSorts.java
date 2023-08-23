package javasorts;
import java.util.Random;
import java.util.Scanner;
public class JavaSorts {
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1-Gerar dados");
        System.out.println("2-Entrar com dados");
        op = scanner.nextInt();
        return op;
    }
    
        static int menuMetodos(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1-Bubble Sort");
        System.out.println("2-Selection Sort");
        System.out.println("3-Insertion Sort");
        System.out.println("4-Compara métodos");
        System.out.println("5-Busca Linear");
        System.out.println("6-Busca Binária");
        System.out.println("0-Sair");
        op = scanner.nextInt();
        return op;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho,op,valorBusca;
        long tempoInicial,tempoFinal;
        
        System.out.println("Tamanho do vetor:");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        op = menuEntrada();
        switch(op){
            case 1:for(int i=0;i<vetor.length;i++)
                        vetor[i] = rand.nextInt(100);
            break;   
            case 2: System.out.println("Dados vetor:");
                    for(int i=0;i<vetor.length;i++)
                        vetor[i] = scanner.nextInt();
            break;        
       }// fim switch
        System.out.println("Vetor original:");
        printArray(vetor);
        do{
        op = menuMetodos();
        switch(op){
            case 3: InsertionSort.iSort(vetor);
                    System.out.println("Ordenado:");
                    printArray(vetor);
            break;
            case 5: System.out.println("Valor:");
                    valorBusca=scanner.nextInt();
                    if(Search.buscaLinear(vetor, valorBusca))
                        System.out.println("Encontrado");
                    else
                        System.out.println("Inexistente");
            break;
            case 6: System.out.println("Valor:");
                    valorBusca=scanner.nextInt();
                    if(Search.buscaBinaria(vetor, valorBusca))
                        System.out.println("Encontrado");
                    else
                        System.out.println("Inexistente");        
            break;
            case 0: System.out.println("Saindo");
        }// fim switch
        }while(op!=0);
       /* int[] vetor2 = vetor.clone();
        int[] vetor3 = vetor.clone();


        //Bubble Sort
        System.out.println("Bubble Sort");
        tempoInicial = System.currentTimeMillis();
        BubbleSort.bSort(vetor);
        tempoFinal = System.currentTimeMillis();
        System.out.println
          ("Comparacoes:"+BubbleSort.compara);
        System.out.println("Trocas:"+BubbleSort.trocas);
        System.out.println("Tempo:"+(tempoFinal-tempoInicial));
       //SelectionSort 
       System.out.println("Selection Sort");
       tempoInicial = System.currentTimeMillis();
       SelectionSort.sSort(vetor2);
        tempoFinal = System.currentTimeMillis();
        System.out.println
          ("Comparacoes:"+SelectionSort.compara);
        System.out.println("Trocas:"+SelectionSort.trocas);
        System.out.println("Tempo:"+(tempoFinal-tempoInicial));
       
       System.out.println("Insertion Sort");
       tempoInicial = System.currentTimeMillis();
        InsertionSort.iSort(vetor);
        tempoFinal = System.currentTimeMillis();
        System.out.println
          ("Comparacoes:"+InsertionSort.compara);
        System.out.println("Deslocamento:"+InsertionSort.deslocamento);
        System.out.println("Tempo:"+(tempoFinal-tempoInicial));
       
        
        System.out.println("Vetor ordenado");
        //printArray(vetor);*/
    }
    
    public static void printArray(int array[]){
          for(int i=0;i<array.length;i++)
              System.out.print(array[i]+"| ");
          
          System.out.println("\n");
    }// fim printArray
    
}
