package DVA;

public class Baf {
 // pozice je opice u meeeee HAHA
    public static int pocetBaf(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        text = text.toLowerCase();
        int pocet = 0;
        int opice = 0;
        while ((opice = text.indexOf("baf", opice)) != -1) {
            pocet++;
            opice += 3;



        }
        return pocet;
    }
}