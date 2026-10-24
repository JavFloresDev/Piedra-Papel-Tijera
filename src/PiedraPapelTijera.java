
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bossjjfl
 */
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random=new Random();
        //Variables
        String eleccionUsuario, eleccionComputadora[]={"piedra","papel","tijera"};
        int victorias=0, derrotas=0, empates=0;
        boolean juego=false,caso;
        
        System.out.println("_______________PIEDRA, PAPEL O TIJERA________________\ningresa la palabra e intenta ganar\n escribe 'salir' para hacerlo");
        while (!juego) {
            int numero=random.nextInt(3);
            System.out.println("Piedra, papel o tijera!!!... ");
            caso=false;
            while (!caso) {   
                System.out.print("-----> ");eleccionUsuario=entrada.next().toLowerCase();
                switch (eleccionUsuario) {
                    case "salir":
                        caso=true;
                        juego=true;
                        break;
                    case "piedra":
                        switch (eleccionComputadora[numero]) {
                            case "tijera":
                                victorias++;
                                System.out.println("Ganaste");
                                break;
                            case "papel":
                                derrotas++;
                                System.out.println("Perdiste");
                                break;
                            case "piedra":
                                empates++;
                                System.out.println("Empate");
                                break;
                        }
                        caso=true;
                        break;
                    case "papel":
                        switch (eleccionComputadora[numero]) {
                            case "piedra":
                                victorias++;
                                System.out.println("Ganaste");
                                break;
                            case "tijera":
                                derrotas++;
                                System.out.println("Perdiste");
                                break;
                            case "papel":
                                empates++;
                                System.out.println("Empate");
                                break;
                            default:
                                break;
                        }
                        caso=true;
                        break;
                    case "tijera":
                        switch (eleccionComputadora[numero]) {
                            case "papel":
                                victorias++;
                                System.out.println("Ganaste");
                                break;
                            case "piedra":
                                derrotas++;
                                System.out.println("Perdiste");
                                break;
                            case "tijera":
                                empates++;
                                System.out.println("Empate");
                                break;
                            default:
                                break;
                        }
                        caso=true;
                        break;
                    default:
                        System.out.println("invalido");
                        break;
                }
            }
        }
        System.out.println("_______________________\nVictorias: "+victorias+"\nDerrotas: "+derrotas+"\nEmpates: "+empates);
    }
}
