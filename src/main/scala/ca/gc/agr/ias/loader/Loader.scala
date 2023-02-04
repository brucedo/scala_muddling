package ca.gc.agr.ias.loader

import org.scalatra._
import org.scalatra.servlet.FileUploadSupport
import org.scalatra.servlet.MultipartConfig
import org.slf4j.LoggerFactory

class Loader extends ScalatraServlet //with FileUploadSupport
{
    val logger = LoggerFactory.getLogger(getClass)
    logger.debug("Doing a thing?")
    //configureMultipartHandling(MultipartConfig(maxFileSize = Some(3*10240)))
    
    get("/?") 
    {
        <html><body>shit</body></html>
        // views.html.upload()
    }

}