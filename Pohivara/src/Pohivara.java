
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class Pohivara {
//Meie idee on luua füüsika ja tehnika ainest saadud põhivara õppimise mäng :)
    public static void main(String[] args) throws Exception {
        File fail = new File("pohivara.txt");
        Scanner sc = new Scanner(fail, "UTF-8");
        ArrayList<String> mõiste = new ArrayList<>();
        ArrayList<String> definitsioon = new ArrayList<>();
       
        while(sc.hasNextLine()) {
            String rida = sc.nextLine();
            String[] t�kid = rida.split("\\#");
            mõiste.add(t�kid[0]);
            definitsioon.add(t�kid[1]);
        }
        /* vahemiku küsimine, inimene sisestab, mis vahemikus sooviks seletust saada ja siis antakse
        talle ette random seletus*/
      Scanner scan = new Scanner (System.in);
        System.out.println("Vajutage tühik ja ENTER, et saada definitsiooni"); //mõiste vastamine peaks ka siia tulema
        String vajutus = scan.toString();
        String ts�kkel = vajutus;
      while(ts�kkel != "ei") {
           Scanner scan1 = new Scanner(System.in);
            System.out.println("Vajutage uuesti tühikut ja ENTERIT, kui soovite uut definitsiooni, vastasel juhul kirjutage sõna ei ja ENTER");
            String vajutus1 = scan1.toString();
            System.out.println(); //siin hakkab välja printima seletusi, peale seda, peaksin ma saama vastata, mõistet.
            if (definitsioon.indexOf(definitsioon)==(mõiste.indexOf(mõiste))){
            	
            }

      }
       
        for(int i = 0; i < mõiste.size(); i++){
            System.out.println(mõiste.get(i)+ "-" + definitsioon.get(i));
        }
        sc.close();
        }

    }

