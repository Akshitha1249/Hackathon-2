class MovieTicket{
    String moviename;
    double ticketprice;
    int numberoftickets;
    MovieTicket(String m, double t, int n){
        moviename = m;
        ticketprice = t;
        numberoftickets = n;

        calculateTotal();
        calculateDiscount();
        calculateFinalAmount();
        displayBill();
    }
    double total;
    double discount;
    double amount;

    void calculateTotal(){
        total = ticketprice * numberoftickets;
    }
    void calculateDiscount(){
        if(numberoftickets >= 5){
            discount = total * 0.10;
        } else {
            discount = 0;
        }
    }
    void calculateFinalAmount(){
        amount = total - discount;
    }
    void displayBill(){
        System.out.println("Movie Name: " + moviename);
        System.out.println("Ticket Price: " + ticketprice);
        System.out.println("Number of Tickets: " + numberoftickets);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount: " + amount);
    }
    public static void main(String[] args){
        MovieTicket mt = new MovieTicket("Avengers", 200, 5);
        mt.displayBill();
        }
}