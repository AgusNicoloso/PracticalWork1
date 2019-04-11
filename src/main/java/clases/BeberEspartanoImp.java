package clases;

import interfaces.Beber;

public class BeberEspartanoImp implements Beber {//Implemento la interfaz Beber

    //Constructor
    public BeberEspartanoImp() {
    }

    //Implemento el metodo beber()
    @Override
    public String beber() {
        return "Espartano bebiendo";
    }
}
