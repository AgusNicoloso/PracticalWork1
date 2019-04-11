package clases;

public class CampoBatalla {

    public static void batalla(Vikingo v, Espartano e) {
        int bebidasvikingo = 0;
        int bebidasEspartano = 0;
        for (int i = 0; i < 50; i++) {
            int random = (int) (Math.random() * (101 - 1) + 1);
            if (random >= v.getBebedorProfesional()) {
                if (bebidasvikingo == 0) {
                    bebidasvikingo++;
                }
                System.out.println(v.Orinar());
                break;
            } else {
                int randomvelocidad = (int) (Math.random() * (2 - 0) + 0);
                if (randomvelocidad == 0) {
                    bebidasvikingo = bebidasvikingo + 2;
                } else {
                    bebidasvikingo++;
                }
            }
        }
        for (int i = 0; i < 50; i++) {
            int random = (int) (Math.random() * (101 - 1) + 1);
            if (random >= e.getToleranciaExtra()) {
                if (bebidasEspartano == 0) {
                    bebidasEspartano++;
                }
                System.out.println(e.Orinar());
                break;
            } else {
                bebidasEspartano++;
            }
        }
        System.out.println("----------Resultados----------");
        System.out.println("El Vikingo bebio: " + bebidasvikingo);
        System.out.println("El Espartano bebio: " + bebidasEspartano);
        if (bebidasEspartano > bebidasvikingo) {
            System.out.println("----------Ganador----------");
            System.out.println("Gano el Espartano : " + e.getNombre());
            ConectarBD.insertar("INSERT INTO ganadores (nombre_ganador, bebida_en_cuerpo) VALUES ('" + e.getNombre() + "', " + bebidasEspartano + ")");
        } else if (bebidasEspartano < bebidasvikingo) {
            System.out.println("----------Ganador----------");
            System.out.println("Gano el Vikingo : " + v.getNombre());
           ConectarBD.insertar("INSERT INTO ganadores (nombre_ganador, bebida_en_cuerpo) VALUES ('" + v.getNombre() + "', " + bebidasvikingo + ")");
        } else {
            System.out.println("----------Empate----------");
        }
    }
}
