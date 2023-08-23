
package javasorts;

public class Search {
    public static boolean 
        buscaLinear(int array[], int x){
        for(int i=0;i<array.length;i++){
           if(x == array[i])
               return true;
        }// fim for
        return false;    
    }// fim busca linear
  //-------------------
  public static boolean 
          buscaBinaria(int array[], int x){
    int ini,fim,meio;
    ini = 0;
    fim = array.length-1;
    while(ini<=fim){
        meio = (ini+fim)/2;
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
