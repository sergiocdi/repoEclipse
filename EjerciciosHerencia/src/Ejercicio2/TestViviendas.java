package Ejercicio2;


/**
 * Write a description of class TestViviendas here.
 */
public class TestViviendas
{
    
    public static void main(String args[]){
        Piso piso1, piso2, piso3;
        Casa casa1,casa2,casa3;
        
        piso1 = new Piso(TipoVivienda.d�plex,4,120,480000,"Gij�n", "Viesques",150,true);
        piso2 = new Piso(TipoVivienda.Piso,2,70,150000,"Gij�n", "Montevil",60,true);
        piso3 = new Piso(TipoVivienda.d�plex,4,120,480000,"Gij�n", "Viesques",150,true);
        
        casa1 = new Casa(TipoVivienda.chalet, 5, 200, 500000, "Gij�n", "Cabue�es", 1200, false);
        casa2 = new Casa(TipoVivienda.chalet, 3, 200, 500000, "Oviedo", "Cabue�es", 1200, true);
        casa3 = new Casa(TipoVivienda.chalet, 5, 200, 500000, "Gij�n", "Cabue�es", 1200, false);
        
        //ver datos de los pisos
        System.out.println("Datos del piso1: "+piso1.toString());
        System.out.println("La comisi�n para el piso1 es: "+piso1.comision());
        
        System.out.println("Datos del piso2: "+piso2.toString());
        System.out.println("La comisi�n para el piso2 es: "+piso2.comision());
        
        System.out.println("Datos de la casa1: " +casa1.toString());
        System.out.println("La comisi�n para la casa1 es: "+casa1.comision());
        
        if(casa1.equals(casa2)) {
        	System.out.println("casa1 y casa2 son igualse");
        }
        else {
        	System.out.println("casa1 y casa2 no son igualse");
        }
        
        if(casa1.equals(casa3)) {
        	System.out.println("casa1 y casa3 son igualse");
        }
        else {
        	System.out.println("casa1 y casa3 no son igualse");
        }
        

    }     
        
}