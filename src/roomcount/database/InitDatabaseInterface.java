package roomcount.database;

public class InitDatabaseInterface {
	
	
    private MongoDatabase _db = getConnection().getDatabase(database_name);
    private MongoCollection _col = db.getCollection(database_collection);
	
	//Session Fields
	private String _sessionName;
	private int _sessionNumber;
	private String _speaker;
	private int _roomCount1;
	private int _roomCount2;
	private int _roomCount3;
	
	//Room Fields
	private String _roomName;
	private int _capacity;
	
	//Timeslot Fields
	private Date _date;
	private String _startTime;
	private String _endTime;
	
	public void initInterface() {
		
		
		
		
		
	}
	
    private static MongoClient getConnection() {
        int port_num = 8080;
        String url = "localhost";
        
        MongoClient mongoClntObj = new MongoClient(url, port_num);
        return mongoClntObj;
    }
	
	public boolean pushSessionDocument() {
		
		
		
		
		
        List<BasicDBObject> sessionDoc = new ArrayList<BasicDBObject>();
        sesh.add(new BasicDBObject("sessionName", _sessionName));
        sesh.add(new BasicDBObject("sessionID", _sessionNumber));
        sesh.add(new BasicDBObject("speakerName", _speaker));
        sesh.add(new BasicDBObject("speakerName", _roomCount1));
        sesh.add(new BasicDBObject("speakerName", _roomCount2));
        sesh.add(new BasicDBObject("speakerName", _roomCount3));	
		return false;
	}
	
	public boolean pushRoomDocument() {
		
		
		List<BasicDBObject> roomDoc = new ArrayList<BasicDBObject>();
		roomDoc.add(new BasicDBObject("_roomName", roomName));
		roomDoc.add(new BasicDBObject("_capacity", roomCapacity));
		return false;
	}
	
	public boolean pushTimeslotDocument() {
		
		
		List<BasicDBObject> timeSlotDoc = new ArrayList<BasicDBObject>();
		timeSlotDoc.add(new BasicDBObject("_date", startTime));
		timeSlotDoc.add(new BasicDBObject("_startTime", endTime));
		timeSlotDoc.add(new BasicDBObject("_endTime", date));
        
		return false;
	}
	
	
	private boolean isNewSession() {
        FindIterable<Document> cursor = col.find(whereQuery);
        for(Document doc : cursor){
            //Session has already been created
            newSession = false;
        }
	}

}
