package clases;

import java.util.List;

public class Espartano extends Humano implements Comparable<Espartano> {

    private Integer toleranciaExtra;

    public Espartano(String Nombre) {
        super(Nombre, (int) (Math.random() * (101 - 18) + 18), (int) (Math.random() * (101 - 40) + 40), new OrinarEspartanoImp(), new BeberEspartanoImp());
        this.toleranciaExtra = (int) (Math.random() * (91 - 80) + 80);
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public static void mostrarlista(List<Espartano> listespartano) {
        for (Espartano list : listespartano ) {
            System.out.println(list);
        }
    }

    @Override
    public int compareTo(Espartano e) {
        if (e.getPeso() < super.getPeso()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "\nEspartano[ " + "\nToleranciaExtra: " + toleranciaExtra + super.toString() + ']';
    }

}
