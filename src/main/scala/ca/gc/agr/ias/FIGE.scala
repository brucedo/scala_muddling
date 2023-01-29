package ca.gc.agr.ias

import org.scalatra._
import org.scalatra.servlet.FileUploadSupport
import org.scalatra.servlet.MultipartConfig

class FIGE extends ScalatraServlet with FileUploadSupport {

  configureMultipartHandling(MultipartConfig(maxFileSize = Some(3*10240)))

  get("/") {
    views.html.hello()
  }

}
