package busquedarecursiva;

import java.util.Scanner;

public class BusquedaRecursiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vector[] = {1,2,3,6,9,10};//Elementos Ordenados con 5 elementos
        BusquedaRecursiva b = new BusquedaRecursiva();
        System.out.print("Buscar: ");
        int buscar = teclado.nextInt();
        
  
        if(posicion==-1){
            System.out.println("No existe el numero");
        }else{
            System.out.println("Posicion: "+posicion);
        }
    }
    
    public int busquedaBinaria(int vector[], int dato, int inferior, int superior){
        int mitad;
        if(inferior > superior){
            return -1;
        }else{
            mitad = (inferior+superior)/2;
            if(dato==vector[mitad]){
                return mitad;
            }else if(dato>vector[mitad]){
                return busquedaBinaria(vector, dato, mitad+1, superior);
            }else{
                return busquedaBinaria(vector, dato, inferior, mitad-1);
            }
            
        }
    }
}
