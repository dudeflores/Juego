import java.util.Scanner;
import java.util.Random;

public class Juego {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("Bienvenido al juego de piedra, papel o tijeras/n");
        System.out.println("Elige una opcion (0: Perico.. digo piedra, 1: rolling.. digo papel o 2: Cachapera.. digo tijeras):");
        int eleccionJugador = sc.nextInt();

        //Genera la seleccion aleatoria de la pc
        int eleccionComputadora = random.nextInt(3);

        System.out.println("Jugador elegio:" +opciones[eleccionJugador]);
        System.out.println("Computadora elegio:" +opciones[eleccionComputadora]);

        //logica para determinar el resultado del juego
        if(eleccionJugador == eleccionComputadora) {
            System.out.println("Empate becerro");
        }
        else if ((eleccionJugador == 0 && eleccionComputadora == 2) || (eleccionJugador == 1 && eleccionComputadora == 0) || (eleccionJugador == 2 && eleccionComputadora == 1)){
            System.out.println("/n Ganaste papu");
        }
        else {
            System.out.println("Te gano la computadora SAPO!");
        }
        sc.close();
    }
}