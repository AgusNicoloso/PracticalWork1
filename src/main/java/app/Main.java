package app;

import clases.CampoBatalla;
import clases.Espartano;
import clases.Vikingo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Creo las listas ya cargadas
        List<Vikingo> listvikingo = Arrays.asList(new Vikingo("VAgustin"), new Vikingo("VMaxi"), new Vikingo("VCristian"));
        List<Espartano> listespartano = Arrays.asList(new Espartano("EAgustin"), new Espartano("EMaxi"), new Espartano("ECristian"));
        //Ordeno las listas
        Collections.sort(listvikingo);
        Collections.sort(listespartano);
        //Muestro las listas ordenadas
        System.out.print("----------Vikingos----------");
        Vikingo.mostrarlista(listvikingo);
        System.out.print("----------Espartanos----------");
        Espartano.mostrarlista(listespartano);
        System.out.print("----------Los dos primeros de cada lista----------");
        //Selecciono el primero de cada lista
        System.out.println(listvikingo.get(0));
        System.out.println(listespartano.get(0));
        System.out.println("----------A beber----------");
        //Los pongo a beber
        CampoBatalla.batalla(listvikingo.get(0), listespartano.get(0));


    }

}
