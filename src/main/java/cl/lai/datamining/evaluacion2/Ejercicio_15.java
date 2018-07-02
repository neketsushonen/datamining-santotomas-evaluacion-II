package cl.lai.datamining.evaluacion2;

import weka.associations.Apriori;
import weka.clusterers.SimpleKMeans;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

public class Ejercicio_15 extends App_loader_data_set{
	
	public static void main(String args[])throws Exception{
		String current = new java.io.File( "." ).getCanonicalPath()+"/src/resources/";
		String file = current + "bencineras_rm.csv";
		Instances datosEntrenamiento = load_data_set_keresone(file);
		
		//TODO Implementar 

 	}
}
