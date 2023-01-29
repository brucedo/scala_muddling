package ca.gc.agr.ias.loader

import org.scalatra._
import org.scalatra.servlet.FileUploadSupport
import org.scalatra.servlet.MultipartConfig

class Loader extends ScalatraServlet with FileUploadSupport
{
    configureMultipartHandling(MultipartConfig(maxFileSize = Some(3*10240)))
    
    get("/")
    {
        views.html.upload()
    }

    //post("/?")
    //{
    //    fileParams("csvFile")
    //}
}