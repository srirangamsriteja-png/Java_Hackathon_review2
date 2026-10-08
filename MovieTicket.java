class Ticket {
    String moviename;
    int ticketprice;
    int nooftickets;
    int total;
    double discount;
    double finalAmount;

    Ticket(String moviename, int ticketprice, int nooftickets) {
        this.moviename = moviename;
        this.ticketprice = ticketprice;
        this.nooftickets = nooftickets;
    }

    void Calculatetotal() {
        total = ticketprice * nooftickets;
        System.out.println("Total amount: " + total);
    }

    void CalculateDiscount() {
        discount = total * 0.1;
        System.out.println("Discount amount: " + discount);
    }

    void CalculateFinalAmount() {
        finalAmount = total - discount;
        System.out.println("Final amount to be paid: " + finalAmount);
    }

    void Dispalybill() {
        System.out.println("Movie name: " + moviename);
        System.out.println("Ticket price: " + ticketprice);
        System.out.println("Number of tickets: " + nooftickets);
        System.out.println("Discount: " + discount);
        System.out.println("Final amount: " + finalAmount);
    }
}
class MovieTicket {
    public static void main(String args[]) {
        Ticket obj = new Ticket("Inception", 150, 3);
        obj.Calculatetotal();
        obj.CalculateDiscount();
        obj.CalculateFinalAmount();
        obj.Dispalybill();
    }
}