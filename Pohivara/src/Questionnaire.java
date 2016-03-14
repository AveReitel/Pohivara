import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class Questionnaire {
    private List<Küsimused> küsimus; // Küsimuste list
    private String mängija_nimi; // Mängija nimi
    private Date alustusaeg; // Algusaeg
    private Date lõppaeg; // Lõpuaeg
    private List<Küsimused> küsitud ; // Küsitud küsimuste list, tulemuste jaoks
    private int correctAnswers; // Ãµigeid vastusied
   
    public Questionnaire(String input, String name)
    {
        this.mängija_nimi = mängija_nimi;
        parseInputFile(input);
        alustusaeg = new Date(); // Praegune aeg saab algusajaks
        alustaMängu();
    }
   
    private void parseInputFile(String input) {
        // Siin loe fail sisse, tee oma failist Question tüüpi isendid
        // Siia paned tsükli, mis splitib sul need definitsioonid ja seletused ära, ja nendest teed Qustion tüüpi isendid (konstruktorit vaata seal)
    }
   
    private void alustaMängu() {
        // Testi pÃµhitsükkel
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
        // Lõpptulemus
        for (Küsimused küsimus: küsitud) {
            if (küsimus.onÕige())
                System.out.println("Õ: Vastasid õigesti!"); // Muuda seda detailisemaks
            else
                System.out.println("V: Vastasid valesti"); // Muda seda detailsemaks, mis oleks õige olnud, mis tema vastas jne
        }
        // Prindi välja testi tegemiseks kulunud aeg (finishtime - starttime)
    }
   
 
}

