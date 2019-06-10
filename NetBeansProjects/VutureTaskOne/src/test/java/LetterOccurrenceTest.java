
import com.jamesidowu.vuturetaskone.LetterOccurrence;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesidowu
 */
public class LetterOccurrenceTest {
    
    @Ignore
    @Test
    public void countOccurrenceTest(){
        LetterOccurrence letOcc = new LetterOccurrence('a', "I have some cheese");
        assertEquals(1, letOcc.countOccurrence());
    }
    
}
