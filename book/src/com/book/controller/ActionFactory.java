package com.book.controller;

import com.book.action.Action;
import com.book.action.BookloginFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);
		
		if(command.equals("book_login")) {
			action = new BookloginFormAction();
		} 
		return action;
	}
}
