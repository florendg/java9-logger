import dev.weirdduke.logger.impl.LoggerFinder;

module dev.weirdduke.logger.impl {
   requires org.apache.logging.log4j;
   //This is how you state a module implements a Service
   provides java.lang.System.LoggerFinder
      with LoggerFinder;

   opens dev.weirdduke.logger.impl to org.junit.jupiter;
}