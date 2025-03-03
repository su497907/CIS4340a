class GameWeapon implements Serializable {
  private static final long serialVersionUID = 24L;
 
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
