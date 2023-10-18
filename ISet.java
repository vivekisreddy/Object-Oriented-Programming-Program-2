import java.util.LinkedList;

public interface ISet {

    int bestRankThisMonth();
    int totalSongDownloads(int month, int year);
    void addTodaysSurveys(LinkedList<Survey> surveyLinkedList);
    void add(TodaysRatings todaysRatings);

}
