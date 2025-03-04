public class movieTicket {
    String customerName; 
    int numTickets;

    movieTicket(String customerName, int numTickets) {
        this.customerName = customerName;
        this.numTickets = numTickets;
    }

    void showbooking() {
        System.out.printf("Customer Name: %s\nNumber of tickets: %d", customerName, numTickets);
    }

    public static void main(String[] args){
        movieTicket obj = new movieTicket("John", 5);
        obj.showbooking();
    }
}
