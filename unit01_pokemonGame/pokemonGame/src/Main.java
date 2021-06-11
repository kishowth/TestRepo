//Kishowth Moganasundaram
//Pokemon Game
//ICS4U1
//May 17, 2021
//Havi 
//I changed this.
public class Main {
    public static void main(String[] args) {
        // two move list tiers
        Moves[] listA = { new Moves("Wing Attack", 35, 35, "Flying"), new Moves("Quick Attack", 30, 40, "Normal"),
                new Moves("Bite", 25, 60, "Dark"), new Moves("Mean Look", 5, 0, "Normal") };

        Moves[] listB = { new Moves("Astonish", 15, 30, "Ghost"), new Moves("Quick Attack", 30, 40, "Normal"),
                new Moves("Bite", 25, 60, "Dark"), new Moves("Ice Beam", 20, 30, "Ice") };

        // 2 pokemon objects
        // Pokemon poke = new Pokemon(name, maxHp, type, moves)
        Pokemon redPokemon = new Pokemon("Murkrow", 130, "Flying", listA);
        Pokemon bluePokemon = new Pokemon("Gengar", 130, "Ghost", listB);

        // test run for MOVES class
        // Prints pokemon stats
        // System.out.println("RED:");
        // System.out.println("POKE NAME:" +redPokemon.getName());
        // System.out.println("HP: " +redPokemon.getCurrHp());
        // System.out.println("Type: "+redPokemon.getType());

        // //prints the pokemons moveset along with the PP
        // for (int i=0; i<listA.length;i++)
        // {
        // System.out.print(listA[i].getName()+ " ");
        // System.out.println(listA[i].getCurrPP()+ "/"+ listA[i].getMaxPP());
        // }

        // uses red's pokemon's move, subtracts the PP from
        // listA[0].useMove(redPokemon);

        // restores the PP of the move
        // listA[0].restorePoints();

        // POKEMON BATTLE
        System.out.println("INITIAL RED HP:" + redPokemon.getCurrHp());
        redPokemon.printMoves();
        System.out.println("----- \n");
        System.out.println("INITIAL BLUE HP:" + bluePokemon.getCurrHp());
        bluePokemon.printMoves();

        // battle sequence(red attacks)
        // redPokemon.useMove(2, bluePokemon);
        // bluePokemon.damage(listA[2].getPower());
        // System.out.println("Current blue pokemon HP: "+bluePokemon.getCurrHp());
        // redPokemon.printMoves();

        // battle sequence(blue attacks)
        // bluePokemon.useMove(1, redPokemon);
        // bluePokemon.printMoves();
        // redPokemon.damage(listB[1].getPower());
        // System.out.println("Current Red pokemon HP: "+redPokemon.getCurrHp());

    }

}
