package ar.com.educacionit.web.managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloEduITManagedBean", eager = true)
public class HelloEduITManagedBean {

	public HelloEduITManagedBean() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return "Hola EDUIT";
	}
}
