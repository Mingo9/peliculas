
package Cine;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
        
public class Cine {
     
   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    String opc;
    ArrayList<Pelicula> biblioteca = new ArrayList <>();
    
        System.out.println("Carga de datos a la Biblioteca: ");
        do{
            System.out.println("ingrese nombre de la pelicula: ");
            String titulo = leer.nextLine();
            System.out.println("ingrese nombre del director: ");
            String director = leer.nextLine();
            System.out.println("ingrese la duracion de la pelicula: ");
            double duracion = leer.nextDouble();
            
            leer.nextLine();
            Pelicula nueva = new Pelicula(titulo,director,duracion);
            biblioteca.add(nueva);
            
            System.out.println("Quiere agregar otra prelicula s/n?: ");
            opc=leer.nextLine(); 
          }while (opc.equalsIgnoreCase("S"));   
       
        System.out.println("------Lista------");
        System.out.println("");
        for(Pelicula i : biblioteca){
            System.out.println(""+i.toString());
    }   
        Iterator<Pelicula> iter = biblioteca.listIterator();
        leer.nextLine();
        
        //parte b
        System.out.println("peliculas de mas de 1hs: ");
        System.out.println("");
        for (Iterator<Pelicula> it = biblioteca.iterator(); it.hasNext();) {
            Pelicula i = it.next();
            if(1< i.getDuracion()){
                System.out.println("titulo "+i.getTitulo()+" Director "+i.getDirector()+" Duracion "+i.getDuracion());
            }
        }
        leer.nextLine();
        // parte c
      Collections.sort(biblioteca, new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t1.getDuracion(), t.getDuracion());
        }
    });
      System.out.println("Lista ordenada de forma decendente ");
      System.out.println("");
     iter= biblioteca.iterator();
     while (iter.hasNext()){
                         
         System.out.println(iter.next().toString());
     }
      //parte d
       Collections.sort(biblioteca, new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t.getDuracion(), t1.getDuracion());
        }
    });
       System.out.println("Lista ordenada de forma acendente ");
       System.out.println("");
      iter= biblioteca.iterator();
     while (iter.hasNext()){
         
         System.out.println(iter.next().toString());
     }
     
       Collections.sort(biblioteca, new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
    });
      System.out.println("Lista ordenada de forma alfabetica ");
      iter= biblioteca.iterator();
     while (iter.hasNext()){         
         System.out.println(iter.next().toString());
     }
     
    }       
    }
       

