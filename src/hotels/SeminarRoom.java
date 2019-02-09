package hotels;

public class SeminarRoom extends Room{
	
	public SeminarRoom(int id){
		this.id=id;
		rt=RoomType.SEMINARROOM;
		price=680.0;
		//save only one entity
		this.leaser = new Person[1];
	}

}
