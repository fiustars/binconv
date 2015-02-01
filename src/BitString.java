public class BitString implements Numeric{
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
    return bits;
  }
  // Returns BitString as a Decimal --> GISELLE HAS DIBS
  public Decimal toDecimal() 
  {
    int dec = 0;
    int count = 1;
    int len  = bits.length;
    for(int i = len - 1; i < 0; i--)
    {
        if(bits[i] == 1)
          dec += Math.pow(2,count);
        count++;
    }
      
    Decimal d = new Decimal(dec);
    return d;
  }
  
  @Override
  public int getValue() {
    
  }
  
  // Returns BitString as a String --> HERNAN HAS DIBS
  @Override
  public String toString() {
    String str = "";
      for(int i = 0; i < bits.length;i++)
      {
         System.out.print(bits[i]);       //Shows result (for testing)
         str = str + bits[i];             //Add the bits one by one on the string
      }
      String s = new String(str);         //Returns the string
    return s;
  }
}
