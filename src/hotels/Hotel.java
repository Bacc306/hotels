package hotels;

public class Hotel {
	static RList roomlist;

	public Hotel() {

	}

	public static void main(String[] args) {
		roomlist = new RList();
		char c = '0';
		p("Welcome to the Sample Hotel Management System");
		while (c != 'x') {
			p("Please choose an operation: n new room, b book room, c clear room, l list all rooms, x exit:");
			c = Input.readChar();
			switch (c) {
			case 'n':
				newRoom();
				break;
			case 'b':
				bookRoom();
				break;
			case 'c':
				clearRoom();
				break;
			case 'l':
				roomlist.printRoomList();
				break;
			default: // noop
			}
		}

	}

	private static void clearRoom() {
		p("Please enter room id:");
		int id = Input.readInt();
		Room r = roomlist.getRoom(id);
		if (r == null) {
			p("Invalid id");
			return;
		}
		r.clearRoom();
	}

	private static void bookRoom() {
		p("Book room");
		p("Please choose RoomType a Single, b Twin, c Suite, d Seminar, e Family:");
		char c = Input.readChar();
		Room r = null;
		switch (c) {
		case 'a':
			r = roomlist.getFreeRoom(RoomType.SINGLEROOM);
			break;
		case 'b':
			r = roomlist.getFreeRoom(RoomType.TWINROOM);
			break;
		case 'c':
			r = roomlist.getFreeRoom(RoomType.SUITE);
			break;
		case 'd':
			r = roomlist.getFreeRoom(RoomType.SEMINARROOM);
			break;
		case 'e':
			r = roomlist.getFreeRoom(RoomType.FAMILYROOM);
			break;
		default:
			p("Invalid choice");
		}
		if (r == null)
			return;
		bookPersons(r);

	}

	private static void newRoom() {
		p("Create new room");
		p("Please choose RoomType a Single, b Twin, c Suite, d Seminar, e Family:");
		char c = Input.readChar();
		Room r = null;
		switch (c) {
		case 'a':
			r = new SingleRoom(roomlist.getNewID());
			break;
		case 'b':
			r = new TwinRoom(roomlist.getNewID());
			break;
		case 'c':
			r = new Suite(roomlist.getNewID());
			break;
		case 'd':
			r = new SeminarRoom(roomlist.getNewID());
			break;
		case 'e':
			r = new FamilyRoom(roomlist.getNewID());
			break;
		default:
			p("Invalid choice");
		}
		if (r != null) {
			roomlist.addRoom(r);
			p("Done!");
		}
	}

	private static void p(String s) {
		System.out.println(s);
	}
	
	private static void bookPersons(Room r) {
		//TODO: Implement method
	}
	

}
