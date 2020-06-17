package at.campus02.iwi.pr2.bsp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Pr2Bsp1Test {

    private AppTicket app1, app2, app3;
    private PaperTicket paper1, paper2, paper3, paper4;
    private KITT kitt1, kitt2;
    private ConcertSystem concert;


    // @Before
    // public void setup(){


    //     kitt1 = new KITT("Fan 1");
    //     kitt2 = new KITT("Fan 2");
    //     app1 = new AppTicket("Ms. ios", 120, "ios");
    //     app2 = new AppTicket("Mr. and", 80, "android");
    //     app3 = new AppTicket("Ms. Win", 40, "win");
    //     paper1 = new PaperTicket("Luck Rich", 80, true);
    //     paper2 = new PaperTicket("Normal Rich", 70, false);
    //     paper3 = new PaperTicket("Luck Poor", 40, true);
    //     paper4 = new PaperTicket("Normal Poor", 50, false);



    // }

    // @Test
    // public void testAppgetSecret() {

    //     String s1 = app1.getSecret();
    //     String s2 = app1.getSecret();

    //     String s2_1 = app2.getSecret();
    //     String s2_2 = app2.getSecret();

    //     assertTrue(TicketFraudSystem.checkTicket(app1));
    //     assertTrue(TicketFraudSystem.checkTicket(app2));

    //     assertEquals(s1, s2);
    //     assertEquals(s2_1, s2_2);
    //     assertTrue(s1.startsWith("A_"));
    //     assertTrue(s2_1.startsWith("A_"));

    // }

    // @Test
    // public void testPapergetSecret() {

    //     String s1 = paper1.getSecret();
    //     String s2 = paper1.getSecret();

    //     String s2_1 = paper2.getSecret();
    //     String s2_2 = paper2.getSecret();

    //     assertTrue(TicketFraudSystem.checkTicket(paper1));
    //     assertTrue(TicketFraudSystem.checkTicket(paper2));

    //     assertEquals(s1, s2);
    //     assertEquals(s2_1, s2_2);
    //     assertTrue(s1.startsWith("P_"));
    //     assertTrue(s2_1.startsWith("P_"));

    // }
    // @Test
    // public void testKITTgetSecret() {

    //     String k1_s1 = kitt1.getSecret();
    //     String k1_s2 = kitt1.getSecret();

    //     String k2_s1 = kitt2.getSecret();
    //     String k2_s2 = kitt2.getSecret();

    //     assertTrue(TicketFraudSystem.checkTicket(kitt1));
    //     assertTrue(TicketFraudSystem.checkTicket(kitt2));

    //     assertEquals(k1_s1, k1_s2);
    //     assertEquals(k2_s1, k2_s2);
    //     assertTrue(k1_s1.startsWith("K_"));
    //     assertTrue(k2_s1.startsWith("K_"));

    // }
    // @Test
    // public void testKITTgetTicketOwner() {

    //     assertEquals("Fan 1", kitt1.getTicketOwner());
    //     assertEquals("Fan 2", kitt2.getTicketOwner());

    // }
    // @Test
    // public void testAppgetTicketOwner() {

    //     assertEquals("Ms. ios", app1.getTicketOwner());
    //     assertEquals("Mr. and", app2.getTicketOwner());

    // }
    // @Test
    // public void testPapergetTicketOwner() {

    //     assertEquals("Luck Rich", paper1.getTicketOwner());
    //     assertEquals("Normal Rich", paper2.getTicketOwner());

    // }
    // @Test
    // public void testAppgetCategory() {

    //     assertEquals(1, app1.getCategory());
    //     assertEquals(2, app2.getCategory());
    //     assertEquals(3, app3.getCategory());

    // }
    // @Test
    // public void testKITTgetCategory() {

    //     assertEquals(1 , kitt1.getCategory());
    //     assertEquals(1 , kitt2.getCategory());

    // }

    // @Test
    // public void testPapergetCategory() {

    //     assertEquals(1 , paper1.getCategory());
    //     assertEquals(2 , paper2.getCategory());
    //     assertEquals(2 , paper3.getCategory());
    //     assertEquals(3 , paper4.getCategory());

    // }

    // @Test
    // public void testAppgetProfit() {

    //     assertEquals(84, app1.getProfit(), 0.001);
    //     assertEquals(60, app2.getProfit(), 0.001);
    //     assertEquals(30, app3.getProfit(), 0.001);

    // }
    // @Test
    // public void testKITTgetProfit() {

    //     assertEquals(500 , kitt1.getProfit(), 0.001);
    //     assertEquals(500 , kitt2.getProfit(), 0.001);

    // }

    // @Test
    // public void testPapergetProfit() {

    //     assertEquals(60 , paper1.getProfit(), 0.001);
    //     assertEquals(50 , paper2.getProfit(), 0.001);
    //     assertEquals(20 , paper3.getProfit(), 0.001);
    //     assertEquals(30 , paper4.getProfit(), 0.001);

    // }
    // @Test
    // public void testCSdonation() {
    //     concert = new ConcertSystem();
    //     assertTrue(concert.addTicket(kitt1));
    //     assertTrue(concert.addTicket(kitt2));
    //     assertTrue(concert.addTicket(app1));
    //     assertTrue(concert.addTicket(app2));
    //     assertTrue(concert.addTicket(app3));
    //     assertTrue(concert.addTicket(paper1));
    //     assertTrue(concert.addTicket(paper2));
    //     assertTrue(concert.addTicket(paper3));
    //     assertTrue(concert.addTicket(paper4));

    //     HashMap<Integer, Double> erg = concert.donationPerCategory();


    //     assertEquals(3, erg.size());
    //     assertTrue(erg.containsKey(1));
    //     assertTrue(erg.containsKey(2));
    //     assertTrue(erg.containsKey(3));
    //     assertEquals(343.2, erg.get(1), 0.01);
    //     assertEquals(26.0, erg.get(2), 0.01);
    //     assertEquals(6.0, erg.get(3), 0.01);


    // }
    // @Test
    // public void testCSinvited() {
    //     concert = new ConcertSystem();
    //     assertTrue(concert.addTicket(kitt1));
    //     assertTrue(concert.addTicket(kitt2));
    //     assertTrue(concert.addTicket(app1));
    //     assertTrue(concert.addTicket(app2));
    //     assertTrue(concert.addTicket(app3));
    //     assertTrue(concert.addTicket(paper1));
    //     assertTrue(concert.addTicket(paper2));
    //     assertTrue(concert.addTicket(paper3));
    //     assertTrue(concert.addTicket(paper4));

    //     ArrayList<String> erg = concert.invitedToStage();

    //     assertEquals(3, erg.size());
    //     assertTrue(erg.contains("Luck Rich"));
    //     assertTrue(erg.contains("Fan 1"));
    //     assertTrue(erg.contains("Fan 2"));

    // }
    // @Test
    // public void testCSprofit() {
    //     concert = new ConcertSystem();
    //     assertTrue(concert.addTicket(kitt1));
    //     assertTrue(concert.addTicket(kitt2));
    //     assertTrue(concert.addTicket(app1));
    //     assertTrue(concert.addTicket(app2));
    //     assertTrue(concert.addTicket(app3));
    //     assertTrue(concert.addTicket(paper1));
    //     assertTrue(concert.addTicket(paper2));
    //     assertTrue(concert.addTicket(paper3));
    //     assertTrue(concert.addTicket(paper4));


    //     assertEquals(286.0, concert.profitPerCategory(1), 0.01);
    //     assertEquals(43.333, concert.profitPerCategory(2), 0.01);
    //     assertEquals(30.0, concert.profitPerCategory(3), 0.01);
    // }


    // // DOES NOT TEST if you use TicketFraudSystem correctly
    // @Test
    // public void testCSadd() {
    //     concert = new ConcertSystem();
    //     assertTrue(concert.addTicket(kitt1));
    //     assertTrue(concert.addTicket(kitt2));
    //     assertTrue(concert.addTicket(app1));
    //     assertTrue(concert.addTicket(app2));
    //     assertTrue(concert.addTicket(app3));
    //     assertTrue(concert.addTicket(paper1));
    //     assertTrue(concert.addTicket(paper2));
    //     assertTrue(concert.addTicket(paper3));
    //     assertTrue(concert.addTicket(paper4));
    //     assertFalse(concert.addTicket(paper1));
    // }


}
