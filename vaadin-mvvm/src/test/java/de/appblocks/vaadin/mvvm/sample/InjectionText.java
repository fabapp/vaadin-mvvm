package de.appblocks.vaadin.mvvm.sample;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;


public class InjectionText {
	
	private static Weld weld;
	private static WeldContainer weldContainer;

	@Test
	public void testINjection() {
		weld = new Weld();
		weldContainer = weld.initialize();
		DisplayView book = weldContainer.instance().select(DisplayView.class).get();
		
	}
}
