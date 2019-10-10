/**
 * Lab 8
 *
 * Test suite for the Contestant enum.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class ContestantTest
{
    /**
     * Tests that George's region is the expected value.
     */
    public void contestantGeorgeGetRegionTest() throws AssertException
    {
    	// TODO: implement.
    	Region expected = Region.NORTH;
    	Region actual = Contestant.GEORGE.getRegion();
    	
    	Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests that Jill's region is the expected value.
     */
    public void contestantJillGetRegionTest() throws AssertException
    {
    	// TODO: implement.
    	Region expected = Region.SOUTH;
    	Region actual = Contestant.JILL.getRegion();
    	
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that Matthew's region is the expected value.
     */
    public void contestantMatthewGetRegionTest() throws AssertException
    {
    	// TODO: implement.
    	Region expected = Region.EAST;
    	Region actual = Contestant.MATTHEW.getRegion();
    	
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that Betty's region is the expected value.
     */
    public void contestantBettyGetRegionTest() throws AssertException
    {
    	// TODO: implement.
    	Region expected = Region.WEST;
    	Region actual = Contestant.BETTY.getRegion();
    	
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that George's hand choice is the expected value.
     */
    public void contestantGeorgeGetChoiceTest() throws AssertException
    {
    	// TODO: implement.
    	HandChoice expected = HandChoice.ROCK;
    	HandChoice actual = Contestant.GEORGE.getChoice();
    	
    	Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests that Jill's hand choice is the expected value.
     */

    public void contestantJillGetChoiceTest() throws AssertException
    { 
    	// TODO: implement.
    	HandChoice expected = HandChoice.ROCK;
    	HandChoice actual = Contestant.JILL.getChoice();
    	
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that Matthew's hand choice is the expected value.
     */
    public void contestantMatthewGetChoiceTest() throws AssertException
    {
    	// TODO: implement.
    	HandChoice expected = HandChoice.SCISSORS;
    	HandChoice actual = Contestant.MATTHEW.getChoice();
    	
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that Betty's hand choice is the expected value.
     */
    public void contestantBettyGetChoiceTest() throws AssertException
    {
    	// TODO: implement.
    	HandChoice expected = HandChoice.PAPER;
    	HandChoice actual = Contestant.BETTY.getChoice();
    	
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests that Supercontestant.toString() returns the expected value for each contestant.
     */
    public void contestantToStringTest() throws AssertException
    {
    	// TODO: implement.
    	String expected1 = "george: contestant from north throwing rock";
    	String actual1 = Contestant.GEORGE.toString();
    	Assert.assertEquals(expected1, actual1);
    	
    	String expected2 = "jill: contestant from south throwing rock";
    	String actual2 = Contestant.JILL.toString();
    	Assert.assertEquals(expected2, actual2);
    	
    	String expected3 = "matthew: contestant from east throwing scissors";
    	String actual3 = Contestant.MATTHEW.toString();
    	Assert.assertEquals(expected3, actual3);
    	
    	String expected4 = "betty: contestant from west throwing paper";
    	String actual4 = Contestant.BETTY.toString();
    	Assert.assertEquals(expected4, actual4);
    }
}
