
import com.jamesidowu.vuturetaskone.CensoredWordList;
import com.jamesidowu.vuturetaskone.LetterOccurrence;
import com.jamesidowu.vuturetaskone.PalidromeCensor;
import com.jamesidowu.vuturetaskone.PalidromeCheck;
import static com.jamesidowu.vuturetaskone.PrintNumOfOccurrence.printCensoredNumOccurrences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
public class Task3Tests {
    
     @Test
    public void Task3a(){
        
        ArrayList<String> wordArray = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        wordArray.add("dog");
        wordArray.add("cat");
        wordArray.add("large");
        String text = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
        map.put("large", 1);
        map.put("dog", 2);
        map.put("cat", 1);
        
        CensoredWordList taskThree = new CensoredWordList(wordArray, text);
        assertEquals(map, 
                taskThree.countOccurrences());
    }
    
   
     @Test
    public void Task3b(){
       ArrayList<String> wordArray = new ArrayList<>();
        wordArray.add("meow");
        wordArray.add("woof");
       String text = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
       CensoredWordList taskThree = new CensoredWordList(wordArray, text);
       
        assertEquals("I have a cat named M$$w and a dog name W$$f. I love the dog a lot. He is larger than a small horse.", taskThree.censorString());
    }
    
    @Ignore
    @Test
    public void Task3c(){
        PalidromeCensor palCheck = new PalidromeCensor("Anna went to vote in the election to fulfil her civic duty");
        
        
 
       
        assertEquals ("A$$a went to vote in the election to fulfil her c$$$c duty", palCheck.censorString());
    }
    
}
