package ca.gc.agr.ias

import org.scalatra._

class FIGE extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
