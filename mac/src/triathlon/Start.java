package triathlon;

public class Start {
	
private int competitorID;
private int competitionID;
private double swimmingTime;
private double T1;
private double cyclingTime;
private double T2;
private double runningTime;

    public Start(int competitorID, int competitionID, double swimmingTime, double t1, double cyclingTime, double t2,
            double runningTime) {
        this.competitorID = competitorID;
        this.competitionID = competitionID;
        this.swimmingTime = swimmingTime;
        T1 = t1;
        this.cyclingTime = cyclingTime;
        T2 = t2;
        this.runningTime = runningTime;
    }
    public void totalTime (){
        double sumTheTimes = swimmingTime+T1+T2+runningTime+cyclingTime;
        System.out.println("Calosciowy czas wynosi: "+sumTheTimes+ " minuty");
    }
    
    public String toString() {
        return "Zawody [ID Zawodnika=" + competitorID + ", ID zawodow=" + competitionID + ", czas plywania="
                + swimmingTime + ", czas pierwszej przerwy=" + T1 + ", czas jazdy na rowerze=" + cyclingTime
                + ", czas drugiej przerwy=" + T2 + ", czas biegania=" + runningTime + "]";
    }
    
    public int getCompetitorID() {
        return competitorID;
    }
    
    public int getCompetitionID() {
        return competitionID;
    }
    
    public double getSwimmingTime() {
        return swimmingTime;
    }
    
    public double getT1() {
        return T1;
    }
    
    public double getCyclingTime() {
        return cyclingTime;
    }
    
    public double getT2() {
        return T2;
    }
}