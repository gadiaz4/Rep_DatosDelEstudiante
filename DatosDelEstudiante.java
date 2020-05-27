/*
 * Implemente un algoritmo que le permita solicitar el ingreso por teclado
el nombre de la Universidad, el departamento, la carrera, el nombre de la materia,
nombres completos del estudiante, nivel, numero de cedula, pais, ciudad,
canton, provincia, ID, sexo
 */
package datosdelestudiante;
/**
 *
 * @author: Ing. Luis Alberto Guerra Cruz
 */
import java.util.Scanner;
public class DatosDelEstudiante {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner objeto=new Scanner(System.in);//reserva espacio de memoria
    System.out.println("Ingrese el nombre de la Universidad: ");
    String nombreUniversidad=objeto.nextLine();

    System.out.println("Ingrese el departamento: ");
    String departamento=objeto.nextLine();

    System.out.println("Ingrese la carrera: ");
    String carrera=objeto.nextLine();

    System.out.println("Ingrese el nombre de la materia: ");
    String materia=objeto.nextLine();

    System.out.println("Ingrese nombres completos del estudiante: ");
    String nombres=objeto.nextLine();

    System.out.println("Ingrese el nivel del estudiante: ");
    String nivel=objeto.nextLine();

    System.out.println("Ingrese el numero de cedula: ");
    String cedula=objeto.nextLine();

    System.out.println("Ingrese el pais: ");
    String pais=objeto.nextLine();

    System.out.println("Ingrese la ciudad: ");
    String ciudad=objeto.nextLine();

    System.out.println("Ingrese el canton");
    String canton=objeto.nextLine();

    System.out.println("Ingrese la provincia");
    String provincia=objeto.nextLine();

    System.out.println("Ingrese el ID ");
    String ID=objeto.nextLine();

    System.out.println("Ingrese el tipo de sexo ");
    String sexo=objeto.nextLine();

    System.out.println("BIENBENIDO A LA UNIVERSIAD: " +nombreUniversidad);
    }
}
