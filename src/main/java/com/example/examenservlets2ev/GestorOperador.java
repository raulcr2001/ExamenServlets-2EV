package com.example.examenservlets2ev;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;

public class GestorOperador {
	
RandomAccessFile stream;

	
	public GestorOperador() {
		creaFichero("/home/INFORMATICA/alu10191174/IdeaProjects/ExamenServlets-2EV/src/main/resources/discos2.dat");
	}

	private void creaFichero(String nombreFichero) {
		try {
			boolean exists = (new File(nombreFichero)).exists();
			stream = new RandomAccessFile(nombreFichero, "rw");
			if ( ! exists) {
				creaUsuarioPorDefecto();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero: " + nombreFichero);
			System.exit(0);
		}
	}
	
	private void creaUsuarioPorDefecto() {
		
		Operador nuevoOp1 = new Operador (1,"+", "Suma", 24.0);
		nuevoOp1.escribeEnFichero(stream);
		Operador nuevoOp2 = new Operador(2,"-","Resta",19.0);
		nuevoOp2.escribeEnFichero(stream);		  
		Operador nuevoOp3 = new Operador(3,"*","Producto",25.0);
		nuevoOp3.escribeEnFichero(stream);		  
		Operador nuevoOp4 = new Operador(4,"/","División",27.0);
		nuevoOp4.escribeEnFichero(stream);
	}

	
	public void cierraGestor() {
		try {
			stream.close();
		} catch (IOException e) {
			System.out.println("No se ha podido cerrar el fichero");
		}
	}

	private void posicionaFichero(long posicion) {
		try {
			stream.seek(posicion);
		} catch (IOException e) {
			System.out.println("Error posicionando el puntero al inicio del fichero");
			System.exit(0);
		}
	}
	
	//public String[] listaDeOperaciones() {
		
	//	return hashArray(operaciones); -- Si quieres hacerlo de otra forma, eres libre de cambiarlo.
	//}

	private String[] hashArray(HashSet<String> users) {
		String[] lista = new String[users.size()];
		int i = 0;
		for (String val : users) lista[i++] = val;
		return lista;
	}


	//public String calculaRdo(String oper, String op1, String op2) {
		
		//char cad; 
		//cad = oper.charAt(0);
		//Double ope1 = 0.0; 
		
		//Los comentarios que te pongo a continuación son para realizar las operaciones dentro del switch
		// Para Convertir un String a Double puedes usar Double.parseDouble(op1) , por ejemplo
		// Para convertir de Double a String puedes usar Double.toString(ope1) , por ejemplo
		
		
		
		//return rdo;
	//}
	
	//public String MostrarOperacion (String oper) {
	//}
	
}
