import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.GregorianCalendar;

public class TodaysRatings {

    private GregorianCalendar date;

    private LinkedList<Integer> rankingsOfSurveys;

    private LinkedList<Integer> downloadsOfSurveys;


    // Constructing a date for daily ratings

    public TodaysRatings(GregorianCalendar date, LinkedList<Integer> rankingsOfSurveys, LinkedList<Integer> downloadsOfSurveys) {
        this.date = date;
        this.rankingsOfSurveys = rankingsOfSurveys;
        this.downloadsOfSurveys = downloadsOfSurveys;

    }

    public boolean compareMonth(int month)  {
        return this.date.get(GregorianCalendar.MONTH) == month;
    }
    public boolean compareMonth(TodaysRatings rating)  {
        return this.date.get(GregorianCalendar.MONTH) == rating.date.get(GregorianCalendar.MONTH);
    }

    public boolean compareYear(int year)  {
        return this.date.get(GregorianCalendar.YEAR) == year;
    }
    public boolean compareYear(TodaysRatings rating)  {
        return this.date.get(GregorianCalendar.YEAR) == rating.date.get(GregorianCalendar.YEAR);
    }

    public int rankingOfSurveyIterator() {
        int runningMin = -1;
        for (int rank : this.rankingsOfSurveys) {

            if (runningMin > rank) {
                runningMin = rank;
            }
        }
        return runningMin;
    }

    public int downloadsOfSurveyIterator() {
        int runningTotal = 0;
        for (int downloads : this.downloadsOfSurveys) {
            if (runningTotal >= 0) {
                runningTotal = runningTotal + downloads;
            }
        }
        return runningTotal;
    }

}
