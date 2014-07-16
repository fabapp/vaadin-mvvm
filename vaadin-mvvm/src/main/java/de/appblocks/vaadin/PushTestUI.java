package de.appblocks.vaadin;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Push;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.Constants;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Push
@CDIUI("test")
public class PushTestUI extends UI {

//	 @WebServlet(value = "/*",
//    asyncSupported = true,
//    initParams = {@WebInitParam(
//            name = "session-timeout",
//            value = "60"
//    ),@WebInitParam(
//            name = "UIProvider",
//            value = "com.vaadin.cdi.CDIUIProvider"
//    )}
//)
//@VaadinServletConfiguration(productionMode = false,
//    ui = DataManagerUI.class,
//    closeIdleSessions = true
//)
	
//	@WebServlet(urlPatterns = "/*", initParams = { 
//	        @WebInitParam(name = VaadinSession.UI_PARAMETER,
//	        value = "de.appblocks.vaadin.PushTestUI"), 
////	        @WebInitParam(name = Constants.PARAMETER_WIDGETSET, 
////	        value =     "com.xy.zzy.AppWidgetSet"), 
//	        @WebInitParam(name = Constants.SERVLET_PARAMETER_UI_PROVIDER, 
//	        value =     "de.appblocks.vaadin.cdi.TomcatCDIUIProvider") 
//	        })
//	    public static class UIApplicationServlet extends VaadinServlet {}
	
	private static final long serialVersionUID = 380404459635522674L;
	private VerticalLayout mainLayout;

    @Override
    protected void init(VaadinRequest request) {
        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();
        mainLayout.setMargin(true);
        setContent(mainLayout);

        mainLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        Label loadingText = new Label("Loading UI, please wait...");
        loadingText.setSizeUndefined();
        mainLayout.addComponent(loadingText);
        new InitializerThread().start();
    }

    class InitializerThread extends Thread {
        @Override
        public void run() {
            // Do initialization which takes some time.
            // Here represented by a 1s sleep
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }

            // Init done, update the UI after doing locking
            access(new Runnable() {
                @Override
                public void run() {
                    // Here the UI is locked and can be updated
                    mainLayout.removeAllComponents();
                    mainLayout
                            .addComponent(new TextArea("This is the real UI"));
                    push();
                }
            });
        }
    }
}