module com.altran.igjava.logger.impl {
   requires log4j.api;
   //This is how you state a module implements a Service
   provides java.lang.System.LoggerFinder
      with com.altran.igjava.logger.impl.LoggerFinder;

   opens com.altran.igjava.logger.impl to junit;
}