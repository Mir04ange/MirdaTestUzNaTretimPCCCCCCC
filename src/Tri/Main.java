package Tri;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] zpravy = {
                " PoZoR: duch na pude ",
                "DyNe zmizela.",
                "Na dvore je dyne!",
                "Duch spi.",
                " ",
                null
        };

        ArrayList<IFiltrZprav> filtry = new ArrayList<>();

        filtry.add(new VarovnyFiltr());
        filtry.add(new DynovyFiltr());

        for (IFiltrZprav filtr : filtry) {

            System.out.println("Filtr: " + filtr.getClass().getSimpleName());
            int pocet = 0;
            for (String zprava : zpravy) {
                if (filtr.prijima(zprava)) {
                    System.out.println(zprava);
                    pocet++;
                }
                else ; //nic;
            }

            System.out.println("Pocet prijatych zprav: " + pocet);
            System.out.println();
        }
    }
}