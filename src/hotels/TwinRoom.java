package hotels;

public class TwinRoom extends Room {
	
	public TwinRoom(int id){
		this.id=id;
		rt=RoomType.TWINROOM;
		price=40.5;
		this.leaser = new Person[2];
	}

}
