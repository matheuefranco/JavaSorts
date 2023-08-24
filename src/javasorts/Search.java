
package javasorts;

import java.util.Scanner;

public class Search {
    public static int compLinear=0,compBinaria=0;
    public static boolean 
        buscaLinear(int array[], int x){
        compLinear=0;    
        for(int i=0;i<array.length;i++){
           compLinear++;
            if(x == array[i])
               return true;
        }// fim for
        return false;    
    }// fim busca linear
  //-------------------
  public static boolean 
          buscaBinaria(int array[], int x){
    int ini,fim,meio;
    compBinaria=0;
    ini = 0;
    fim = array.length-1;
    while(ini<=fim){
        meio = (ini+fim)/2;
        compBinaria++;
        if(x == array[meio])
            return true;
         else if(x > array[meio])
            ini=meio+1;
          else
             fim = meio-1;
    }// fim while
    return false;
  }// fim buscaBinaria     
  //-----------------------------
  public static boolean 
          buscaBinariaComentado(int array[], int x){
    int ini,fim,meio;
     Scanner scanner = new Scanner(System.in);
    compBinaria=0;
    ini = 0;
    fim = array.length-1;
    while(ini<=fim){
        meio = (ini+fim)/2;
        System.out.println("Ini:"+ini+"Fim:"+fim+"Meio:"+meio);
        JavaSorts.printIntervalo(array, ini, fim);
        compBinaria++;
        System.out.println("Comparando com:"+array[meio]);
        scanner.nextLine();// pausa
        if(x == array[meio])
            return true;
         else if(x > array[meio])
            ini=meio+1;
          else
             fim = meio-1;
    }// fim while
    return false;
  }// fim buscaBinaria              
    
}
