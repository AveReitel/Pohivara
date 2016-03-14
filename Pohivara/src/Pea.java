import java.util.Scanner;

public class Pea {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisestage oma nimi");
		String nimi = scanner.nextLine();
		Questionnaire küssa = new Questionnaire("pohivara.txt","UTF-8", nimi);
	}
}