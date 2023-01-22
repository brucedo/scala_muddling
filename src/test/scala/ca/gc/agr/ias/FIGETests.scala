package ca.gc.agr.ias

import org.scalatra.test.scalatest._

class FIGETests extends ScalatraFunSuite {

  addServlet(classOf[FIGE], "/*")

  test("GET / on FIGE should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
