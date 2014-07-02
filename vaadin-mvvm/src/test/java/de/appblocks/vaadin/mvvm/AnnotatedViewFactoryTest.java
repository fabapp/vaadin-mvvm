package de.appblocks.vaadin.mvvm;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.vaadin.addons.bambi.AnnotatedViewFactory;

import de.appblocks.vaadin.mvvm.sample.DisplayView;

public class AnnotatedViewFactoryTest {
	
	private static Weld weld;
	private static WeldContainer weldContainer;
	
	@Test
	public void createView() throws InstantiationException, IllegalAccessException {
		weld = new Weld();
		weldContainer = weld.initialize();
		AnnotationViewFactory annotatedViewFactory = weldContainer.instance().select(AnnotationViewFactory.class).get();
		//DisplayView view = annotatedViewFactory.materialize(DisplayView.class);
		//System.out.println(view.getViewModel());
	}
}
