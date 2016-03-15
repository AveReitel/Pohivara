import java.util.Scanner;

public class Pea{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage oma nimi\n");
		//String nimi = scanner.nextLine();
		String nimi = "";
		System.out.println("Kohe hakkame mängima üht huvitavat mängu. Selle idee on Sulle selgeks õpetada ja meelde tuletada\nolulisimaid füüsikalisi mõisteid ja nende definitsioone. Mäng käib nii, et ekraanile ilmub\ndefinitsioon ning selle algusest on puudu mõiste. Ülesandeks on uuele reale kirjutada mõiste.\n");
		Questionnaire küssa = new Questionnaire("pohivara.txt", nimi);
	}
}