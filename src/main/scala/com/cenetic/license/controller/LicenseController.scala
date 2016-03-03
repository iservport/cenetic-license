package com.cenetic.license.controller

import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation._

import org.helianto.document.domain.Document

/**
  * Controlador da API de licença.
  *
  * Created by mauriciofernandesdecastro on 03/03/16.
  */
@RequestMapping(value = Array("/api/license"))
@RestController
class LicenseController {

  /**
    * Lista as licenças de uma entidade.
    *
    * GET		/api/license/?entityId
    */
  @RequestMapping(value = Array("/entityId"), method = Array(RequestMethod.GET))
  def licenseList(@RequestParam entityId:Int): Page[Document] = ??? // TODO chamar serviço listar licenças

  /**
    * Cria nova licença para uma entidade.
    *
    * POST		/api/license/?entityId
    */
  @RequestMapping(value = Array("/entityId"), method = Array(RequestMethod.POST))
  def licenseNew(@RequestParam entityId:Int): Document = ??? // TODO chamar serviço criar licença

  /**
    * Atualiza licença.
    *
    * PUT		/api/license/
    */
  @RequestMapping(method = Array(RequestMethod.PUT))
  def licenseUpd(@RequestBody command:Document): Document = ??? // TODO chamar serviço atualizar licença

  /**
    * Consulta licença.
    *
    * PUT		/api/license/?documentId
    */
  @RequestMapping(value = Array("/documentId"), method = Array(RequestMethod.GET))
  def license(@RequestParam documentId:Int): Document = ??? // TODO chamar serviço consultar licença

}
