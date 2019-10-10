/**
 * Lab 8
 *
 * Test suite for the HandChoice enum.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class HandChoiceTest
{
    /**
     * Tests that the enum returns the expected HandChoice
     * as being weak against the PAPER type.
     */
    public void paperEffectiveAgainstTest() throws AssertException
    {
    	// TODO: implement.
    	HandChoice expected = HandChoice.ROCK;
    	HandChoice actual = HandChoice.PAPER.winsAgainst();
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that the enum returns the expected HandChoice
     * as being weak against the ROCK type.
     */
    public void rockEffectiveAgainstTest() throws AssertException
    {
    	// TODO: implement.
    	HandChoice expected = HandChoice.SCISSORS;
    	HandChoice actual = HandChoice.ROCK.winsAgainst();
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that the enum returns the expected HandChoice
     * as being weak against the SCISSORS type.
     */
    public void scissorsEffectiveAgainstTest() throws AssertException
    {
    	// TODO: implement.
    	HandChoice expected = HandChoice.PAPER;
    	HandChoice actual = HandChoice.SCISSORS.winsAgainst();
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that HandChoice.toString() returns the expected value.
     */
    public void handChoiceToStringTest() throws AssertException
    {
    	// TODO: implement.
    	Assert.assertEquals("rock", HandChoice.ROCK.toString());
    	Assert.assertEquals("paper", HandChoice.PAPER.toString());
    	Assert.assertEquals("scissors", HandChoice.SCISSORS.toString());
    }
}
