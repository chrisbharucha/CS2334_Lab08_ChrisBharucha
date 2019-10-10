/**
 * Lab 8
 *
 * Test suite for the Region enum.
 * 
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class RegionTest
{    
    /**
     * Tests that Region.toString() returns the expected value for each region.
     */
    public void regionToStringTest() throws AssertException
    {
    	// TODO: implement.
    	String expected1 = "north";
    	String actual1 = Region.NORTH.toString();
    	
    	Assert.assertEquals(expected1, actual1);
    	
    	String expected2 = "south";
    	String actual2 = Region.SOUTH.toString();
    	
    	Assert.assertEquals(expected2, actual2);
    	
    	String expected3 = "east";
    	String actual3 = Region.EAST.toString();
    	
    	Assert.assertEquals(expected3, actual3);
    	
    	String expected4 = "west";
    	String actual4 = Region.WEST.toString();
    	
    	Assert.assertEquals(expected4, actual4);
    }
}
