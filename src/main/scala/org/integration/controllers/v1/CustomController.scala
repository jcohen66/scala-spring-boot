package org.integration.controllers.v1

import org.integration.services.CustomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestParam, RestController}

@RequestMapping(path = Array("/api/v1/custom"))
@RestController
class CustomController {

  import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}

  @Autowired
  private var customService: CustomService = _

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  def custom = "custom"

  @RequestMapping(value = Array("/add/{lhs}/{rhs}"), method = Array(RequestMethod.POST))
  def add(@PathVariable lhs: Int, @PathVariable rhs: Int): Int = {
    lhs + rhs
  }
}
