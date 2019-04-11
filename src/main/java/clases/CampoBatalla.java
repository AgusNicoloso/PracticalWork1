package clases;

public class CampoBatalla {

    public static void batalla(Vikingo v, Espartano e, Humano boss) {
        //Creo una variable contador para llevar cuantos vasos toman cada uno, la seteo en 1 ya que no puede ir al baño sin tomar nada
        int bebidasvikingo = 1;
        int bebidasEspartano = 1;
        //Pongo a beber al vikingo
        bebidasvikingo = bebervikingo(v, bebidasvikingo);
        //Pongo a beber al espartano
        bebidasEspartano = beberespartano(e, bebidasEspartano);
        //Muestro los resultados de la batalla
        resultados(bebidasvikingo, bebidasEspartano);
        //Traigo el objeto del ganador para ponerlo a beber con el dueño de la taberna
        Humano ganador = ganador(bebidasvikingo, bebidasEspartano, v, e);
        //Si llega null quiere decir que los dos bebieron lo mismo, por eso empate
        if (ganador != null) {
            //Creo una variable contador para llevar cuantos vasos toman cada uno, la seteo en 1 ya que no puede ir al baño sin tomar nada 
            int bebidasboos = 1;
            int bebidasganador = 1;
            System.out.println("----------A beber FinalBattle----------");
            //Pongo a beber al ganador y al dueño de la taberna
            finalboss(boss, ganador, bebidasboos, bebidasganador);
        } else {
            //Empate
            System.out.println("----------Empate----------");
        }
    }

    private static void finalboss(Humano boss, Humano ganador, int bebidasboos, int bebidasganador) {
        //Verifico si el ganador es un vikingo o un espartano
        if (ganador instanceof Vikingo) {
            //Si es un vikingo, lo pongo a beber
            bebidasganador = bebervikingo((Vikingo) ganador, bebidasganador);
        } else if (ganador instanceof Espartano) {
            //Si es un espartano, lo pongo a beber
            bebidasganador = beberespartano((Espartano) ganador, bebidasganador);
        }
        //Pongo a beber al dueño de la taberna
        bebidasboos = beberboss(boss, bebidasboos);
        //Muestro resultados
        System.out.println("----------Resultados FinalBoss----------");
        System.out.println("El Boss bebio: " + bebidasboos + " vasos");
        System.out.println("El Ganador bebio: " + bebidasganador + " vasos");
        //Mustro quien es el "world champion"
        ganador(bebidasboos, bebidasganador, boss, ganador);
    }

    private static int bebervikingo(Vikingo v, int bebidasvikingo) {
        //Pongo a beber al vikingo, el maximo de cervezas es 50 o 49 mas la posicion 0 ;)
        for (int i = 0; i < 50; i++) {
            //Hago un random entre 100 y 1 (101 se pone ya que no lo considera, quiere decir que toma hasta el 100)
            int random = (int) (Math.random() * (101 - 1) + 1);
            //Si el random es mayor o igual al numero del bebedor profesional, va al baño
            //En este caso el vikingo va a tener un numero bajo, por lo cual tiene mas posibilidades de ir al baño
            if (random >= v.getBebedorProfesional()) {
                //Muestra que esta en el baño
                System.out.println(v.Orinar());
                break;
            } else {
                //Si no fue al baño toma un vaso o dos, al ser vikingo tiene una pequeña probabilidad de poder tomar 2 cervezas juntas
                //hago un random de (1 o 0)
                int randomvelocidad = (int) (Math.random() * (2 - 0) + 0);
                if (randomvelocidad == 0) {
                    //Si se cumple ese random toma dos cervezas juntas
                    bebidasvikingo = bebidasvikingo + 2;
                } else {
                    //Si no se cumple toma una sola
                    bebidasvikingo++;
                }
            }
        }
        //Devuelvo los vasos tomados
        return bebidasvikingo;
    }

