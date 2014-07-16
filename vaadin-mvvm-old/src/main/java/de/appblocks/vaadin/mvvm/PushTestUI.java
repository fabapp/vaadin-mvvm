package de.appblocks.vaadin.mvvm;

import com.vaadin.annotations.Push;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Push
@CDIUI()
public class PushTestUI extends UI {

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
                Thread.sleep(1000);
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