package triathlon;


import java.util.ArrayList;
import java.util.Date;



public class Zawodnik  {
        private String name;
        private String surname;
        private Date dateOfBirth;
        private int dayOfBirth;
        public int monthOfBirth;
        private int yearOfBirth;
        private String club;
        private long age;
        
        private choose sex;
        private ArrayList<Start>starts = new ArrayList<Start>();
        
        public Zawodnik(String name, String surname, Date dateOfBirth, String club,
                choose sex) {
        super();
        this.name = name;
        this.surname = surname;
        this.setDateOfBirth(dateOfBirth);
        this.club = club;
        this.sex = sex;        
        
}
        

        public Zawodnik(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth, String club,
                        choose sex) {
                super();
                this.name = name;
                this.surname = surname;
                this.dayOfBirth = dayOfBirth;
                this.monthOfBirth = monthOfBirth;
                this.yearOfBirth = yearOfBirth;
                this.club = club;
                this.sex = sex;        
                
        }
        public enum choose{
                M,
                W
        }
        public void dodajStart(Start starty) {

                starts.add(starty);
        }
        public String toString(){
                return  "Zawodnik [imie=" + name + ", nazwisko=" + surname + ", data urodzenia=" + dayOfBirth
                                +"."+monthOfBirth+"."+yearOfBirth + ", nazwa klubu="        +club+", plec="+sex+"]";
        }
        

        public String getName() {
                return name;
        }

        public String getSurname() {
                return surname;
        }

        public int getDayOfBirth() {
                return dayOfBirth;
        }

        public int getMonthOfBirth() {
                return monthOfBirth;
        }

        public int getYearOfBirth() {
                return yearOfBirth;
        }

        public String getClub() {
                return club;
        }

        public choose getSex() {
                return sex;
        }
        public ArrayList<Start> getStarts() {
                return starts;
        }
        public long getAge() {
                return age;
        }


		/**
		 * @return the dateOfBirth
		 */
		public Date getDateOfBirth() {
			return dateOfBirth;
		}


		/**
		 * @param dateOfBirth the dateOfBirth to set
		 */
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
        
        



}