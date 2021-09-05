import passenger.passenger;
import ticket.ticket;

public class App {
    public static void main(String[] args) {
        passenger hanhkhach = new passenger();
        ticket ticket = new ticket();
        hanhkhach.inputInfor();
        hanhkhach.printInfor();
        System.out.println("Giá vé là: "+ticket.ticketPrice(hanhkhach.getTuoi())+"$");
    }
}
