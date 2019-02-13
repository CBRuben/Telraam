package sample;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class Controller {

    @FXML private Button addcola;
    @FXML private Button addfanta;
    @FXML private Button addsprite;
    @FXML private Button addbier;
    @FXML private Button addcocktail;
    @FXML private Button bevestig;
    @FXML private Button afdrukken;
    @FXML private Button aanmeldenenter;
    @FXML private Button tafelenter;
    @FXML private Button plus;
    @FXML private Button min;
    @FXML private TextArea aanmelden;
    @FXML private TextArea tafelnummer;
    @FXML private TextArea totaal;
    @FXML private TextArea totaalsom;
    @FXML private TextField rekeningbevestig;










    @FXML
    void initialize()
    {
        Platform.runLater(() -> {
            System.out.println("controller started");

            addcola.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
                    {
                Bill rekening = new Bill();
                Drink cola = new Drink("Cola", "c001", 1, 0 );
                rekening.addDrink(cola);
                    }
            );

            addfanta.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("fanta");
            });

            addsprite.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("sprite");
            });

            addbier.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("bier");
            });

            addcocktail.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("cocktail");
            });

            bevestig.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("bevestig");
            });

            afdrukken.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
                    {
                Bill rekening = new Bill();
                rekening.showList();
                    }
            );

            aanmeldenenter.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {

                System.out.println(aanmelden.getText());

            });

            tafelenter.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println(tafelnummer.getText());
            });

            plus.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("plus");

            });

            min.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->
            {
                System.out.println("min");
            });



        });



    }

}
