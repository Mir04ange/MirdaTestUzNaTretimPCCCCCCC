package DVA;
/*
2. Napiš program na počítání, kolikrát se ozvalo baf. Vytvoř metodu int
pocetBaf(String text). Metoda vrátí počet všech výskytů části textu baf bez ohledu
na velikost písmen. Baf nemusí být samostatné slovo. Pro null i prázdný řetězec vrať 0.
Nepoužívej split(), regulární výrazy ani replace(). (4 b)

Testovací data:
• "BAF-baf! BAf"
• "ticho"
• "baFbaf"
• ""
• null
 */
public class Main {

    public static void main(String[] args) {

        String[] texty = {
                "BAF-baf! BAf",
                "ticho",
                "baFbaf",
                "",
                null
        };

        for (String text : texty) {
            System.out.println(Baf.pocetBaf(text));
        }
    }
}