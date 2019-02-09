package hotels;
 
public class Suite extends Room {
	
	public Suite(int id){
		this.id=id;
		rt=RoomType.SUITE;
		price=233.3;
		this.leaser = new Person[5];
	}

}
