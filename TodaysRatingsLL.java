import java.util.LinkedList;

public class TodaysRatingsLL implements ISet {

    private LinkedList allRatings = new LinkedList<TodaysRatings>();

    TodaysRatingsLL(LinkedList<TodaysRatings> allRatings) {
        this.allRatings = allRatings;
    }

    @Override
    public int bestRankThisMonth() {
        return 0;
    }

    @Override
    public int totalSongDownloads(int month, int year) {
        return 0;
    }

    @Override
    public void addTodaysSurveys(LinkedList<Survey> surveyLinkedList) {

    }
    @Override
    public void add(TodaysRatings todaysRatings) {

    }

}
