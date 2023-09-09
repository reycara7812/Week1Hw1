package fakesnews;

public class PhraseList {
    public static void main(String[] args) {
        String[] firePokemon = {"Charizard", "Cinderace", "Crocalor"};
                String[] waterPokemon = {"Squirtle", "Horsea", "Vaporeon"};
                String[] grassPokemon = {"Glazed", "Doubleglazed", "Sharpedge"};

                int fireLength = firePokemon.length;
                int waterLength = waterPokemon.length;
                int grassLength = grassPokemon.length;

                int randFire = (int)  (Math.random()*fireLength);
                int randWater = (int)  (Math.random()*waterLength);
                int randGrass = (int)  (Math.random()*grassLength);

                String phrase = firePokemon[randFire] + " " +  waterPokemon[randWater] + " " + grassPokemon[randGrass];
        System.out.println("The following Pokemon are your starters " + phrase);
        }

    }