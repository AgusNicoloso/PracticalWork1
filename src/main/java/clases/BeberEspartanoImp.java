package clases;

import interfaces.Beber;

public class BeberEspartanoImp implements Beber {

    public BeberEspartanoImp() {
    }

    @Override
    public String beber() {
        return "Espartano bebiendo";
    }
}
