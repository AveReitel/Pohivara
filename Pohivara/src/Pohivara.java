import java.util.Random;
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
            String[] tükid = rida.split("" +
                    "#");
            mõiste.add(tükid[0]);
            definitsioon.add(tükid[1]);
        }
        //vahemiku küsimine, inimene sisestab, mis vahemikus sooviks seletust saada ja siis antakse
        //talle ette random seletus
        Scanner scan = new Scanner (System.in);
        System.out.println("Vajutage tühik ja ENTER, et saada definitsiooni");
        String vajutus = scan.nextLine();

        String tsükkel = vajutus;
        while(tsükkel != " ") {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Vajutage uuesti tühikut ja ENTERIT, kui soovite uut definitsiooni, vastasel juhul kirjutage sõna ei ja ENTER");
            String vajutus1 = scan1.nextLine();
            System.out.println(definitsioon.get(new Random().nextInt(definitsioon.size()-1)));
        }
        // if (definitsioon.indexOf(vajutus1)equals(mõiste.indexOf(mõiste)){
        // }

        for(int i = 0; i < mõiste.size(); i++){
            System.out.println(mõiste.get(i)+ "-" + definitsioon.get(i));
        }
        sc.close();
    }

}




