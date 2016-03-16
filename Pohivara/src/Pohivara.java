import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Pohivara {
//Meie idee on luua f��sika ja tehnika ainest saadud p�hivara �ppimise m�ng :)
public static void main(String[] args) throws Exception {
    File fail = new File("pohivara.txt");
    Scanner sc = new Scanner(fail, "UTF-8");
    ArrayList<String> mõiste = new ArrayList<>();
    ArrayList<String> definitsioon = new ArrayList<>();
    
    //alumised neli rida, peaksid iga definitsiooni elemendi splittima t�hiku kohalt, et saaks hiljem lause osi eraldi reale v�lja printida
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
    System.out.println("Kohe hakkame m�ngima �ht huvitavat m�ngu. Selle idee on Sulle selgeks �petada ja meelde tuletada\nolulisimaid f��sikalisi m�isteid ja nende definitsioone. M�ng k�ib nii, et ekraanile ilmub\ndefinitsioon ning selle algusest on puudu m�iste. �lesandeks on uuele reale kirjutada m�iste.\n");
    System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤❤❤❤\nAlustame �ppimisega ❤ Et definitsioon ilmuks, vajutage ENTERit. NB! vastamisel on oluline �ige k��ndevormi ja m�iste v�ib-olla ka v�ljend!\nKui soovite �ppimist l�petada, kirjutage 'stop'");
    scan.close();
    Random counter = new Random();
    int tsükli_pikkus = counter.nextInt(20)+1; // suvalise arvu kordi teeb tüsklit. Plaanis on panna lugema õiged vastused, et hiljem tagasisidet anda.
  
    for(int i = 0; i<tsükli_pikkus;i++) { 
	   int defin = new Random().nextInt(definitsioon.size()-1);
	   String def = definitsioon.get(defin);
	   System.out.println(def);
	   System.out.print(""); 	 
	   String vastus = scan.nextLine().toLowerCase(); // teen t�hed v�ikseks
	   int asukoht = mõiste.indexOf(vastus);
	   if(asukoht==defin){
		   
	   }else if(def.equals(vastus)){
		   System.out.println("V�ga tubli! �ige vastus");}
	   else{
		   System.out.println("Tundub, et midagi l�ks valesti. V�ib-olla peaksite konspekti uurima!");
	   }
	   
	   }
    
     for(int i = 0; i < mõiste.size(); i++){
        System.out.println(mõiste.get(i)+ "-" + definitsioon.get(i));
    }
    sc.close();
    }

}
