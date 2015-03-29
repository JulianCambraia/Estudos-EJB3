package ejb3inaction.example;

import javax.ejb.Remote;

@Remote
public interface HelloUserBeanRemote {

	public void sayHello(String name);
}
