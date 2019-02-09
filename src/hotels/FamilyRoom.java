package hotels;

public class FamilyRoom extends Room {
	public FamilyRoom(int id){
		this.id=id;
		this.rt = RoomType.FAMILYROOM;
		this.price = 39.99;
		this.leaser = new Person[4];
	}
}
