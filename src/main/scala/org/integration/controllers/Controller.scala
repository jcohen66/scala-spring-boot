package org.integration.controllers

import org.integration.beans.Users
import org.integration.constants.Properties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RequestMapping, ResponseBody, RestController}

import javax.servlet.http.HttpServletResponse
import javax.validation.Valid

@RequestMapping(path = Array("/user"))
@RestController
class HomeController {
  /*
  To autowire a service or component, mention
  those in constructor like below:

    class HomeController(@Autowired val userService: UserService,
                         @Autowired val anotherService: AnotherService
   */

  @Autowired
  private var properties: Properties = _

  // Health check api
  @GetMapping(path = Array("/"))
  def demo: String = {
    "Welcome to Janus executor engine."
  }

  @GetMapping(path = Array("/get-all"))
  @ResponseBody
  def getUsers(response: HttpServletResponse): Unit = {
    println(properties.PROJECT_DESCRIPTION)
    /*
    Business logic goes here.
     */
    response.setStatus(HttpStatus.OK.value())
    response.getWriter.println("users")
    response.getWriter.flush()
    response.getWriter.close()
  }

  @PostMapping(path = Array("/add"))
  def addUsers(@Valid @RequestBody user: Users, response: HttpServletResponse): Unit = {
    /*
    Business logic goes  here
     */
    response.setStatus(HttpStatus.OK.value())
    response.getWriter.println("Added Successfully")
    response.getWriter.flush()
    response.getWriter.close()

  }
}
