package edu.training.web.controller.concrete;

import java.util.HashMap;
import java.util.Map;

import edu.training.web.controller.concrete.impl.DoAuth;
import edu.training.web.controller.concrete.impl.DoRegistration;
import edu.training.web.controller.concrete.impl.GoToIndexPage;
import edu.training.web.controller.concrete.impl.GoToRegistrationPage;

public class CommandProvider {
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		
		commands.put(CommandName.DO_AUTH, new DoAuth());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		commands.put(CommandName.GO_TO_INDEX_PAGE, new GoToIndexPage());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
	}
	
	public Command takeCommand(String commandEnum) {
		
		try {
			CommandName commandName = CommandName.valueOf(commandEnum.toUpperCase());
			return commands.get(commandName);
		} catch(IllegalArgumentException | NullPointerException e) {
			System.out.println("No such command " + commandEnum);
			return commands.get(CommandName.GO_TO_INDEX_PAGE);
		}
	}

}
