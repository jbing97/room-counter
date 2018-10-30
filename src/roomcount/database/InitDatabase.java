package roomcount.database;
import com.mongodb.*;

public class InitDatabase {
	private int nextSessionNumber = 0;
	private int nextRoomNumber = 0;
	private Mongo mg;
	private DB db;

	public InitDatabase(String url, int port , String dbName){
		mg = new Mongo(url , port);
		db = mongo.getDB(dbName);
	}

	private boolean initSessionName(BasicDBObject det , String name) {
		det.put("sessionName" , name);
		return false;
	}

	private boolean initSessionNumber(BasicDBObject det) {
		det.put("sessionId" , nextSessionNumber);
		nextSessionNumber++;
		return false;
	}

	public boolean initTimeSlot() {
		return false;
	}

	private boolean initRoomCapacity(BasicDBObject det , int cap) {
		det.put("roomCapacity" , cap);
		return true;
	}

	private boolean initRoomName(BasicDBObject det , String name) {
		det.put("roomName" , name);
		return true;
	}

	private boolean initRoomId(BasicDBObject det){
		det.put("roomId" , nextRoomNumber);
		nextRoomNumber++;
		return true;
	}

	public boolean initRoom(String name , int capacity){
		//Don't know whether to make next line Class variable or specific to table.
		DBCollection coll = db.getCollection("room");
		BasicDBObject doc = new BasicDBObject();
		doc.put("database" , db.getName());
		doc.put("table" , "room");
		BasicDBObject docDetails = new BasicDBObject();
		initRoomId(docDetails);
		initRoomCapacity(docDetails , capacity);
		initRoomName(docDetails , name);

		coll.insert(doc);
	}

	public boolean initSession(String name , int roomId , int timeSlotId) {
		//Don't know whether to make next line Class variable or specific to table.
		DBCollection coll = db.getCollection("session");
		BasicDBObject doc = new BasicDBObject();
		doc.put("database" , db.getName());
		doc.put("table" , "session");
		BasicDBObject docDetails = new BasicDBObject();
		initSessionNumber(docDetails);
		initSessionName(docDetails, name);

		//put roomId
		//put timeSlotId

		coll.insert(doc);
		return true;
	}
}
