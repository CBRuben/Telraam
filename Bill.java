

import java.util.ArrayList;

public class Bill {

    private static int codeCounter = 0;
    private int code;
    private int tafel;
    public Drink[] drankenLijst;
    private double total;
    public ArrayList<Drink>lijst;


    // constructors

    // default constructor
    public Bill() {


    }


    public Bill(int tafel, Drink[] drankenLijst){
        codeCounter++;
        setCode(codeCounter);
        setTafel(tafel);
        setDrankenLijst(drankenLijst);
        setTotal(total);
        lijst = new ArrayList<>();
    }



    // getters


    public int getCode() {
        return code;
    }

    public double getTotal() {
        return total;
    }

    public int getTafel() {
        return tafel;
    }

    public Drink[] getDrankenLijst() {
        return drankenLijst;
    }


    // setters

    public void setTafel(int tafel) {
        this.tafel = tafel;
    }

    public void setDrankenLijst(Drink[] drankenLijst) {
        this.drankenLijst = drankenLijst;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // TODO: 27/11/2018 vul deze methode aan, zorg ervoor dat een totaalsom berekend kan worden, zorg ook voor een manier om de aantallen beter te implementeren
    public double berekenTotaalSom(){


        return total;
    }

    public void addDrink(Drink d){

        lijst.add(d);

    }

    public void showList(){
        for (Drink testje: lijst){
            System.out.println(testje);
        }
    }
}
