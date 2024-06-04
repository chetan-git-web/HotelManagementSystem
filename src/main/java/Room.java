import java.time.LocalDateTime;

public class Room {
    enum RoomType{
        Gold,
        Silver,
        Bronze
    }
    public final int GoldRoom = 5000;
    public final int SilverRoom = 2000;
    public final int BronzeRoom = 1000;
    public RoomType roomType;
    public int price;
    public LocalDateTime checkinTime= LocalDateTime.now();
    public LocalDateTime checkoutTime=LocalDateTime.now();
    public Services service;


    Room(int roomType,LocalDateTime checkinTime,LocalDateTime checkoutTime,Services service){
        switch (roomType){
            case 1:
                this.roomType = RoomType.Gold;
                price=GoldRoom;
                break;
            case 2:
                this.roomType = RoomType.Silver;
                price=SilverRoom;
                break;
            case 3:
                this.roomType = RoomType.Bronze;
                price=BronzeRoom;
                break;
        }


        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.service = service;
    }


}
