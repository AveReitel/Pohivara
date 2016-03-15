public class Küsimus {
    private String definitsioon; // Definitsioon
    private String õige_vastus; // Õige vastus
    private String mängija_vastus; // Kasutaja pakutud vastus
    private boolean onÕige;
   
    public Küsimus(String definitsioon, String answer) {
        this.definitsioon = definitsioon.replaceAll("(.{80} )", "$1\n");
        this.õige_vastus = answer;   
        
    }
 
    public String getU_answer() {
        return mängija_vastus;
    }
 
    public void setU_answer(String mängija_vastus) {
        this.mängija_vastus = mängija_vastus.toLowerCase();
        // Kontrolli tulemust
        if (mängija_vastus.equals(õige_vastus.toLowerCase()))
            onÕige = true;
        //onÕige = false;
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
		return "Küsimus [definitsioon=" + definitsioon + ", õige_vastus=" + õige_vastus + ", mängija_vastus="
				+ mängija_vastus + ", onÕige=" + onÕige + "]";
	}   
    
    
}