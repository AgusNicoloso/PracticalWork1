package clases;

import java.util.List;

public class Vikingo extends Humano implements Comparable<Vikingo> {

    private Integer BebedorProfesional;

    //Constructor del vikingo todo con valores aleatorios, menos el nombre que se pasa por parametro
    public Vikingo(String Nombre) {
        super(Nombre, (int) (Math.random() * (101 - 18) + 18), (int) (Math.random() * (101 - 40) + 40), new OrinarVikingoImp(), new BeberVikingoImp());
        this.BebedorProfesional = (int) (Math.random() * (86 - 75) + 75);
    }

    //Obtengo el bebedorprofesional
    public Integer getBebedorProfesional() {
        return BebedorProfesional;
    }

    //Seteo el bebedorprofesional
    public void setBebedorProfesional(Integer BebedorProfesional) {
        this.BebedorProfesional = BebedorProfesional;
    }

    //Muestro la lista de vikingos
    public static void mostrarlista(List<Vikingo> listvikingo) {
        listvikingo.forEach((list) -> {
            System.out.println(list);
        });
    }

    //Uso como criterio de ordenamiento, el peso (De mayor a menor)
    @Override
    public int compareTo(Vikingo v) {
        if (v.getPeso() < super.getPeso()) {
            return -1;
        } else {
            return 1;
        }
    }

    //Muestro los datos del vikingo
    @Override
    public String toString() {
        return "\nVikingo[ " + "\nBebedorProfesional: " + BebedorProfesional + super.toString() + ']';
    }

}
