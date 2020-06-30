package at.campus02.iwi.pr1.bsp1;

import java.util.Arrays;

public class Zoo {
    static final int LIMIT_KLEINTIER = 5;
    static final int LIMIT_GROSZTIER = 500;

    static final double KOSTEN_KLEINTIER = 3.2;
    static final double KOSTEN_GROSZTIER = 8.5;
    static final double KOSTEN_ELEFANT = 23.9;

    static final int LIMIT_CONTAINER = 500;
    int startIndex = 0;

    public static void main(String[] args) {
        final double[] GEWICHTE = ZooData.ANIMAL_WEIGHTS;
    }

    // 16 %
    public static int tierAnzahl(double[] gewichte) {

        return gewichte.length; // Platzhalter
    }

    // 16 %
    public static int elefanten(double[] gewichte) {
        int anzahlElefanten = 0;

        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] >= LIMIT_GROSZTIER) {
                anzahlElefanten++;
            }
        }

        return anzahlElefanten;
    }

    // 16 %
    public static double mittleresGewicht(double[] gewichte) {
        if (gewichte.length == 0) {
            return 0d;
        }
        double sum = 0d;
        for (int i = 0; i < gewichte.length; i++) {
            sum += gewichte[i];
        }

        return sum / gewichte.length;
    }

    // 16 %

    //futterKosten mit for Schleife, futterKosten2 mit Methoden lösen

    public static double futterKostenUnperformant(double[] gewichte) {
        int anzahlKleintier = 0;
        int anzahlGrosztier = 0;
        int anzahlElefanten = 0;

        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] < LIMIT_KLEINTIER) {
                anzahlKleintier++;
            }
        }

        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] < LIMIT_GROSZTIER && gewichte[i] >= LIMIT_KLEINTIER) {
                anzahlGrosztier++;
            }
        }

        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] >= LIMIT_GROSZTIER) {
                anzahlElefanten++;
            }
        }
        double sumFutter = (anzahlKleintier * KOSTEN_KLEINTIER) + (anzahlGrosztier * KOSTEN_GROSZTIER) + (anzahlElefanten * KOSTEN_ELEFANT);

        return sumFutter;
    }

    public static double futterKosten(double[] gewichte) {

        int AnzahlKleintier = 0;
        int AnzahlGrosztier = 0;
        int AnzahlElefanten = 0;

        for (int i = 0; i < gewichte.length; i++) {

            if (gewichte[i] >= LIMIT_GROSZTIER) {
                AnzahlElefanten++;
            } else if (gewichte[i] < LIMIT_GROSZTIER && gewichte[i] > LIMIT_KLEINTIER) {
                AnzahlGrosztier++;
            } else {
                AnzahlKleintier++;
            }
        }

        return (AnzahlElefanten * KOSTEN_ELEFANT) + (AnzahlGrosztier * KOSTEN_GROSZTIER) + (AnzahlKleintier * KOSTEN_KLEINTIER);
    }

    public static double futterKostenOhneZaehlen(double[] gewichte) {
        double kosten = 0d;
        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] < LIMIT_KLEINTIER) {
                kosten += KOSTEN_KLEINTIER;
            } else if (gewichte[i] < LIMIT_GROSZTIER) {
                kosten += KOSTEN_GROSZTIER;
            } else {
                kosten += KOSTEN_ELEFANT;
            }
        }

        return kosten;
    }


    public static boolean problemFallVorhanden(double[] gewichte) {

        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] < 1d) {
                return true;
            }
        }
        return false;
    }

    // 10%
    public static int problemFallIndex(double[] gewichte, int startIndex) {
        int keinProblemfall = -1;
        for (int i = startIndex; i < gewichte.length; i++) {
            if (gewichte[i] <= 1d) {
                return i;
            }
        }
        return keinProblemfall;
    }


    // 10 %
    public static int tiereImContainer(double[] gewichte, int index) {
        int anzahlImContainer = index;
        double gewichtImContainer = 0;
        for (int i = index; i < 5 && gewichte[i] < 500; i++) {
            if (gewichtImContainer + gewichte[i] < 500) {
                anzahlImContainer++;
            }
        }
        return anzahlImContainer;
    }
}
