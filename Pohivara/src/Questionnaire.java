import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class Questionnaire {
    private List<K�simused> k�simus; // Küsimuste list
    private String mängija_nimi; // Mängija nimi
    private Date alustusaeg; // Algusaeg
    private Date lõppaeg; // Lõpuaeg
    private List<K�simused> k�situd ; // Küsitud küsimuste list, tulemuste jaoks
    private int correctAnswers; // õigeid vastusied
   
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
        // Testi põhitsükkel
        while (k�simus.size() != 0)
        {
            int i =  0 + (int)(Math.random() * k�simus.size());
            K�simused k = k�simus.get(i);
            Scanner scanner = new Scanner(System.in);
            System.out.println(k.getDefinitsioon());
            String u_answer = scanner.next();
            k.setU_answer(u_answer);
            k�simus.remove(i);
            k�situd.add(k);          
        }
        // Lõpptulemus
        for (K�simused k�simus: k�situd) {
            if (k�simus.on�ige())
                System.out.println("Õ: Vastasid õigesti!"); // Muuda seda detailisemaks
            else
                System.out.println("V: Vastasid valesti"); // Muda seda detailsemaks, mis oleks õige olnud, mis tema vastas jne
        }
        // Prindi välja testi tegemiseks kulunud aeg (finishtime - starttime)
    }
   
 
}

