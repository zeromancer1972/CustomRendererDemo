package org.openntf.uikit;

import java.io.Serializable;
import java.util.ArrayList;

public class Navigation implements Serializable {

	private static final long serialVersionUID = -993085805624826931L;

	private ArrayList<Page> items = null;

	public Navigation() {
		items = new ArrayList<Page>();
		items.add(new Page("Home", "index.xsp"));
		items.add(new Page("About", "about.xsp"));
	}

	public ArrayList<Page> getItems() {
		return items;
	}

}
