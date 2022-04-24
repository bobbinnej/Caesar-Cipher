package model;

public class Encode {
  private int sKey;
  private String sMessage;

  // Lets instantiate our code
    public Encode(String message, int shiftKey){
        sKey=shiftKey;
        sMessage=message;
    }

}
