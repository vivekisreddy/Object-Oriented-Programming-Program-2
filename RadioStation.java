import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public abstract class RadioStation implements ISet{


    private GregorianCalendar date;

    private ISet allRatings;

    //private LinkedList<TodaysRatings> allRatings;


    public RadioStation(GregorianCalendar date, ISet allRatings) {
        this.date = date;
        this.allRatings = allRatings;
    }


    // Methods

    /**
     * This returns the smallest rank this month or the highest ranking that the band received.
     * @return int
     */
    public int bestRankThisMonth() {
        for (TodaysRatings rating : allRatings) {

            if (rating.compareMonth(this.date.get(GregorianCalendar.MONTH))) {
                return rating.rankingOfSurveyIterator();
            }
        }
        return -1;
    }

    /**
     * This takes in a month and year and then sums all the downloads that occurred during that timeframe.
     * @param month
     * @param year
     * @return int
     */
    public int totalSongDownloads(int month, int year) {
        for (TodaysRatings rating : allRatings) {
            if (rating.compareMonth(month) && rating.compareYear(year)) {
                return rating.downloadsOfSurveyIterator();
            }
        }
        return 0;
    }


    /**
     * Takes in a list of surveys and creates a new TodaysRatings object and adds it to the allRatings list.
     * Then adds 1 to the current date.
     * @param surveyLinkedList
     */
    public void addTodaysSurveys(LinkedList<Survey> surveyLinkedList) {
        LinkedList<Integer> currentListOfRanks = new LinkedList<Integer>();
        LinkedList<Integer> currentListOfDownloads = new LinkedList<Integer>();

        for (Survey survey : surveyLinkedList) {
            currentListOfRanks.add(survey.rank);
            currentListOfDownloads.add(survey.downloads);
        }

        allRatings.add(new TodaysRatings(new GregorianCalendar(date.get(GregorianCalendar.YEAR), date.get(GregorianCalendar.MONTH), date.get(GregorianCalendar.DAY_OF_MONTH) + 1), currentListOfRanks, currentListOfDownloads));
        this.date = new GregorianCalendar(date.get(GregorianCalendar.YEAR), date.get(GregorianCalendar.MONTH), date.get(GregorianCalendar.DAY_OF_MONTH) + 1);
    }

}


/*
What might be a better data structure than a LinkedList<TodaysRatings> to encapsulate? Why?

If you implemented a class to encapsulate that data structure as a field,
how would that class implement the methods of the interface you designed?

    Answer: The fields of a class are hidden from any other class and can be accessed only
            through any member function of its own class in which it is declared.
            The data in a class is hidden from other classes using the data hiding concept
            which is achieved by making the members or methods of a class private.
            Encapsulation allows for the variables and fields in the class to be declared as private
            and the public methods in the class to set values of variables.


Do you think it is possible to implement that class without modifying the interface? Why or why not?

    Answer: It is not possible to implement that class without modifying the interface. This is because
            to declare the class and make interface instance with new.

            ** Add to this answer
 */

