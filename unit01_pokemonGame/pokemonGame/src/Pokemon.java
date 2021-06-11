//Kishowth Moganasundaram
//Pokemon Game
//ICS4U1
//May 17, 2021

public class Pokemon 
{
  //attributes
  private String name;
  private int currHp;
  private int maxHp;
  private String type;
  private static Moves[] moves;

  /**
   * Creats pokemon object
   * @param name of pokemon
   * @param maxHp of pokemon
   * @param type 
   * @param moves (moveset)
   */
  public Pokemon(String name, int maxHp, String type, Moves[] moves)
  {
    this.name = name;
    this.maxHp = maxHp;
    this.currHp = maxHp;
    this.type = type;
    this.moves = moves;
  }

  //accessors
  /**
  *Gets the pokemon's name
  *@return name
  */
  public String getName()
  {
      return this.name;
  }
  /**
  *Gets the pokemon's max Hp
  *@return HP
  */
  public int getMaxHp()
  {
      return this.maxHp;
  }
  /**
  *Gets the pokemon's type
  *@return type
  */
  public String getType()
  {
      return this.type;
  }
  /**
  *Gets the pokemon's currentHp
  *@return currHp
  */
  public int getCurrHp()
  {
      return this.currHp;
  }
  /**
  *Gets the pokemon's moveset list
  *@return moveset 
  */
  public Moves[] getMoves()
  {
      return this.moves;
  }

  //mutators:
  /**
   * @param moveNum see if this move has PP
   * @return moveValid 
   */
  public boolean hasMove(int moveNum)
  {
      boolean moveValid;
      if ((moveNum > 0) && (moveNum < moves.length))
      {
          moveValid = true;
      }
      else
      {
          moveValid = false;
      }
      return moveValid;
  }
 
  /**
   * use a move in its moveset
   * @param moveNum
   * @param pokemon
   */
  public void useMove(int moveNum, Pokemon pokemon)
  {
      moves[moveNum].useMove(pokemon);
  }

  /**
   * When damage is inflicted on an enemy
   * @param value of dmg
   */
  public void damage(int val)
  {
      this.currHp = this.currHp - val;
  }

  /**  
   * Prints a pokemons moveset 
   */
  public void printMoves()
  {
      for (int i=0; i< moves.length; i++)
      {
          System.out.println(this.moves[i].getName()+" "+ this.moves[i].getCurrPP()+ "/"+ this.moves[i].getMaxPP());
      }
    
  }



   













    
}
