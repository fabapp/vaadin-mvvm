/**
 * CDIEventTest 
 * 
 * @author fabian krueger
 * @date 13.07.2014
 */
package de.appblocks.vaadin;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Ignore;
import org.junit.Test;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

import de.appblocks.vaadin.mvvm.sample.DisplayViewModel;

/**
 * @author fabian krueger
 *
 */
public class CDIEventTest {
	@Test
	@Ignore
	public void testCdiEvent() {
		UI ui = new VaadinMvvmUI();
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		DisplayViewModel displayViewModel = container.instance().select(DisplayViewModel.class).get();
		displayViewModel.buttonClick(new ClickEvent(null));
	}
}
