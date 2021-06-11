//Kishowth Moganasundaram
//Pokemon Game
//ICS4U1
//May 17, 2021

public class Moves 
{
    //Attributes
    private String name;
    private int currPP;
    private int maxPP;
    private int power;
    private String type;

  /**
  * Creates a pokemon move
  * @param name of move
  * @param current PP of move
  * @param power of move
  * @param type of move
  */
  public Moves(String name, int maxPP, int power, String type)
  {
    this.name = name;
    this.maxPP = maxPP;
    this.currPP = maxPP;
    this.power = power;
    this.type = type;
  }

  /*
  accessors 
  */

  /**
  *Gets the move name
  *@return move name
  */
  public String getName()
  {
    return this.name;
  }

  /**
  *Gets the move's current PP
  *@return current PP
  */
  public int getCurrPP()
  {
    return this.currPP;
  }
  /**
  *Gets the move's max PP
  *@return Max PP
  */
  public int getMaxPP()
  {
    return this.maxPP;
  }

  /**
  *Gets the move's atk power
  *@return move's power
  */
  public int getPower()
  {
    return this.power;
  }

  /**
  *Gets the move type
  *@return move type
  */
  public String getType()
  {
    return this.type;
  }

  //Mutators
  /**
   * Use a move
   * @param pokemon
   */
  public void useMove(Pokemon pokemon)
  { 
      this.currPP = this.currPP - 1;

      if (this.type == "Dark" && pokemon.getType() == "Ghost")
      {
          this.power = this.power * 2;
      }
      else if (this.type == "Ice" && pokemon.getType() == "Flying")
      {
          this.power = this.power * 2;
      }

  }

  /**
   * Restores PP values of a move
   */
  public void restorePoints()
  {
      this.currPP = this.maxPP;
  }




 











 








    
}
