package DUCH;

import java.util.ArrayList;

public class Duch {

    public static String jmenoDucha(String zprava) {

        if (zprava == null) {
            return "";
        }

        int zacatek = zprava.indexOf('[');

        if (zacatek == -1) {
            return "";
        }

        int konec = zprava.indexOf(']', zacatek + 1);

        if (konec == -1) {
            return "";
        }

        String jmeno = zprava.substring(zacatek + 1, konec).trim();

        if (jmeno.length() < 3 || jmeno.length() > 12) {
            return "";
        }

        if (jmeno.toLowerCase().contains("lovec")) {
            return "";
        }

        return jmeno;
    }
    public static boolean uzEvidovan(ArrayList<String> duchove, String jmeno) {

        for (String duch : duchove) {
            if (duch.equalsIgnoreCase(jmeno)) {
                return true;
            }
        }

        return false;
    }
}