// Class to represent a Decimal number
public class Decimal implements Numeric {
  // int to hold value of Decimal
  private int value;
  // Takes in a number and ties to class --> KENNY HAS DIBS
  public Decimal(int value) {
    this.value = value;
  }
  // Gets value of Decimal as an integer --> PAUL HAS DIBS
  @Override
  public int getValue() {
    return value;
  }
  // Converts Decimal to BitString --> JAHKELL HAS DIBS
  public BitString toBitString() {
        String string = "";                           //declares a String to pass to BitString constructor 
        if (value == 0) {
            string = string + 0;                      //the BitString is simply "0" if the decimal value is 0                 
        }
        while (value > 0) {                           
            string = value % 2 + string;              //calculates the BitString value of a Decimal number...
            value = value / 2;                        //in String form
        }
        BitString bitstring = new BitString(string);  //passes String to BitString constructor
        return bitstring;                             //return bitstring of converted decimal
  }
  // Returns String representation of object --> CARLOS HAS DIBS
  @Override
  public String toString() {
    return null;
  }
}
