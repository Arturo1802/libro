/*
    ARTURO BONILLA MEDINA 
    
 */
package proyectolibro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Boni
 */
public class ProyectoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        Random rand=new Random(2);
        
        Biblioteca biblioteca= new Biblioteca("Biblio TECa", 0);
        Libro libro1=new Libro(biblioteca,"El primero","Si",4);
        Libro libro2=new Libro(); 
        System.out.println("Ingrese el nombre del libro");
        libro2.setTitulo(v.nextLine()); 
        System.out.println("Ingrese el autor del libro");
        libro2.setAutor(v.nextLine());
        System.out.println("Ingrese cuantos libros disponibles de este titulo hay");
        libro2.setNumero_ejemplares(v.nextInt());
        System.out.println("¿Cuantos libros prestados hay?");
        libro2.setNumero_ejemplares_prestamo(v.nextInt());
        
        int i=0,numero_titulos=0,ejemplares2=libro2.getNumero_ejemplares();
        
        
        do { 
            System.out.println("⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆");
            System.out.println("Que desea hacer");
            System.out.println("1. Préstamo");
            System.out.println("2. Devolución");
            System.out.println("3. Salir");
            
            switch(v.nextInt()){
                case 1: 
                     Libro.prestamo(libro1, libro2) ;
                     System.out.println("⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆");
                    break;
                case 2: 
                    if (Libro.devolucion(libro1, libro2)) {
                        System.out.println("Gracias por devolver el libro, vuelva pronto");
                    } else {
                        System.out.println("No puede devolver un libro que no es de esta biblioteca");
                    }
                    System.out.println("⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆");
                    break;
                 default:
                    System.out.println("Ingrese un numero valido");
                    System.out.println("⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆⇆");
                    break;
            }
            
        } while (i!=3);
    }
    
}
