package hotels;

public class SingleRoom extends Room {
	
	public SingleRoom(int id){
		this.id=id;
		this.rt = RoomType.SINGLEROOM;
		this.price = 45.0;
		this.leaser = new Person[1];
	}

}
