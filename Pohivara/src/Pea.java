import java.util.Scanner;

public class Pea{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Sisestage oma nimi");
		//String nimi = scanner.nextLine();
		System.out.println("Kohe hakkame mängima üht huvitavat mängu. Selle idee on Sulle selgeks õpetada ja meelde tuletada\nolulisimaid füüsikalisi mõisteid ja nende definitsioone. Mäng käib nii, et ekraanile ilmub\ndefinitsioon ning selle algusest on puudu mõiste. Ülesandeks on uuele reale kirjutada mõiste.\nOluline on tähele panna käände- või pöördevormi! Mängu lõpus ilmneb tulemus.\nAlustuseks vajutage ENTERit." );
		@SuppressWarnings("unused")
		String alustus = scanner.nextLine();
		@SuppressWarnings("unused")
		Questionnaire küssa = new Questionnaire("pohivara.txt");
	scanner.close();
	}
	}