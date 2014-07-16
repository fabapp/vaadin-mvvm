package de.appblocks.vaadin.mvvm;

import com.vaadin.ui.CustomComponent;

public interface ViewFactory {
	public <T extends CustomComponent> T materialize(Class<T> viewClass) throws InstantiationException, IllegalAccessException;
}
