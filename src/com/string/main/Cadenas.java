package com.string.main;
/**
 * Comparamos String , StringBuffer, StringBuilder
 * */
public class Cadenas {
	/**
	  * constante que determina el numero de repeticiones 
	  * en cada uno de los tres metodos de concatenacion
	  */
	 public final long ITERA = 100000;
	 /**determina el tiempo total de concatenacion*/
	 private long tiempo;
	  
	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
	   
	   Cadenas objetoCadenas=new Cadenas();
	   String valorCadena="CoDejaVu";
	   String usoString=objetoCadenas.calculaTiempoString(valorCadena);
	   String usoStringBuffer=objetoCadenas.calculaTiempoStringBuffer(valorCadena);
	   String usoStringBuilder=objetoCadenas.calculaTiempoStringBuilder(valorCadena);
	   
	   System.out.println("Tiempo Concatenacion String : "+usoString+
	  "\nTiempo Concatenacion StringBuffer : "+usoStringBuffer+
	   "\nTiempo Concatenacion StringBuilder : "+usoStringBuilder);  
	 }
	  
	  
	 /**
	  * Metodo que calcula el tiempo de concatenacion de la cadena
	  * usando la clase String
	  * @param valor dato ingresado por el usuario
	  * @return tiempo en milisegundos
	  */
	 public String calculaTiempoString(String valor) 
	 {
	  String cadena = "";
	  tiempo = System.currentTimeMillis();
	  for (int i = 0; i < ITERA ; i++) {
	   cadena += valor;
	  }
	  tiempo = System.currentTimeMillis() - tiempo;
	  return tiempo + " milisegundos";
	 }
	 
	 /**
	  * Metodo que calcula el tiempo de concatenacion de la cadena
	  * usando la clase StringBuffer
	  * @param valor dato ingresado por el usuario
	  * @return tiempo en milisegundos
	  */
	 public String calculaTiempoStringBuffer(String valor) 
	 {
	  StringBuffer cadena = new StringBuffer();
	  long tiempo = System.currentTimeMillis();
	  for (int i = 0; i < ITERA ; i++) {
	   cadena.append(valor);
	  }
	  tiempo = System.currentTimeMillis() - tiempo;
	  return tiempo + " milisegundos";
	 }
	 /**
	  * Metodo que calcula el tiempo de concatenacion de la cadena
	  * usando la clase StringBuilder
	  * @param valor dato ingresado por el usuario
	  * @return tiempo en milisegundos
	  */
	 public String calculaTiempoStringBuilder(String valor)
	 {
	  StringBuilder cadena = new StringBuilder();
	  tiempo = System.currentTimeMillis();
	  for (int i = 0; i < ITERA ; i++) {
	   cadena.append(valor);
	  }
	  tiempo = System.currentTimeMillis() - tiempo;
	  return tiempo + " milisegundos";
	 }
}
