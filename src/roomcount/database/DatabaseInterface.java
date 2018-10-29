package roomcount.database;

import java.sql.Time;

public class DatabaseInterface {
	public String getRoomName(){
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
