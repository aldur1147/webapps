package com.book.controller;

import com.book.action.Action;
import com.book.action.BookjoinAction;
import com.book.action.BookjoininAction;
import com.book.action.BooksearchAction;
import com.book.controller.ActionFactory;

public class ActionFactory {
private ActionFactory() {}
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("book_join")) {
			action = new BookjoinAction();
		}
		else if(command.equals("book_joinin")) {
			action = new BookjoininAction();
		}
		else if(command.equals("book_search")) {
			action = new BooksearchAction();
		}
			
		return action;
	}
}
