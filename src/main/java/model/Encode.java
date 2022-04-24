package model;

public class Encode {
  private int sKey;
  private String sMessage;

  // Lets instantiate our code
    public Encode(String message, int shiftKey){
        sKey=shiftKey;
        sMessage=message;
    }
    // Create a get method to check if our message is saved
    public String getMessage(){
        return sMessage;
    }

    // Create a get method to check if shifKey was saved
    public int getKey(){
        return sKey;
    }

    public boolean sValidMessage(){
        char [] chars = sMessage.toCharArray();

        for (char c:chars){
            if(Character.isLetter(c) && c !=' '){
                return true;
            }

        }
        return false;
    }
    public boolean sValidKey(){
        return sKey>1 && sKey<26;
    }

    public boolean isNotEmpty() {
        return !sMessage.trim().isEmpty();
    }

    // How to get encrypted message from plainText
    public String encrypt(){
        String cipherText="";
        String ciphertextArray[]=sMessage.split("");
        String alpha="ABCDEFGHIJKLMONOQRTUVWXYZ";

         for(int i=0; i< ciphertextArray.length; i++){
             if(sMessage.charAt(i)== ' '){
                 cipherText +="";
             }else {
                 int charPosition=alpha.indexOf(sMessage.charAt(i));
                 int shiftKey=(sKey+charPosition)%26;
                 cipherText +=alpha.charAt(shiftKey);

             }

         }
         return cipherText.toUpperCase();
    }


}
