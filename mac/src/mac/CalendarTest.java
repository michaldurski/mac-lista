package mac;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarTest {

 public static void main(String[] args) {
  
  GregorianCalendar d = new GregorianCalendar();

  int today = d.get(Calendar.DAY_OF_MONTH);
  int month = d.get(Calendar.MONTH);

  d.set(Calendar.DAY_OF_MONTH, 1);// ustawiamy na pierwszy dzieñ miesi¹ca
  wysCal(d);
  int weekday = d.get(Calendar.DAY_OF_WEEK);
  // teraz bedziemy sprawdzaæ od którego dnia tygodnia bedzie sie zaczyna³
  // miesi¹c
  int firstDayOfWeek = d.getFirstDayOfWeek();
  wyswietln("pierwszy dzieñ tygodnia to: "+firstDayOfWeek);
  int indent = 0;
  while (weekday != firstDayOfWeek) {
   indent++;
   wyswietl("dzien:"); wysCal(d);
   d.add(Calendar.DAY_OF_MONTH, -1);// czemu odejmujemy 1
   weekday = d.get(Calendar.DAY_OF_WEEK);// czemu na nowo podajemy
             // zmienna
  }
  String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();

  do {
   System.out.printf("%4s", weekdayNames[weekday]);
   d.add(Calendar.DAY_OF_MONTH, 1);
   weekday = d.get(Calendar.DAY_OF_WEEK);
  } while (weekday != firstDayOfWeek);
  System.out.println();

  for (int i = 1; i <= indent; i++) {
   System.out.print("    ");

   d.set(Calendar.DAY_OF_MONTH, 1);
   do {
    int day = d.get(Calendar.DAY_OF_MONTH);
    System.out.printf("%3d", day);

    if (day == today)
     System.out.print("*");
    else
     System.out.print(" ");

    d.add(Calendar.DAY_OF_MONTH, 1);
    weekday = d.get(Calendar.DAY_OF_WEEK);

    if (weekday == firstDayOfWeek)
     System.out.println();
   } while (d.get(Calendar.MONTH) == month);
   if (weekday != firstDayOfWeek)
    System.out.println();
  }
 }

 public static void wyswietl(String txt) {
	 System.out.print(txt);
 }
 
 public static void wyswietln(String txt) {
	 System.out.println(txt);
 }
  
public static void wysCal(Calendar c) {
	Calendar cal = c;
	Date date = cal.getTime();             
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	String date1 = format1.format(date);            
	Date inActiveDate = null;
	try {
	    inActiveDate = format1.parse(date1);
	    wyswietln(date1);
	} catch (ParseException e1) {
	    // TODO Auto-generated catch block
	    e1.printStackTrace();
	}
}
}