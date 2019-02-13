public class Drink {
    /*
    De drank klasse zorgt ervoor dat er een drank object kan gemaakt worden met een naam, code, prijs en aantal.
    Bv: Coca-cola, 0001, 1.50, 0
     */

    private String name;
    private String code;
    private double price;
    private double amount;

    // constructors

    // default constructor
    public Drink(){

    }

    public Drink(String name, String code , double price, double amount){
        setName(name);
        setCode(code);
        setPrice(price);
        setAmount(amount);
    }

    // getters

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String print(){
        return  "Drank naam:" + this.getName() + " Drank Code: " + this.getCode() + " Drank prijs:" + this.getPrice() + " Drank aantal: " + this.getAmount();
    }
}
