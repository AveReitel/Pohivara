import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class Questionnaire {
    private List<Küsimused> küsimus; // KÃ¼simuste list
    private String mÃ¤ngija_nimi; // MÃ¤ngija nimi
    private Date alustusaeg; // Algusaeg
    private Date lÃµppaeg; // LÃµpuaeg
    private List<Küsimused> küsitud ; // KÃ¼situd kÃ¼simuste list, tulemuste jaoks
    private int correctAnswers; // Ãµigeid vastusied
   
    public Questionnaire(String input, String name)
    {
        this.mÃ¤ngija_nimi = mÃ¤ngija_nimi;
        parseInputFile(input);
        alustusaeg = new Date(); // Praegune aeg saab algusajaks
        alustaMÃ¤ngu();
    }
   
    private void parseInputFile(String input) {
        // Siin loe fail sisse, tee oma failist Question tÃ¼Ã¼pi isendid
        // Siia paned tsÃ¼kli, mis splitib sul need definitsioonid ja seletused Ã¤ra, ja nendest teed Qustion tÃ¼Ã¼pi isendid (konstruktorit vaata seal)
    }
   
    private void alustaMÃ¤ngu() {
        // Testi pÃµhitsÃ¼kkel
        while (küsimus.size() != 0)
        {
            int i =  0 + (int)(Math.random() * küsimus.size());
            Küsimused k = küsimus.get(i);
            Scanner scanner = new Scanner(System.in);
            System.out.println(k.getDefinitsioon());
            String u_answer = scanner.next();
            k.setU_answer(u_answer);
            küsimus.remove(i);
            küsitud.add(k);          
        }
        // LÃµpptulemus
        for (Küsimused küsimus: küsitud) {
            if (küsimus.onÕige())
                System.out.println("Ã•: Vastasid Ãµigesti!"); // Muuda seda detailisemaks
            else
                System.out.println("V: Vastasid valesti"); // Muda seda detailsemaks, mis oleks Ãµige olnud, mis tema vastas jne
        }
        // Prindi vÃ¤lja testi tegemiseks kulunud aeg (finishtime - starttime)
    }
   
 
}

