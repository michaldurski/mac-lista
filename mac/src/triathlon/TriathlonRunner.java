package triathlon;


public class TriathlonRunner {

        public static void main(String[] args) {
                Zawody weAreTriathlon = new Zawody("We are triathlon", "triathlon", 12, 6, 2017, 30, "uscisk dloni prezesa");
                
                Zawodnik michalDurski = new Zawodnik("Misial", "Durski", 4, 7, 1985, "ciezko powiedziec", Zawodnik.choose.M);
                
                Start r1 = new Start(1, 2, 15.0, 2.0, 26.0, 3.0, 15.0);
                
                michalDurski.dodajStart(r1);
                
                weAreTriathlon.dodajZawodnika(michalDurski);
                
                System.out.println(michalDurski.getStarts());
                System.out.println(weAreTriathlon.getZawodnicy());
                r1.totalTime();
        }

}

