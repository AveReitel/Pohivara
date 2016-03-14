import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class Questionnaire {
    private List<Küsimused> küsimus; // Küsimuste list
    private String mängija_nimi; // Mängija nimi
    private Date alustusaeg; // Algusaeg
    private Date lõppaeg; // Lõpuaeg
    private List<Küsimused> küsitud ; // Küsitud küsimuste list, tulemuste jaoks
    private int correctAnswers; // õigeid vastusied
    private String kodeering = "UTF-8";
   
    public Questionnaire(String input,String kodeering, String name)
    {
        this.mängija_nimi = mängija_nimi;
        parseInputFile(input);
        alustusaeg = new Date(); // Praegune aeg saab algusajaks
        alustaMängu();
    }
   
    private void parseInputFile(String input) {
        // Siin loe fail sisse, tee oma failist Question tĆ¼Ć¼pi isendid
        // Siia paned tsĆ¼kli, mis splitib sul need definitsioonid ja seletused Ć¤ra, ja nendest teed Qustion tĆ¼Ć¼pi isendid (konstruktorit vaata seal)
    }
   
    private void alustaMängu() {
        // Testi pĆµhitsĆ¼kkel
        while (küsimus.size() != 0)
        {
            int i =  0 + (int)(Math.random() * küsimus.size());
            Küsimused k = küsimus.get(i);
            Scanner scanner = new Scanner(System.in);
            System.out.println(k.getDefinitsioon());
            String mängija_vastus = scanner.next();
            k.setU_answer(mängija_vastus);
            küsimus.remove(i);
            küsitud.add(k);          
        }
        // LĆµpptulemus
        for (Küsimused küsimus: küsitud) {
            if (küsimus.onÕige())
                System.out.println("✔: Tubli. Õige!"); // Muuda seda detailisemaks
            else
                System.out.println("✘: Eksisite!"); // Muda seda detailsemaks, mis oleks Ćµige olnud, mis tema vastas jne
        }
        System.out.println((new java.util.Date()).getTime() - alustusaeg.getTime()); //arvutan mängu kestuse
        // Prindi vĆ¤lja testi tegemiseks kulunud aeg (finishtime - starttime)
        
    }
   
 
}

