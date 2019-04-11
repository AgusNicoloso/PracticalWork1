package clases;

import interfaces.Orinar;

public class OrinarVikingoImp implements Orinar { //Implemento la interfaz Orinar
    //Constructor

    public OrinarVikingoImp() {
    }

    //Implemento el metodo orinar()
    @Override
    public String orinar() {
        return "Vikingo orinando, no aguante";
    }

}
