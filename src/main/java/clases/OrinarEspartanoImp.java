package clases;

import interfaces.Orinar;

public class OrinarEspartanoImp implements Orinar { //Implemento la interfaz Orinar
    //Constructor

    public OrinarEspartanoImp() {
    }

    //Implemento el metodo orinar()
    @Override
    public String orinar() {
        return "Espartano orinando, no aguante";
    }

}
