package Exercices;

public class ConvertSecondsToDate {
    public static void main(String[] args) {
//        long h = 60 * 60;
//        long d = h * 24;
//        long w = d * 7;
//        long m = w * 4;
//        long y = m * 12;
//        System.out.println(y);
//        System.out.println(m);
//        System.out.println(w);
//        System.out.println(d);
//        System.out.println(h);
        convert(3153600L);
    }
    public static String convert(long timeInSeconds){
      long minutes = timeInSeconds / 60;
      long hours = minutes / 60;
      long days = hours / 24;
      long weeks = days / 7;
      long month = weeks / 4;
      long year = month / 12;
        String years = "";
        String months = "";
        System.out.println(year+"years");
        System.out.println(month+"months");
        System.out.println(weeks+"weeks");
        System.out.println(days+"days");
      System.out.println(hours+"hours");
      System.out.println(minutes+"minutes");
        System.out.println(timeInSeconds+"seconds");
        return year +"years and " + month + "months and " + weeks + "weeks and " + days +"days and "+hours+ "hours and " + minutes + "minutes and " + timeInSeconds + "seconds";
    }

}
