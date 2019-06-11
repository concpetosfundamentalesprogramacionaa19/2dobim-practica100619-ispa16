package practica_100;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Leer {
	public static void leer_registros() {
		
		// 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("tabula.txt"));//copie el contenido del csv
            //y lo pase a .txt  debido a que no se ejecutaba como csv 
            double promedio_goals = 0;
            double promedio1 = 0;
            double promedio2 = 0;
            double promedio_hight = 0;
            int i = 1;
            while (entrada.hasNext()) {//inicio del ciclo wile
                String linea = entrada.nextLine();
                System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|"))); 
                //System.out.println(linea_partes.get(11));
                //calculo promedio goles
                double goles = Double.parseDouble(linea_partes.get(11));
                promedio_goals = goles + promedio_goals ;
                promedio1 = promedio_goals / i ;
                //calculo promedio altura
                double altura = Double.parseDouble(linea_partes.get(9));
                promedio_hight = altura + promedio_hight ;
                promedio2 = promedio_hight / i ;                
                i = i + 1;
                
         
            } // fin de while
            entrada.close();
            System.out.printf("el promedio de goles es: %.2f\n", promedio1);
            System.out.printf("el promedio de altura de los jugadores es: %.2f", promedio2);
             
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n
	}


