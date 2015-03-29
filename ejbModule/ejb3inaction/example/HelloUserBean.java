package ejb3inaction.example;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloUserBean
 */
@Stateless
@LocalBean
public class HelloUserBean implements HelloUserBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloUserBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void sayHello(String name) {
		System.out.println(name + " como vai? " + " Seja bem vindo ao EJB3!");
		
	}

}
