package org.openntf.uikit;

import java.io.Serializable;

public class Page implements Serializable {

	private static final long serialVersionUID = 45923476176461869L;
	private final String label;
	private final String url;

	public Page(final String label, final String url) {
		this.label = label;
		this.url = url;
	}

	public String getLabel() {
		return label;
	}

	public String getUrl() {
		return url;
	}

	public boolean isActive(final String pageName) {
		return pageName.indexOf(this.url) != -1;
	}

}
