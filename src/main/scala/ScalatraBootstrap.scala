import ca.gc.agr.ias._
import ca.gc.agr.ias.loader._
import org.scalatra._
import javax.servlet.ServletContext
import org.slf4j.LoggerFactory

class ScalatraBootstrap extends LifeCycle {
  val logger = LoggerFactory.getLogger(getClass)
  override def init(context: ServletContext) = {
    logger.debug("Mounting main route")
    context.mount(new FIGE, "/*")
    logger.debug("Mounting loader root")
    context mount(new Loader, "/loader/*")
    logger.debug("All routes mounted.")
  }
}
