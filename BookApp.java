mport java.util.Scanner;

class BookApp {

    private String name;
    private String id;
    private String address;
    private int room;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BookNow( String name, String id,String address, int room, String date ) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.room = room;
        this.date = date;
    }

    public void updateRecord( int room, String date ) {
        this.room = room;
        this.date = date;
    }

    public void deleteRecord() {
        this.name = null;
        this.id = null;
        this.address = address;
        this.room = 0;
        this.date = null;
    }

}

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BookApp[] bookArr = new BookApp[50];

        int numOfBook = s.nextInt();
        s.nextLine();
        String name;
        String id;
        String address;
        int room;
        String date;

        for (int i = 0; i < numOfBook; i++) {

            name = s.nextLine();
            id = s.nextLine();
            address = s.next();
            room = s.nextInt();
            s.nextLine();
            date = s.nextLine();

            bookArr[i] = new BookApp(name, id,address, room, date);
        }
    }
}
