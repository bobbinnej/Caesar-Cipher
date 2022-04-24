package model;

public class Decode {
    private int sKey;
    private String sMessage;

    // instanciate code
    public Decode(int shiftKey,String message){
        sKey=shiftKey;
        sMessage=message;

    }
    // use get method to check if our message has been saved
    public String getMessage(){
        return sMessage;
    }

    // use get method to check if pur shift key has been save
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

    // lets code the logic for decryption
    public String decrypt(){
        String plainText="";
        String plainTextArray[]=sMessage.split("");
        String alpha="ABCDEFGHIKLMNOPQRSTUVWXYZ";

          for(int i=0; i< plainTextArray.length; i++){
              if (sMessage.charAt(i)==' '){
                  plainText+=" ";
              }else {
                  int charPosition=alpha.indexOf(sMessage.charAt(i));
                  int shiftValue=(charPosition-sKey)%26;

                  if(shiftValue<0){
                      shiftValue=alpha.length()+shiftValue;
                  }
                  char replaceValue=alpha.charAt(shiftValue);
                  plainText+=replaceValue;
              }
          }
        return plainText;
    }

}
