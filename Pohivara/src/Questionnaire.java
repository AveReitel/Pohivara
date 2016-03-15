import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
 
public class Questionnaire {
    private List<Küsimus> küsimused = new ArrayList<>(); // Küsimuste list
    private String mängija_nimi; // Mängija nimi
    private List<Küsimus> küsitud = new ArrayList<>(); // Küsitud küsimuste list, tulemuste jaoks
    static String kodeering = "UTF-8";
   
    public Questionnaire(String input, String name) throws Exception {
    	
        this.mängija_nimi = mängija_nimi;
        faili_lugemine(input);
        alustaMängu();
        
    }
   
    private void faili_lugemine(String input) throws Exception {
    	File fail = new File(input);
        Scanner sc = new Scanner(fail,kodeering);
        while(sc.hasNextLine()) {
            String rida = sc.nextLine();
            String[] tükid = rida.split("\\#");
            Küsimus küsimus = new Küsimus(tükid[1],tükid[0]);
            küsimused.add(küsimus);
        }
        sc.close();
        	
    }
   
    private void alustaMängu() throws InterruptedException {
    	
    	Random counter = new Random();
        int tsükli_pikkus = counter.nextInt(12)+5;

        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        for(int t = 0; t<tsükli_pikkus;t++){
      
            int i =  0 + (int)(Math.random() * küsimused.size());
            Küsimus k = küsimused.get(i);
            System.out.println(k.getDefinitsioon());
            
            long start = System.currentTimeMillis(); //seda kasutame selleks, et kohe ei prindiks uut defi
            long end = start; //long on andmetüüp, mahutab suuremat arvu, ja seda peab kasutama, sest TimeMillis tagastab long tüüpi arvu
            while(end - start < 10000){ //tsükkel, kus loeb aega, ja kui aeg täis, siis laseb printida
            end = System.currentTimeMillis();
            }
            String mängija_vastus = scanner.nextLine();  
            if(k.setU_answer(mängija_vastus)){
            	correctAnswers++;
            }
            küsimused.remove(i);
            küsitud.add(k);      
                        
        }
        
        double protsent = (100.0* correctAnswers)/tsükli_pikkus;
        if(protsent <= 45){
        	System.out.println("Tundub, et peaksite õppima. Teie tulemus protsentides on:" + protsent +"%");}
        else if (protsent>45 && protsent <=75){
        	System.out.println("See tulemus on küllaltki hea, ent siiski tuleb veel harjutada! Saite " +protsent+ "%");
        }
        else
        	System.out.println("Väga tubli. Nii õppides võite isegi füüsikuks saada." + protsent+"%");
        System.out.println();
        scanner.close();
        
        // Lõpptulemus
        for (Küsimus küsimus: küsitud) {
            if (küsimus.onÕige())
                System.out.println(küsimus.toString()+"✔: Tubli!"); 
            else
                System.out.println(küsimus.toString()+"✘: Eksisite!"); 
        }
        
               
    }
   
 
}