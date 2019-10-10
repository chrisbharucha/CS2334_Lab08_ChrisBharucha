import java.util.*;
/**
 * Lab 
 *
 * Test suite for the RPSArena class.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class RPSArenaTest {

    /**
     * The RPSArena instance to test.
     */
    private static RPSArena arena;

    /**
     * Creates a RPSArena instance for testing.
     */
    public static void initialize() throws AssertException
    {
    	// TODO: implement.
    	arena = new RPSArena();
    }
    
    /**
     * Tests the constructor and the contestant lists
     */
    public void testContestantList() throws AssertException {
    	// TODO: implement.
    	Contestant expected = Contestant.GEORGE;
    	Contestant actual = arena.getContestant("GEO");
    	Assert.assertEquals(expected, actual);
    }

    /**
     * Tests getting the abbreviations.
     */
    public void testContestantAbbreviations() throws AssertException {
    	// TODO: implement.
    	String expected = "[GEO, JIL, MAT, BET]";
    	Assert.assertEquals(expected, arena.getContestantAbbreivations().toString());
    }
    
    /**
     * Tests getting the contestants that exist in the map.
     */
    public void testGetContestantExists() throws AssertException {
    	// TODO: implement.
    	Contestant expected1 = Contestant.GEORGE;
    	Contestant actual1 = arena.getContestant("GEO");
    	Assert.assertEquals(expected1, actual1);
    	
    	Contestant expected2 = Contestant.JILL;
    	Contestant actual2 = arena.getContestant("JIL");
    	Assert.assertEquals(expected2, actual2);
    	
    	Contestant expected3 = Contestant.MATTHEW;
    	Contestant actual3 = arena.getContestant("MAT");
    	Assert.assertEquals(expected3, actual3);
    	
    	Contestant expected4 = Contestant.BETTY;
    	Contestant actual4 = arena.getContestant("BET");
    	Assert.assertEquals(expected4, actual4);
    }
    
    /**
     * Tests getting a contestant that does not exist in the map.
     * Note: there is an assertNull method within Assert.java you can use
     */
    public void testGetContestantDoesNotExist() throws AssertException {
    	// TODO: implement.
    	Assert.assertNull(arena.getContestant("YEE"));
    }
    
    /**
     * Tests a contestant battle ending in a tie.
     * Note: there is an assertNull method within Assert.java you can use
     */
    public void testContestantBattleTie() throws AssertException {
    	// TODO: implement.
    	Assert.assertNull(arena.battleContestants(Contestant.GEORGE, Contestant.JILL));
    }
    
    /**
     * Tests a contestant battle ending in George winning.
     */
    public void testContestantBattleGeorgeWins() throws AssertException {
    	// TODO: implement.
    	Assert.assertEquals(Contestant.GEORGE, 
    			arena.battleContestants(Contestant.GEORGE, Contestant.MATTHEW));
    }
    
    /**
     * Tests a contestant battle ending in Betty winning.
     */
    public void testContestantBattleBettyWins() throws AssertException {
    	// TODO: implement.
    	Assert.assertEquals(Contestant.BETTY, 
    			arena.battleContestants(Contestant.BETTY, Contestant.JILL));
    }
}
