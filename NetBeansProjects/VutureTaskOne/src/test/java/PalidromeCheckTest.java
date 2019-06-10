
import com.jamesidowu.vuturetaskone.PalidromeCheck;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesidowu
 */
public class PalidromeCheckTest {
    @Ignore
    @Test
    public void palidromeCheckTest(){
        PalidromeCheck palCheck = new PalidromeCheck("God saved Eva's dog");
        assertEquals(true, palCheck.check());
        
        PalidromeCheck palCheckTwo = new PalidromeCheck("I have some cheese");
        assertEquals(false, palCheckTwo.check());
        

    }
}
