package org.integration.services

import org.springframework.stereotype.Service

@Service
class CustomService {

  def add(a: Int, b: Int) = a + b

}
