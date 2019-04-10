package clases;

import java.util.Iterator;
import java.util.List;

public class Vikingo extends Humano implements Comparable<Vikingo> {

    private Integer BebedorProfesional;

    public Vikingo(String Nombre) {
        super(Nombre, (int) (Math.random() * (101 - 18) + 18), (int) (Math.random() * (101 - 40) + 40), new OrinarVikingoImp(), new BeberVikingoImp());
        this.BebedorProfesional = (int) (Math.random() * (86 - 75) + 75);
    }

    public Integer getBebedorProfesional() {
        return BebedorProfesional;
    }

    public void setBebedorProfesional(Integer BebedorProfesional) {
        this.BebedorProfesional = BebedorProfesional;
    }

    public static void mostrarlista(List<Vikingo> listvikingo) {
        for (Iterator it = listvikingo.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }

    @Override
    public int compareTo(Vikingo v) {
        if (v.getPeso() < super.getPeso()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "\nVikingo[ " + "\nBebedorProfesional: " + BebedorProfesional + super.toString() + ']';
    }

}
