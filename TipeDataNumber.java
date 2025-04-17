public class TipeDataNumber {

  public static void main(String[] args) {

    byte iniByte = 100; //min -128 max 127, 1 byte
    short iniShort = 1000; //min -32.768 max 32.767, 2 byte
    int iniInt = 10000000; //min -2.147.483.648 max 2.147.483.647, 4 byte
    long iniLong = 1000000000; //min -9.223.372.036.854.775.808 max 9, 8 byte
    long iniLong2 = 1000000000L; //min -9.223.372.036.854.775.808 max 9.

    float iniFloat = 10.10F; //min -3.402.823.486.471.7E+38 max 3
    double iniDouble = 10.10; //min -1.797.693.134.862.315.7E+308 max

    int decimalInt = 34; //ini 34
    int hexaDecimal = 0xFFFFFF; //ini 16777215
    int binaryDecimal = 0b10101010; //ini 170

    int amount = 1_000_000_000; //ini 1.000.000.000

  }

}
