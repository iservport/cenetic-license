package com.cenetic.license.domain

import java.util.Date

import scala.beans.BeanProperty

/**
  * Created by mauriciofernandesdecastro on 28/04/16.
  */
case class ContractUsage
(@BeanProperty id:Int
 , @BeanProperty contractId:Int
 , @BeanProperty userId:Int
 , @BeanProperty startDate:Date
 , @BeanProperty endDate:Date
 , @BeanProperty usage:Long
) {

}
