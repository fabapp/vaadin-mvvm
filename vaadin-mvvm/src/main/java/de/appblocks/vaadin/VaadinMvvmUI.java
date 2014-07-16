package de.appblocks.vaadin;

import javax.inject.Inject;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;

import com.vaadin.annotations.Push;
import com.vaadin.cdi.CDIUI;
import com.vaadin.cdi.CDIViewProvider;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Push/* https://vaadin.com/book/vaadin7/-/page/advanced.push.html */
@CDIUI
@WindowScoped
public class VaadinMvvmUI extends UI {
	
//	
//	 @WebServlet(value = "/*",
//	            asyncSupported = true,
//	            initParams = {@WebInitParam(
//	                    name = "session-timeout",
//	                    value = "60"
//	            ),@WebInitParam(
//	                    name = "UIProvider",
//	                    value = "com.vaadin.cdi.CDIUIProvider"
//	            )}
//	    )
//	    @VaadinServletConfiguration(productionMode = false,
//	            ui = DataManagerUI.class,
//	            closeIdleSessions = true
//	    )
	

	@Inject
	private CDIViewProvider viewProvider;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void init(VaadinRequest request) {	
		setSizeFull();

        VerticalLayout navigatorLayout = new VerticalLayout();
        navigatorLayout.setSizeFull();

        Navigator navigator = new Navigator(VaadinMvvmUI.this, navigatorLayout);
        navigator.addProvider(viewProvider);
        navigator.navigateTo("");
        setContent(navigatorLayout);	
        
	}

}