package app;

import clases.BeberVikingoImp;
import clases.CampoBatalla;
import clases.Espartano;
import clases.Humano;
import clases.OrinarEspartanoImp;
import clases.Vikingo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Creo las listas ya cargadas
        List<Vikingo> listvikingo = Arrays.asList(new Vikingo("VAgustin"), new Vikingo("VMaxi"), new Vikingo("VCristian"));
        List<Espartano> listespartano = Arrays.asList(new Espartano("EAgustin"), new Espartano("EMaxi"), new Espartano("ECristian"));
        //Creo al boss
        Humano boss = new Humano("Bullrich", 62, 87, new OrinarEspartanoImp(), new BeberVikingoImp());
        //Ordeno las listas
        Collections.sort(listvikingo);
        Collections.sort(listespartano);
        //Muestro las listas ordenadas
        System.out.print("----------Vikingos ordenados por peso (DNI IMPAR)----------");
        Vikingo.mostrarlista(listvikingo);
        System.out.print("----------Espartanos ordenados por peso (DNI IMPAR)----------");
        Espartano.mostrarlista(listespartano);
        System.out.print("----------Selecciono los dos primeros de cada lista (DNI IMPAR)----------");
        //Selecciono el primero de cada lista
        System.out.println(listvikingo.get(0));
        System.out.println(listespartano.get(0));
        System.out.println("----------A beber Primera ronda----------");
        //Los pongo a beber
        CampoBatalla.batalla(listvikingo.get(0), listespartano.get(0), boss);
    }

}
