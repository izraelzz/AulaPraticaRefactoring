import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
       Enumeration<Rental> rentals = aCustomer.getRentals();
       String result = headerString(aCustomer); 
       while (rentals.hasMoreElements()) {
          Rental each = rentals.nextElement();
          result += rentalString(each); 
       }
       result += footerString(aCustomer); 
       return result;
    }
 
    protected abstract String headerString(Customer aCustomer);
    protected abstract String rentalString(Rental aRental);
    protected abstract String footerString(Customer aCustomer);
 }
 