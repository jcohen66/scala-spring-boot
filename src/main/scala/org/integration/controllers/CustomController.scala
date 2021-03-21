package org.integration.controllers

import org.springframework.web.bind.annotation.RestController

@RestController
class CustomController {

  import org.springframework.web.bind.annotation.RequestMapping
  import org.springframework.web.bind.annotation.RequestMethod

  @RequestMapping(value = Array("/custom"), method = Array(RequestMethod.POST)) def custom = "custom"
}
