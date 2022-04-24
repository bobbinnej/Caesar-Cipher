package model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    Encode testEncode=new Encode("HELLO",3);
    @Test
   public void assertIfItCreatesNewInstance(){
        assertEquals(true,testEncode instanceof Encode);
    }

    @Test
    public void checkIfMessageIsSaved(){
        assertEquals("HELLO", testEncode.getMessage() );
    }
    @Test
    public void checkIfShiftKeyIsSaved(){
        assertEquals(3, testEncode.getKey());
    }
    @Test
    public void checkIfValidMessage(){
        assertEquals(true, testEncode.sValidMessage());
    }

    @Test
    public void checkIfKeyIsValid(){
        assertEquals(true, testEncode.sValidKey());
    }
    @Test
    public void checkIfIsNotEmpty(){
        assertEquals(true, testEncode.isNotEmpty());
    }
    @Test
    public void doesNotreturnLowerCaseOutput(){
        Encode testEncode= new Encode("a",7);
        assertEquals("G", testEncode.encrypt());
    }
    @Test
    public void doesNotAcceptNegativeShiftKey(){
        Encode testEncode= new Encode("a",7);
        assertEquals("G", testEncode.encrypt() );

    }

}