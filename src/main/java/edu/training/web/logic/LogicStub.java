package edu.training.web.logic;

public class LogicStub {
	
	public boolean checkAuth(String login, String password) {
		
		
		if("user@mail.ru".equals(login)) {
			System.out.println("Successfully logged " + login + "password " + password);
			return true;
		}
		System.out.println("Failed logged " + login + "password " + password);
		return false;
	}

}
