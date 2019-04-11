package clases;

import interfaces.Beber;

public class BeberVikingoImp implements Beber {//Implemento la interfaz Beber

    //Constructor
    public BeberVikingoImp() {
    }

    //Implemento el metodo beber()
    @Override
    public String beber() {
        return "Vikingo bebiendo";
    }

}
