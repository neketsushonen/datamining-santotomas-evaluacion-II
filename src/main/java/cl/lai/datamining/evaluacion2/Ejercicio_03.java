package cl.lai.datamining.evaluacion2;

import weka.associations.Apriori;
import weka.core.Instances;

public class Ejercicio_03 extends App_loader_data_set{
	
	public static void main(String args[])throws Exception{
		String current = new java.io.File( "." ).getCanonicalPath()+"/src/resources/";
		String file = current + "bencineras_rm.csv";
		//el 4 es el rango de división
		Instances datosEntrenamiento = load_normal_data_set_discretized(file, 4);
		//TODO Implementar 

 	}
}
