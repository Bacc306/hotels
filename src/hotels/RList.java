package hotels;

public class RList {
	RoomNode head;
	
	public RList(){
		head=null;
	}
	
	public void addRoom(Room r){
		RoomNode nRN = new RoomNode(r);
		if (head==null) {head = nRN;} 
		else {
			RoomNode tmp = head;
			while (tmp.next!=null){
				tmp=tmp.next;
			}
			tmp.next=nRN;
		}
	}
	
	public Room getFreeRoom(RoomType type){
		RoomNode tmp = head;
		while (tmp != null && tmp.value.rt!=type && tmp.value.booked){
			tmp = tmp.next;
		}
		if(tmp.value.rt!=type || tmp.value.booked){System.out.println("No room of type "+type.toString());tmp=null;}
		if (tmp==null) return null;
		return tmp.value;
	}
	
	public int getNewID(){
		int cnt = 0;
		RoomNode tmp = head;
		while (tmp!=null){
			tmp=tmp.next;
			cnt++;
		}
		return ++cnt;
	}
	
	public Room getRoom(int id){
		RoomNode tmp = head;
		while (tmp != null && tmp.value.id!=id){
			tmp=tmp.next;
		}
		if (tmp==null) return null;
		return tmp.value;
	}
	
	public void printRoomList(){
		RoomNode tmp = head;
		while(tmp!=null){
			System.out.println(tmp.value.toString());
			tmp=tmp.next;
		}
	}

}