    private static int beberespartano(Espartano e, int bebidasEspartano) {
        //Pongo a beber al espartano, el maximo de cervezas es 50 o 49 mas la posicion 0 ;)
        for (int i = 0; i < 50; i++) {
            //Hago un random entre 100 y 1 (101 se pone ya que no lo considera, quiere decir que toma hasta el 100)
            int random = (int) (Math.random() * (101 - 1) + 1);
            //Si el random es mayor o igual al numero de tolerancia extra, va al baño
            //En este caso al ser espartano va a tener un numero alto, por lo cual tiene menos posibilidades de ir al baño
            if (random >= e.getToleranciaExtra()) {
                //Muestra que esta en el baño
                System.out.println(e.Orinar());
                break;
            } else {
                //Si no se cumple esa probabilidad minima, toma una cerveza
                bebidasEspartano++;
            }
        }
        //Devuelvo los vasos tomados
        return bebidasEspartano;
    }

    private static int beberboss(Humano h, int bebidasboss) {
        //Pongo a beber al vikingo, el maximo de cervezas es 50 o 49 mas la posicion 0 ;)
        for (int i = 0; i < 50; i++) {
            //Hago un random entre 100 y 1 (101 se pone ya que no lo considera, quiere decir que toma hasta el 100)
            int random = (int) (Math.random() * (101 - 1) + 1);
            //Si el random es mayor o igual al numero, va al baño
            //En este caso al ser dueño de la taberna va el numero mas alto que todos, por lo cual tiene menos posibilidades de ir al baño
            if (random >= 90) {
                //Muestra que esta en el baño
                System.out.println("Boss orinando, no aguante");
                break;
            } else {
                //Si no fue al baño toma dos vasos o tres, al ser el dueño tiene una pequeña probabilidad de poder tomar 3 cervezas juntas
                //hago un random de (1 o 0)
                int randomvelocidad = (int) (Math.random() * (2 - 0) + 0);
                if (randomvelocidad == 0) {
                    bebidasboss = bebidasboss + 3;
                } else {
                    //Al ser el dueño tiene el "poder" de tomar como minimo 2 juntas y la pequeña probabilidad de tomar 3
                    bebidasboss = bebidasboss + 2;
                }
            }
        }
        //Devuelvo los vasos tomados
        return bebidasboss;
    }

    private static void resultados(int bebidasvikingo, int bebidasEspartano) {
        //Muestro los resultados
        System.out.println("----------Resultados Primera ronda----------");
        System.out.println("El Vikingo bebio: " + bebidasvikingo + " vasos");
        System.out.println("El Espartano bebio: " + bebidasEspartano + " vasos");
    }

    private static Humano ganador(int bebidasvikingo, int bebidasEspartano, Vikingo v, Espartano e) {
        //Si el espartano tomo mas que el vikingo, gana el espartano. Caso contrario gana el vikingo
        if (bebidasEspartano > bebidasvikingo) {
            System.out.println("----------Ganador Primera ronda----------");
            //Muestro el nombre del ganador
            System.out.println("Gano el Espartano : " + e.getNombre());
            //Inserto en la base de datos al nombre del ganador y los vasos que tomo
            ConectarBD.insertar("INSERT INTO ganadores (nombre_ganador, bebida_en_cuerpo) VALUES ('" + e.getNombre() + "', " + bebidasEspartano + ")");
            //Retorno al ganador
            return e;
        } else if (bebidasEspartano < bebidasvikingo) {
            System.out.println("----------Ganador Primera ronda----------");
            //Muestro el nombre del ganador
            System.out.println("Gano el Vikingo : " + v.getNombre());
            //Inserto en la base de datos al nombre del ganador y los vasos que tomo
            ConectarBD.insertar("INSERT INTO ganadores (nombre_ganador, bebida_en_cuerpo) VALUES ('" + v.getNombre() + "', " + bebidasvikingo + ")");
            //Retorno al ganador
            return v;
        }
        //Si empataron, retorno null
        return null;
    }

    private static void ganador(int bebidasdueño, int bebidasganador, Humano boss, Humano ganador) {
        //Si el dueño tomo mas que el ganador, gana el dueño. Caso contrario gana el ganador de la batalla anterior
        if (bebidasdueño > bebidasganador) {
            System.out.println("----------Ganador----------");
            //Muestro el nombre del ganador
            System.out.println("Gano el dueño : " + boss.getNombre() + " otra vez...");

        } else if (bebidasdueño < bebidasganador) {
            System.out.println("----------Ganador----------");
            //Muestro el nombre del ganador
            System.out.println("The world champion is : " + ganador.getNombre());
        } else {
            //Sino empataron
            System.out.println("----------Empate----------");
        }
    }
}
