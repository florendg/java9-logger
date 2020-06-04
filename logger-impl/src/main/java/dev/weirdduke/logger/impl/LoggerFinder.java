package dev.weirdduke.logger.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerFinder extends System.LoggerFinder {
   /**
    * Returns an instance of {@link Logger Logger}
    * for the given {@code module}.
    *
    * @param name   the name of the logger.
    * @param module the module for which the logger is being requested.
    * @return a {@link Logger logger} suitable for use within the given
    * module.
    * @throws NullPointerException if {@code name} is {@code null} or
    *                              {@code module} is {@code null}.
    * @throws SecurityException    if a security manager is present and its
    *                              {@code checkPermission} method doesn't allow the
    *                              {@code RuntimePermission("loggerFinder")}.
    */
   @Override
   public System.Logger getLogger(String name, Module module) {

      final Logger logger = LogManager.getLogger(
         String.format("%s/%s",module,name));

      return new WeirddukeLogger(logger);
   }
}
