import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Pohivara {
//Meie idee on luua füüsika ja tehnika ainest saadud põhivara õppimise mäng :)
public static void main(String[] args) throws Exception {
    File fail = new File("pohivara.txt");
    Scanner sc = new Scanner(fail, "UTF-8");
    ArrayList<String> mõiste = new ArrayList<>();
    ArrayList<String> definitsioon = new ArrayList<>();
    
    //alumised neli rida, peaksid iga definitsiooni elemendi splittima tühiku kohalt, et saaks hiljem lause osi eraldi reale välja printida
    List<String> splitDefinitsioon = new ArrayList<>();
    for (String s : definitsioon){
    	for(String sõna : s.split(" "))
    	splitDefinitsioon.add(sõna);
    }
    while(sc.hasNextLine()) {
        String rida = sc.nextLine();
        String[] tükid = rida.split("\\#");
        mõiste.add(tükid[0]);
        definitsioon.add(tükid[1]);}
        
    Scanner scan = new Scanner (System.in);
    System.out.println("Kohe hakkame mängima üht huvitavat mängu. Selle idee on Sulle selgeks õpetada ja meelde tuletada\nolulisimaid füüsikalisi mõisteid ja nende definitsioone. Mäng käib nii, et ekraanile ilmub\ndefinitsioon ning selle algusest on puudu mõiste. Ülesandeks on uuele reale kirjutada mõiste.\n");
    System.out.println("â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤ â¤â¤â¤â¤\nAlustame õppimisega â¤ Et definitsioon ilmuks, vajutage ENTERit. NB! vastamisel on oluline õige käändevormi ja mõiste võib-olla ka väljend!\nKui soovite õppimist lõpetada, kirjutage 'stop'");
    String vajutus = scan.nextLine();
    
    Random counter = new Random();
    int tsükli_pikkus = counter.nextInt(20)+1; // suvalise arvu kordi teeb tÃ¼sklit. Plaanis on panna lugema Ãµiged vastused, et hiljem tagasisidet anda.
  
    for(int i = 0; i<tsükli_pikkus;i++) { 
	   int defin = new Random().nextInt(definitsioon.size()-1);
	   String def = definitsioon.get(defin);
	   System.out.println(def);
	   Scanner vajutus1 = new Scanner(System.in);
	   System.out.print(""); 	 
	   String vastus = scan.nextLine().toLowerCase(); // teen tähed väikseks
	   int asukoht = mõiste.indexOf(vastus);
	   if(asukoht==defin){
		   
	   }else if(def.equals(vastus)){
		   System.out.println("Väga tubli! õige vastus");}
	   else{
		   System.out.println("Tundub, et midagi läks valesti. Võib-olla peaksite konspekti uurima!");
	   }
	   }
    
     for(int i = 0; i < mõiste.size(); i++){
        System.out.println(mõiste.get(i)+ "-" + definitsioon.get(i));
    }
    sc.close();
    }

}
