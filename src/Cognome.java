import java.util.Scanner;

public class Cognome
{
Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ESERCITAZIONE 9");
		//stampa titolo esercitazione
		System.out.println("Effettuare una scelta");
		System.out.println("1. Sistemazione array double");
		System.out.println("2. Due sequenze");
		int scelta=in.nextInt();
		switch (scelta)
		{
		case 1:
			PuntoUno();
			break;
		case 2:
			DueSequenze();
			break;
		default:
			Def();
			break;
		}
		
		
		
		
		
		
	}
	
	public static void PuntoUno()
	{
		Scanner in = new Scanner(System.in);
		double [] Array = new double [6];
		//creazione array di tipo double
		double [] Finale = new double [Array.length /2];
		//creazione secondo array di tipo double, con lunghezza pari alla metà
		System.out.println("Inserire i valori double dell'array");
		for (int i=0; i<Array.length; i++)
		{
			Array[i] = in.nextDouble();
		}
		//ciclo per riempire l'array
		
		for (int i = 0; i<Array.length -1; i+=2)
		{
			for (int j=1; j<=Array.length -1; i+=2)
			{
				for (int k=0; k<Finale.length; k++)
				{
					Finale[k] = (Array[i] * Array[j]);
					//assegnazione
					/*
					 * alla locazione k, corrisponde il prodotto
					 * delle locazioni i e j dell'array iniziale
					 */
				}
			}
		}
		
		
		for(int i=0; i<Finale.length; i++)
		{
			System.out.println(Finale[i] + " ;");
		}
		//stampa a schermo dei valori dell'array

	}
	
	public static void DueSequenze()
	{
		Scanner in = new Scanner(System.in);
		String [] S1 = new String [5];
		String [] S2 = new String [5];
		
		//dichiarazione due stringhe di array
		System.out.println("riempire il primo array");
		for(int i=0; i<S1.length; i++)
		{
			S1[i] =in.nextLine();
		}
		//riempimento primo array
		
		System.out.println("riempire il secondo array");
		for(int i=0; i<S2.length; i++)
		{
			S2[i] =in.nextLine();
		}
		//riempimento secondo array
		
		
		for (int i=0; i<=S1.length -1; i++)
		{
			if (S1[i] == S2[0] ||  S1[i] == S2[1] || S1[i] == S2[2] || S1[i] == S2[3] || S1[i] == S2[4])
				/* 
				 * se il valore della locazione i del primo array
				 * è equivalente a quello delle altre locazioni del secondo array
				 * stampa "ok"
				 */
			{
				System.out.println("OK");
			}
			else
			{	
				System.out.println("NO");
			}
			//viceversa, stampa "no"
		}
		
		
	}
	
	public static void Def()
	{
		System.out.println("La scelta da lei effettuata non esiste");
	}
	//in caso venisse scelto un altro numero, stampa ciò
}
		
