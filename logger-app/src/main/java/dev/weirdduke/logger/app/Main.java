package dev.weirdduke.logger.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * This is a main class to demonstrate the working of the java 9 logging api.
 */
public class Main extends Application{

   private static final System.Logger LOGGER = System.getLogger(Main.class.getName());

   public static void main(String... args) {

      LOGGER.log(System.Logger.Level.WARNING, "Starting the application");

      launch(args);

      LOGGER.log(System.Logger.Level.ERROR, "Finishing the application" );
   }

   /**
    * The main entry point for all JavaFX applications.
    * The start method is called after the init method has returned,
    * and after the system is ready for the application to begin running.
    * <p>
    * NOTE: This method is called on the JavaFX Application Thread.
    * </p>
    *
    * @param primaryStage the primary stage for this application, onto which
    *                     the application scene can be set. The primary stage will be embedded in
    *                     the browser if the application was launched as an applet.
    *                     Applications may create other stages, if needed, but they will not be
    *                     primary stages and will not be embedded in the browser.
    * @throws Exception if something goes wrong
    */
   @Override
   public void start(Stage primaryStage)  {

      Button knop = new Button("Knop");

      StackPane root = new StackPane();
      root.getChildren().add(knop);

      Scene scene = new Scene(root, 400,400);

      primaryStage.setScene(scene);
      primaryStage.show();

   }
}
