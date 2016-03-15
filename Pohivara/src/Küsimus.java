public class Küsimus {
    private String definitsioon; // Definitsioon
    private String õige_vastus; // Õige vastus
    private String mängija_vastus; // Kasutaja pakutud vastus
    private boolean onÕige;
   
    public Küsimus(String definitsioon, String answer) {
        this.definitsioon = definitsioon.replaceAll("(.{100} )", "$1\n");
        this.õige_vastus = answer;   
        
    }
 
    public String getU_answer() {
        return mängija_vastus;
    }
 
    public boolean setU_answer(String mängija_vastus) {
        this.mängija_vastus = mängija_vastus;
        if (this.mängija_vastus.equalsIgnoreCase(õige_vastus)){//see tähendab seda, et tähevahet ta ei tee
            onÕige = true;
            return true;
        }
        onÕige = false;
        return false;
        
  
    } 
    public String getDefinitsioon() {
        return definitsioon;
    } 
    public String getõige_vastus() {
        return õige_vastus;
    } 
    public boolean onÕige() {
        return onÕige;
    }

	@Override
	public String toString() {
		return "\nKüsimus [definitsioon= " + definitsioon + ", õige_vastus= " + õige_vastus + ", Teie vastus= "
				+ mängija_vastus + ", Tulemus=" + onÕige + "]";
	}   
    
    
}