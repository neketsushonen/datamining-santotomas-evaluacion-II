package cl.lai.datamining.evaluacion2;

import weka.core.Instances;

public class Ejercicio_05 extends App_loader_data_set{
	
	public static void main(String args[])throws Exception{
		String current = new java.io.File( "." ).getCanonicalPath()+"/src/resources/";
		String file = current + "bencineras_rm.csv";
		Instances datosEntrenamiento = load_clustering_data_set(file);
		
		//TODO Implementar 

 	}
}
