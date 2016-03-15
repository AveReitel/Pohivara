import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
 
public class Questionnaire {
<<<<<<< HEAD
    private List<K�simused> k�simus; // K�simuste list
    private String m�ngija_nimi; // M�ngija nimi
    private Date alustusaeg; // Algusaeg
    private Date l�ppaeg; // L�puaeg
    private List<K�simused> k�situd ; // K�situd k�simuste list, tulemuste jaoks
    private int correctAnswers; // �igeid vastuseid
   
    public Questionnaire(String input, String name)
    {
        this.m�ngija_nimi = m�ngija_nimi;
        parseInputFile(input);
        alustusaeg = new Date(); // Praegune aeg saab algusajaks
        alustaM�ngu();
    }
   
    private void parseInputFile(String input) {
        // Siin loe fail sisse, tee oma failist Question t��pi isendid
        // Siia paned ts�kli, mis splitib sul need definitsioonid ja seletused �ra, ja nendest teed Qustion t��pi isendid (konstruktorit vaata seal)
    }
   
    private void alustaM�ngu() {
        // Testi p�hits�kkel
        while (k�simus.size() != 0)
        {
            int i =  0 + (int)(Math.random() * k�simus.size());
            K�simused k = k�simus.get(i);
            Scanner scanner = new Scanner(System.in);
=======
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
            
>>>>>>> e6be25ce004429b120db2714631fc17b928a599c
            System.out.println(k.getDefinitsioon());
            String mängija_vastus = scanner.nextLine();
            k.setU_answer(mängija_vastus);
            küsimused.remove(i);
            küsitud.add(k);      
            
            
        }
<<<<<<< HEAD
        // L�pptulemus
        for (K�simused k�simus: k�situd) {
            if (k�simus.on�ige())
                System.out.println("�: Vastasid �igesti!"); // Muuda seda detailisemaks
            else
                System.out.println("V: Vastasid valesti"); // Muda seda detailsemaks, mis oleks �ige olnud, mis tema vastas jne
        }
        // Prindi v�lja testi tegemiseks kulunud aeg (finishtime - starttime)
=======
        scanner.close();
        
        // LĆµpptulemus
        for (Küsimus küsimus: küsitud) {
            if (küsimus.onÕige())
                System.out.println(küsimus.toString()+"✔: Tubli. Õige!"); // Muuda seda detailisemaks
            else
                System.out.println(küsimus.toString()+"✘: Eksisiteee!"); // Muda seda detailsemaks, mis oleks Ćµige olnud, mis tema vastas jne
        }
               
>>>>>>> e6be25ce004429b120db2714631fc17b928a599c
    }
   
 
}

