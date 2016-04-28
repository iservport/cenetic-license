package com.cenetic.license.service

import java.util.Date

import com.cenetic.license.domain.ContractUsage

/**
  * Serviço de contratos.
  */
class ContractQueryService {

  def getUsage(contractId:Int, startDate:Date, endDate:Date) =
    List(ContractUsage(1,1,1,new Date(10000),new Date(20000), 10000))

}
