package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    Decode testDecode= new Decode(2, "HELLO");
    @Test
    public void checkIfCreatesInstanceCorrectly(){
        assertEquals(true, testDecode instanceof Decode);

    }
    @Test
    public void checkIfMessageIsSaved(){
        assertEquals("HELLO", testDecode.getMessage());
    }
    @Test
    public void checkIfShiftKeyIsSaved(){
        assertEquals(2, testDecode.getKey());
    }
    @Test
    public void doesNotAcceptNegativeShiftKey(){
        Encode testEncode = new Encode("HELLO", 2);
        assertEquals("FCIIM", testDecode.decrypt());
    }
    @Test
    public void checkIfIsValidKey(){
        assertEquals(true, testDecode.sValidKey());
    }

    @Test
    public void checkIfIsNotEmpty(){
        assertEquals(true, testDecode.isNotEmpty());
    }

    @Test
    public void checkIfIsValidMessage(){
        assertEquals(true, testDecode.sValidMessage());
    }

}