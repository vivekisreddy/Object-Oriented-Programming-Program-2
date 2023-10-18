import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class Examples {

    // Survey Objects

    Survey Sur1 = new Survey(1, 150);
    Survey Sur2 = new Survey(4, 95);
    Survey Sur3 = new Survey(5, 80);
    Survey Sur4 = new Survey(3, 110);
    Survey Sur5 = new Survey(8, 50);
    Survey Sur6 = new Survey(12, 25);
    Survey Sur7 = new Survey(7, 75);
    Survey Sur8 = new Survey(10, 40);
    Survey Sur9 = new Survey(9, 45);
    Survey Sur10 = new Survey(11, 35);
    Survey Sur11 = new Survey(14, 15);
    Survey Sur12 = new Survey(6  , 65);
    Survey Sur13 = new Survey(2, 125);
    Survey Sur14 = new Survey(15, 10);
    Survey Sur15 = new Survey(13, 20);

    TodaysRatings TR1 = new TodaysRatings(new GregorianCalendar(2021, 2, 28));
    TodaysRatings TR2 = new TodaysRatings(new GregorianCalendar(2022, 1, 30));

    LinkedList<TodaysRatings> emptyLTR1 = new LinkedList<TodaysRatings>();
    LinkedList<TodaysRatings> LTR1 = new LinkedList<TodaysRatings>();

    LinkedList<Survey> emptyLSur = new LinkedList<Survey>();
    LinkedList<Survey> LSur = new LinkedList<Survey>();

    public Examples() {
        //LSur.addSurvey(Sur1);
        //LSur.addSurvey(Sur1);
        //LSur.addSurvey(Sur1);
        //LSur.addSurvey(Sur1);
        // LSur.addSurvey(Sur1);
        LSur.add(Sur3);
        LSur.add(Sur10);
        LSur.add(Sur7);
        LSur.add(Sur1);
        LSur.add(Sur12);
    }

    RadioStation RS1 = new RadioStation();
    RadioStation RS2 = new RadioStation();

/*
    @Test
    public void check1() {
        assertEquals(1, Sur1);
    }

 */
}
