package com.book.controller;

import com.book.action.Action;
import com.book.action.BookafterloginAction;
import com.book.action.BookborrowAction;
import com.book.action.BookdetailAction;
import com.book.action.BookjoinAction;
import com.book.action.BookjoininAction;
import com.book.action.BookloginFormAction;
import com.book.action.BookmainAction;
import com.book.action.BooksearchAction;

public class ActionFactory {
	private ActionFactory() {}
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("book_main")) {
			action = new BookmainAction();
		}
		else if(command.equals("book_search")) {
			action = new BooksearchAction();
		}
		else if(command.equals("book_detail")) {
			action = new BookdetailAction();
		}
		else if(command.equals("book_borrow")) {
			action = new BookborrowAction();
		}
		else if(command.equals("book_login")) {
			action = new BookloginFormAction();
		}
		else if(command.equals("book_afterlogin")) {
			action = new BookafterloginAction();
		}
		else if(command.equals("book_join")) {
			action = new BookjoinAction();
		}
		else if(command.equals("book_joinin")) {
			action = new BookjoininAction();
		}
			
		return action;
	}
}
