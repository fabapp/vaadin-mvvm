package de.appblocks.vaadin.mvvm;

import javax.inject.Named;
import javax.inject.Singleton;

import org.vaadin.addons.bambi.AnnotatedViewBinding;
import org.vaadin.addons.bambi.View;

import com.vaadin.ui.CustomComponent;

//@ManagedBean
@Named("viewFactory")
@Singleton
public class AnnotationViewFactory implements ViewFactory {

	@Override
	public <T extends CustomComponent> T materialize(Class<T> viewClass) throws InstantiationException, IllegalAccessException {
		if (!viewClass.isAnnotationPresent(View.class)) {
			throw new IllegalArgumentException(
					"The specified view class is invalid. Did you forget to add the @View annotation?");
		}

		Class<?> modelClazz = viewClass.getAnnotation(View.class).model();
		T view = viewClass.newInstance();
		Object model = modelClazz.newInstance();
		new AnnotatedViewBinding(view, model);
//		return ViewContainer.create(view, model);
		return view;
	}

}
