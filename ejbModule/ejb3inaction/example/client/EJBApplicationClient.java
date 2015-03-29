package ejb3inaction.example.client;

import javax.naming.Context;
import javax.naming.NamingException;

import ejb3inaction.example.HelloUserBean;
import ejb3inaction.example.HelloUserBeanRemote;
import ejb3inaction.example.userutility.UserUtility;

public class EJBApplicationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloUserBeanRemote bean = doLookup();
		bean.sayHello("Julian Fernando");
	}

	private static HelloUserBeanRemote doLookup() {
		// TODO Auto-generated method stub
		Context context = null;
		
		HelloUserBeanRemote bean = null;
		
		try {
			context = UserUtility.getInitialContext();
			String lookupName = getLookupName();
			bean = (HelloUserBeanRemote) context.lookup(lookupName);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bean;
	}

	private static String getLookupName() {
		// TODO Auto-generated method stub
		String appName ="";
		
		String moduleName = "HelloUser";
		
		String distinctName = "";
		
		String beanName = HelloUserBean.class.getSimpleName();
		
		final String interfaceName = HelloUserBeanRemote.class.getName();
		
		String name = "ejb:" + appName + "/" + moduleName + "/"+distinctName + "/"+beanName + "!"+interfaceName;
		
		return name;
	}

}
