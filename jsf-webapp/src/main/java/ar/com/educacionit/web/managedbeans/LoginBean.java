package ar.com.educacionit.web.managedbeans;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import ar.com.eduacionit.app.domain.User;
import ar.com.educacionit.services.UserService;
import ar.com.educacionit.services.impl.UserServiceImpl;

@ManagedBean()
@RequestScoped
public class LoginBean {
	
	private String user;
	
	private String password;
	
	private String error;

	//cttrl+shift+o
	private UserService userService = new UserServiceImpl();
	
	public LoginBean() {
		
	}
	
	public String login() {
		
		//TDD
		User user;
		
		try {
			user = userService.getUserByUserName(this.getUser());
			
			if(user != null && user.getPassword().equals(this.getPassword())) {
				
				Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				sessionMap.put("usuario", user);
				return "login-success";
			}else {
				error = "Bad Username / Password";
				return "login";
			}
		}catch (Exception e) {
			error = e.getMessage();
			return "login";
		}
		
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
