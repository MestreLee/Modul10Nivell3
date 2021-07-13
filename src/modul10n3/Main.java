package modul10n3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		//Omple la llista amb 10 alumnes. 
		
		ArrayList<Alumne> alumnes = new ArrayList();
		alumnes.add(new Alumne("Bernat", 36, "java", 3.5));
		alumnes.add(new Alumne("Joan", 35, "php", 7));
		alumnes.add(new Alumne("Joana", 28, "c++", 8.3));
		alumnes.add(new Alumne("Clara", 31, "nodejs", 4.4));
		alumnes.add(new Alumne("Josep", 44, "nodejs", 8.3));
		alumnes.add(new Alumne("Toni", 33, "java", 9));
		alumnes.add(new Alumne("Andrea", 29, "c++", 7.3));
		alumnes.add(new Alumne("Arantxa", 27, "php", 8.5));
		alumnes.add(new Alumne("Andreu", 17, "java", 8.1));
		alumnes.add(new Alumne("Robert", 36, "php", 4.7));
		
		//Mostra per pantalla el nom i l’edat de cada alumne. 
		
		System.out.println("Nom i edat de cada alumne");
		
		alumnes.forEach(a -> System.out.println(a.getNom() + " " +a.getEdat()));
		
		//Filtra la llista per tots els alumnes que el nom comensi per “a”, asigna-ho a un altre llista 
		//y mostra per pantalla la nova llista (tot amb lambdas) 
		
		alumnes.forEach(a -> a.getNom().startsWith("A"));
		
		ArrayList<Alumne> alumnesA = new ArrayList<Alumne>();
		
		alumnesA = alumnesAmbA(alumnes, a -> a.getNom().startsWith("A"));
		
		System.out.println("Llista amb els alumnes que comencen per a");
		
		alumnesA.forEach(a -> System.out.println(a.toString()));
		
		//Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota
		
		System.out.println("Alumnes amb nota igual o superior al 5");
		
		printCondicional(alumnes, a -> a.getNota() >= 5, a -> System.out.println(a));
		
		//Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota y que no siguin de PHP
		
		System.out.println("Alumnes amb nota igual o superior al 5 i no fan php");
		
		printCondicional(alumnes, a -> a.getNota() >= 5 && !a.getCurs().equals("php"), a -> System.out.println(a));
		
		//Mostra tots els alumnes que facin JAVA i siguin majors d’edat
		
		System.out.println("Alumnes amb + de 18 anys i fan java");
		
		printCondicional(alumnes, a -> a.getEdat() >= 18 && a.getCurs().equals("java"), a -> System.out.println(a));
	}
	
	private static ArrayList<Alumne> alumnesAmbA(ArrayList<Alumne> alumnes, Predicate<Alumne> predicate) {
		ArrayList<Alumne> alumnesA = new ArrayList<Alumne>();
		for (Alumne a : alumnes) {
			if(predicate.test(a)) {
				alumnesA.add(a);
			}
		}
		
		return alumnesA;	
	}
	
	private static void printCondicional(ArrayList<Alumne> alumnes, Predicate <Alumne> pred, Consumer<Alumne> consum) {
		for (Alumne a : alumnes) {
			if(pred.test(a)) consum.accept(a);	
		}
		
	}

}
