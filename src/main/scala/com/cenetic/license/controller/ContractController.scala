package com.cenetic.license.controller

import java.util.Date
import javax.inject.Inject

import com.cenetic.license.service.ContractQueryService
import org.helianto.document.domain.Document
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}

/**
  * Controlador da API de contratos.
  *
  * Created by mauriciofernandesdecastro on 03/03/16.
  */
@RequestMapping(value = Array("/api/contract"))
@RestController
class ContractController {

  @Inject var contractQueryService: ContractQueryService = _

  /**
    * Lista a utilização de um contrato.
    *
    * GET		/api/contract/?contractId
    */
  @RequestMapping(value = Array("/contractId"), method = Array(RequestMethod.GET))
  def getUsage(@RequestParam contractId:Int, @RequestParam startDate:Date, @RequestParam endDate:Date) =
    contractQueryService.getUsage(contractId, startDate, endDate)

}
