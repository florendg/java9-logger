module com.altran.igjava.logger.impl {
   requires log4j.api;
   provides java.lang.System.LoggerFinder
      with com.altran.igjava.logger.impl.LoggerFinder;
}