package de.appblocks.vaadin.mvvm.sample;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.UIScoped;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;

@CDIView("")
@UIScoped
public class DemoWorkspacePanel extends CustomComponent implements View {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HorizontalLayout mainLayout;
	private  Panel panel;
	@Inject
	private DisplayView displayView;
	@Inject
	private TableView tableView;
	
	public DemoWorkspacePanel() {
		buildLayout();
		setCompositionRoot(panel);
	}

	private void buildLayout() {
		mainLayout = new HorizontalLayout();
		mainLayout.setSizeFull();
		panel = new Panel();
		panel.setContent(mainLayout);
	}
	
	@PostConstruct
	public void postConstruct() {
		mainLayout.addComponent(displayView);
		mainLayout.addComponent(tableView);
		
		final BeanItemContainer<DemoModel> beanItemContainer = new BeanItemContainer<DemoModel>(DemoModel.class);
		
		final Table table = new Table();
		table.setContainerDataSource(beanItemContainer);
		mainLayout.addComponent(table);
		final TextField textField = new TextField("text");
		mainLayout.addComponent(textField);
		Button button = new Button("add");
		mainLayout.addComponent(button);
		button.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				beanItemContainer.addBean(new DemoModel(textField.getValue()));
				table.markAsDirty();
				Notification.show("YEAH", Notification.Type.TRAY_NOTIFICATION);
			}
		});
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
