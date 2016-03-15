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
    private int correctAnswers; // õigeid vastusied
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
   
    private void alustaMängu() {
    	
    	Random counter = new Random();
        int tsükli_pikkus = counter.nextInt(12)+5;
        Scanner scanner = new Scanner(System.in);
        for(int t = 0; t<tsükli_pikkus;t++){
      
            int i =  0 + (int)(Math.random() * küsimused.size());
            Küsimus k = küsimused.get(i);
            
            System.out.println(k.getDefinitsioon());
            String mängija_vastus = scanner.nextLine();
            k.setU_answer(mängija_vastus);
            küsimused.remove(i);
            küsitud.add(k);      
            
            
        }
        scanner.close();
        
        // LĆµpptulemus
        for (Küsimus küsimus: küsitud) {
            if (küsimus.onÕige())
                System.out.println(küsimus.toString()+"✔: Tubli. Õige!"); // Muuda seda detailisemaks
            else
                System.out.println(küsimus.toString()+"✘: Eksisite!"); // Muda seda detailsemaks, mis oleks Ćµige olnud, mis tema vastas jne
        }
               
    }
   
 
}

