JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java 

CLASSES = \
		  roomcount.checking.Accuracy.java \
		  roomcount.checking.RoomCounterError.java \
		  roomcount.checking.Validation.java \
		  roomcount.database.DatabaseInterface.java \
		  roomcount.database.InitDatabase.java \
		  roomcount.userinterface.ReportInterface.java \
		  roomcount.userinterface.UserInterface.java

default: classes

classes: $(CLASSES:.java=.class)

clean: rf -f  *.class
