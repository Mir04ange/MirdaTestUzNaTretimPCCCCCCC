package DUCH;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //omlouvam se za zmatky ale nejak to funguje
        ArrayList<String> duchove = new ArrayList<>();
        String[] zpravy = {
                "Ve sklepe strasi [ Casper ] uz od pulnoci. ",
                "Na pude je [BOO]. ",
                "V chodbe je [Al]. ",
                "Za oknem je [LovecDuchu]. ",
                "U dveri je [ ]. ",
                "Na schodech je [DlouhatanskeJmeno]. ",
                "Nekdo napsal ]Berta[.",
                "V kuchyni je [Berta. ",
                null,
                "V salu je [ casper ]. ",
                "U brany je [Boo]. ",
                "Na vezi je [Berta]. "
        };

        int neplatne = 0;
        int duplicity = 0;

        for (String zprava : zpravy) {

            String jmeno = Duch.jmenoDucha(zprava);

            if (jmeno.equals("")) {
                neplatne++;
            }
            else if (Duch.uzEvidovan(duchove, jmeno)) {
                duplicity++;
            }
            else {
                duchove.add(jmeno);
            }
        }

        System.out.println("Evidovani duchove:");

        for (String duch : duchove) {
            System.out.println(duch);
        }

        System.out.println();
        System.out.println("Pocet evidovanych duchu: " + duchove.size());
        System.out.println("Pocet neplatnych zprav: " + neplatne);
        System.out.println("Pocet duplicitnich zprav: " + duplicity);
        System.out.println("Celkem odmitnutych zprav: " + (neplatne + duplicity));
    }
}
