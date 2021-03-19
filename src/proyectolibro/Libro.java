 /*
    ARTURO BONILLA MEDINA 
    
 */
package proyectolibro;
 
import java.util.Random;

 
public class Libro {
    private String titulo;
    private String autor;
    private int numero_ejemplares;
    private int numero_ejemplares_prestamo;
    

    public Libro() {
        this.numero_ejemplares +=1;  
        
    }

    public Libro(Biblioteca biblioteca,String titulo, String autor , int numero_ejemplares ) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_ejemplares +=1;   
        biblioteca.setVariabilidad_titulos(biblioteca.getVariabilidad_titulos()+1);
    }
    public Libro(Biblioteca biblioteca,Libro libro1) {
        this.titulo = libro1.titulo;
        this.autor = libro1.autor;
        this.numero_ejemplares +=1;   
        biblioteca.setVariabilidad_titulos(biblioteca.getVariabilidad_titulos()+1);
    } 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_ejemplares() {
        return numero_ejemplares;
    }

    public void setNumero_ejemplares(int numero_ejemplares) {
        this.numero_ejemplares = numero_ejemplares;
    }

    public int getNumero_ejemplares_prestamo() {
        return numero_ejemplares_prestamo;
    }

    public void setNumero_ejemplares_prestamo(int numero_ejemplares_prestamo) {
        this.numero_ejemplares_prestamo = numero_ejemplares_prestamo;
    }
    
    public static boolean devolucion(Libro libro1, Libro libro2){
        boolean bool; 
        Random rand= new Random();
        if (rand.nextInt(2)!=1) {
                            if (libro2.getNumero_ejemplares()!=0) { 
                                bool=false;
                            } else {
                                libro2.setNumero_ejemplares_prestamo(libro2.getNumero_ejemplares_prestamo()-1);
                                libro2.setNumero_ejemplares(libro2.getNumero_ejemplares()+1);
                                bool=true;
                            }
                            
                        } else {
                            if (libro1.getNumero_ejemplares()!=0) {
                                
                                bool=false;
                            } else { 
                                libro1.setNumero_ejemplares_prestamo(libro1.getNumero_ejemplares_prestamo()+-1);
                                libro1.setNumero_ejemplares(libro1.getNumero_ejemplares()+1);
                                bool=true;
                              }  
                            }  
        
        return bool;
    }
    public static  void prestamo(Libro libro1, Libro libro2){
        Random rand= new Random();
        if (rand.nextInt(2)!=1) {
                            if (libro2.getNumero_ejemplares()==0) {
                                System.out.println("No quedan ejemplares disponibles de: "+libro2.getTitulo()); 
                            } else {
                                libro2.setNumero_ejemplares_prestamo(libro2.getNumero_ejemplares_prestamo()+1);
                                libro2.setNumero_ejemplares(libro2.getNumero_ejemplares()-1);
                                System.out.println("El libro que le prestaremos será: "+libro2.titulo);
                                System.out.println("Quedan "+libro2.numero_ejemplares);
                            }
                            
                        } else {
                            if (libro1.getNumero_ejemplares()==0) {
                                System.out.println("No quedan ejemplares disponibles de: "+libro1.titulo);
                            } else {
                            
                            libro1.setNumero_ejemplares_prestamo(libro1.getNumero_ejemplares_prestamo()+1);
                            libro1.setNumero_ejemplares(libro1.getNumero_ejemplares()-1);
                            System.out.println("El libro que le prestaremos será: "+libro1.titulo);
                            System.out.println("Quedan "+libro1.numero_ejemplares);
                            }
                                
                            } 
                        System.out.println("Gracias vuelva pronto");
          
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo:" + titulo + ", autor:" + autor + ", numero_ejemplares:" + numero_ejemplares + ", numero_ejemplares_prestamo:" + numero_ejemplares_prestamo + '}';
    }
    
    
}
