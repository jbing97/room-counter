package roomcount.database;

import java.sql.*;
import java.util.Date;

public class DatabaseInterface {
    
    /*
     * Set up the connection
     * This block of code taken from a different project I worked on:
     * https://github.com/Wentworth-IEEE/invdb/blob/master/src/invdb/
     */
    // TODO- fill in these blanks based off of whatever the database people do
    public static String jdbcDriver="";
    public static String dbURL="";
    public static String user="";
    public static String pass="";
    public static Connection conn=null;

    private boolean isDatabaseInitialized = false;

    private boolean isInitialized() {
        if(!isDatabaseInitialized) {
            System.err.println("Database hasn't been initialized!");
            return false;
        }
        return true;
    }

	public String getRoomName(){
        if(!isInitialized()) { return null; }

        ResultSet rs;
        try {
            Statement st = conn.createStatement(); // TODO- make this not blank
            rs = st.executeQuery(""); // TODO- generate appropriate query

        } catch (SQLException se) {
            se.printStackTrace();
        }

		return "";
	}

	public int getRoomCapacity() {
		return 0;
	}

	public Time getTimeSlot() {
		return null;
	}

	public String getSessionName() {
		return "";
	}

	public int getSessionNumber() {
		return 0;
	}

	public String getSpeakerName() {
		return "";
	}

	public boolean setRoomName() {
		return false;
	}

	public boolean setRoomCapacity() {
		return false;
	}

	public boolean setTimeSlot() {
		return false;
	}

	public boolean setSessionName() {
		return false;
	}

	public boolean setSessionNumber() {
		return false;
	}

	public boolean setSpeakerName() {
		return false;
	}
}
