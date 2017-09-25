package com.altran.igjava.logger.app;

/**
 * This is a main class to demonstrate the working of the java 9 logging api.
 */
public class Main {

   private static final System.Logger LOGGER = System.getLogger(Main.class.getName());

   public static void main(String... args) {

      LOGGER.log(System.Logger.Level.WARNING, "Starting the application");



      LOGGER.log(System.Logger.Level.ERROR, "Finishing the application" );
   }
}
