import com.informant.teste.*

class BootStrap {

    def init = { servletContext ->
    	def roleAdmin = new Role(authority:"ROLE_ADMIN")
    	roleAdmin.save()

        def roleUser = new Role(authority:"ROLE_USER")
        roleUser.save()

    	def user = new User(username:"rafael", password: "rafael")
    	user.save()

        def user2 = new User(username:"carlos.schneider", password: "carlos.schneider")
        user2.save()

        

    	def userRole = new UserRole(user:user, role:roleAdmin)
    	userRole.save()

        userRole = new UserRole(user:user2, role:roleUser)
        userRole.save()


    }
    def destroy = {
    }
}
