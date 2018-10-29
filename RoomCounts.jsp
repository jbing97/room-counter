db.createCollection( "test2", {
   validator: { $jsonSchema: {
      bsonType: "object",
      required: [ "status" ],
      properties: {
         RoomID: {
            bsonType: "number",
            description: "must be a number and is required"
         },
         roomName: {
            bsonType : "string",
            description: "must be a string"
         },
         roomCap: {
            bsonType: "number",
            description: "must be a number"
         }
      }
   } }
} )
db.createCollection( "test2", {
   validator: { $jsonSchema: {
      bsonType: "object",
      required: [ "status" ],
      properties: {
         sessionID: {
            bsonType: "number",
            description: "must be a number and is required"
         },
         roomCount1: {
            bsonType : "number",
            description: "must be a string"
         },
         roomCount2: {
            bsonType: "number",
            description: "must be a number"
         }
		 roomCount3: {
            bsonType: "number",
            description: "must be a number"
         }
		 Speaker: {
            bsonType: "string",
            description: "must be a string"
         }
		 timeOfCount1: {
            bsonType: "number",
            description: "must be a number"
         }
		 timeOfCount2: {
            bsonType: "number",
            description: "must be a number"
         }
		 timeOfCount3: {
            bsonType: "number",
            description: "must be a number"
         }
      }
   } }
} )