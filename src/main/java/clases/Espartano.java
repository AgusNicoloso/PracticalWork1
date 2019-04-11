package clases;

import java.util.List;

public class Espartano extends Humano implements Comparable<Espartano> {

    private Integer toleranciaExtra;

    //Constructor del espartano todo con valores aleatorios, menos el nombre que se pasa por parametro
    public Espartano(String Nombre) {
        super(Nombre, (int) (Math.random() * (101 - 18) + 18), (int) (Math.random() * (101 - 40) + 40), new OrinarEspartanoImp(), new BeberEspartanoImp());
        this.toleranciaExtra = (int) (Math.random() * (91 - 80) + 80);
    }

    //Obtengo la tolerancia
    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    //Seteo la tolerancia
    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    //Muestro la lista de espartanos
    public static void mostrarlista(List<Espartano> listespartano) {
        listespartano.forEach((list) -> {
            System.out.println(list);
        });
    }

    //Uso como criterio de ordenamiento, el peso (De mayor a menor)
    @Override
    public int compareTo(Espartano e) {
        if (e.getPeso() < super.getPeso()) {
            return -1;
        } else {
            return 1;
        }
    }

    //Muestro los datos del espartano
    @Override
    public String toString() {
        return "\nEspartano[ " + "\nToleranciaExtra: " + toleranciaExtra + super.toString() + ']';
    }

}
