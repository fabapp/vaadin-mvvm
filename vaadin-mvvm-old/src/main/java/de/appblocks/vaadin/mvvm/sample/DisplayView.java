package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.cdi.CDIView;
import com.vaadin.data.Item;
import com.vaadin.event.Action;
import com.vaadin.event.Action.Handler;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

//@org.vaadin.addons.bambi.View(model=DemoViewModel.class)
//@Navigable("demo")
@CDIView("display")
public class DisplayView extends CustomComponent implements View, Handler, Serializable {
	private static final long serialVersionUID = 1L;
	@Inject
	private transient DisplayViewModel viewModel;
	@AutoGenerated
	private VerticalLayout mainLayout;
//	@ActionBound(to = "addAddress")
    private final Button addButton = new Button("New Address");
	private Item item;
	private TextField textField;

	
	public DisplayView() {
		buildLayout();
		setCompositionRoot(mainLayout);
		setSizeFull();
	}
	
	private void buildLayout() {
		mainLayout = new VerticalLayout();
		textField = new TextField("Value");
		mainLayout.addComponent(textField);
		mainLayout.addComponent(addButton);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println(viewModel);
		addButton.addClickListener(viewModel);
		item = viewModel.getItem();
		textField.setPropertyDataSource(item.getItemProperty("value"));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Action[] getActions(Object target, Object sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleAction(Action action, Object sender, Object target) {
		// TODO Auto-generated method stub
		
	}

	public DisplayViewModel getViewModel() {
		return viewModel;
	}
	
}
