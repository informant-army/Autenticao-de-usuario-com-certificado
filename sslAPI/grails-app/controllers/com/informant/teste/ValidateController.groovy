package com.informant.teste

class ValidateController {

	def springSecurityService	

	def usuario = {
		def currentUser = springSecurityService.getCurrentUser()
		render "Seja bem vindo usuário: " +  currentUser.username + "\n Seu role é: " + currentUser.getAuthorities()
	}

	def admin = {
		def currentUser = springSecurityService.getCurrentUser()
		render "Seja bem vindo Administrador: " +  currentUser.username + "\n Seu role é: " + currentUser.getAuthorities()
	}
}