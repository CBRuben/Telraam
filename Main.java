import javax.swing.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("telraam");
        primaryStage.setScene(new Scene(root, 1500, 750));
        primaryStage.show();
    }


    public static void main(String[] args)  {
        launch(args);
    }

    {

        // drankjes aanmaken:

        /*
        - Cola (1€)
        - Fanta (1€)
        - Sprite (1€)
        - Bier (2€)
        - Cocktail bloody marry (6€)
         */

        Drink cola = new Drink("Cola", "c001", 1, 0 );
        Drink fanta = new Drink("Fanta", "f001", 1, 0 );
        Drink sprite = new Drink("Sprite", "s001", 1, 0 );
        Drink bier = new Drink("Bier", "b001", 1, 0 );
        Drink cbm = new Drink("Coctail Bloody Marry", "cocktail001", 6, 0 );


        Drink[] drankenArray = {cola, fanta, sprite, bier, cbm};



        for (Drink drinks: drankenArray)
        {
            System.out.println( drinks.print());
        }

        System.out.println(cola.getName());


        // bills testen

        Bill bill1 = new Bill(1,drankenArray);
        Bill bill2 = new Bill(3,drankenArray);

        System.out.println(bill1.getCode() + " voor tafel: " + bill1.getTafel() );
        System.out.println(bill2.getCode() + " voor tafel: " + bill2.getTafel() );

        Bill test = new Bill();
        test.addDrink(cola);

        test.showList();





    }
}
