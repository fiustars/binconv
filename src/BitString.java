
public class BitString {
  // Array of bits
  private int[] bits;
  // Takes in a bitstring and ties data to class --> X HAS DIBS
  public BitString(String bitstring) {
   bits = new int[bitstring.length()];
   for(int a =0; a < bitstring.length(); a++){
       bits[a] = bitstring.charAt(a) - 48;
   }   
  }
  // Returns BitString as an array --> JONATHAN HAS DIBS
  public int[] getBitString() {
    return null;
  }
  // Returns BitString as a Decimal --> GISELLE HAS DIBS
  public Decimal toDecimal() {
    return null;
  }
  // Returns BitString as a String --> HERNAN HAS DIBS
  @Override
  public String toString() {
    return null;
  }
}
