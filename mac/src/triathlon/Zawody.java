package triathlon;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Zawody {
	private String nameOfCompetition;
	private String typeOfCompetition;
	private Date dateOfCompetition;
	private int dayOfCompetition;
	private int monthOfCompetition;
	private int yearOfCompetition;
	private double distance;
	private String reward;
	private ArrayList<Zawodnik> zawodnicy = new ArrayList<Zawodnik>();

	public Zawody() {
		this("fewf", "refw", 2, 3, 4, 24.0, "freg");
	}

	public Zawody(String nameOfCompetition, String typeOfCompetition, int dayOfCompetition, int monthOfCompetition,
			int yearOfCompetition, double distance, String reward) {

		this.nameOfCompetition = nameOfCompetition;
		this.typeOfCompetition = typeOfCompetition;
		this.dayOfCompetition = dayOfCompetition;
		this.monthOfCompetition = monthOfCompetition;
		this.yearOfCompetition = yearOfCompetition;
		this.distance = distance;
		this.reward = reward;

	}

	public void findTheOldestCompetitorDate() {
		Zawodnik competitor = null;
		Zawodnik oldestGuy = null;
		Date d = new Date(1800,1,1);
		
		long age = 0;
		for (int i = 0; i < zawodnicy.size(); i++) {
			competitor = zawodnicy.get(i);
			
		}
		System.out.println("najstarszym zawodnikiem jest: " + oldestGuy);
	}
	
	public void findTheOldestCompetitor() {
		Zawodnik competitor = null;
		Zawodnik oldestGuy = null;
		long age = 0;
		for (int i = 0; i < zawodnicy.size(); i++) {
			competitor = zawodnicy.get(i);
			GregorianCalendar date = new GregorianCalendar(competitor.getYearOfBirth(), competitor.getMonthOfBirth(),
					competitor.getDayOfBirth());
			long number = date.getTimeInMillis();
			if (age < number) {
				oldestGuy = zawodnicy.get(i);
			}
		}
		System.out.println("najstarszym zawodnikiem jest: " + oldestGuy);
	}

	public void generateNewCompetitor() {
		Zawodnik random = new Zawodnik(randomString(4), randomString(5), randomIntDay(), randomIntMonth(),
				randomIntYear(), randomString(7), Zawodnik.choose.M);
		zawodnicy.add(random);
	}

	public Zawodnik.choose sex(Zawodnik zawodnik) {
		return null;
	}

	public static String randomString(int length) {
		char[] word = new char[100];

		for (int i = 0; i < length; i++) {
			word[i] = (char) (((int) (Math.random() * 26)) + (int) 'A');
		}

		return (new String(word, 0, length));
	}

	public static int randomIntDay() {
		Random n = new Random();
		return n.nextInt(30) + 1;
	}

	public static int randomIntMonth() {
		Random n = new Random();
		return n.nextInt(12) + 1;
	}

	public static int randomIntYear() {
		Random n = new Random();
		return n.nextInt(100) + 1900;
	}

	public void dodajZawodnika(Zawodnik zawodnik) {

		zawodnicy.add(zawodnik);

	}

	public String getNameOfCompetition() {
		return nameOfCompetition;
	}

	public String getTypeOfCompetition() {
		return typeOfCompetition;
	}

	public int getDayOfCompetition() {
		return dayOfCompetition;
	}

	public int getMonthOfCompetition() {
		return monthOfCompetition;
	}

	public int getYearOfCompetition() {
		return yearOfCompetition;
	}

	public double getDistance() {
		return distance;
	}

	public String getReward() {
		return reward;
	}

	public ArrayList<Zawodnik> getZawodnicy() {
		return zawodnicy;
	}

	/**
	 * @return the dateOfCompetition
	 */
	public Date getDateOfCompetition() {
		return dateOfCompetition;
	}

	/**
	 * @param dateOfCompetition the dateOfCompetition to set
	 */
	public void setDateOfCompetition(Date dateOfCompetition) {
		this.dateOfCompetition = dateOfCompetition;
	}
}