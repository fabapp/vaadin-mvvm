package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import com.google.gwt.thirdparty.guava.common.eventbus.EventBus;
import com.vaadin.cdi.UIScoped;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.UI;

@UIScoped
public class TableViewModel  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	DemoModelService demoModelService;
	BeanItemContainer<DemoModel> itemContainer = new BeanItemContainer<DemoModel>(DemoModel.class);
//	@Inject
//	private EventBus eventBus;
	
	public TableViewModel() {
		super();
	}

	public Container getContainer() {
		return itemContainer;
	}

	@PostConstruct
	public void postConstruct() {
		itemContainer.addAll(demoModelService.getAllDemoModels());
//		eventBus.register(this);
	}
	
	
	/**
	 * CDI Observer for InsertItemEvent
	 */
	public void handleInsertItem(@Observes InsertItemEvent event) {
		final DemoModel item = event.getItem();
		final UI ui = UI.getCurrent(); 
		ui.access(new Runnable() {
		    @Override
		    public void run() {
		    	itemContainer.addItem(item);
		        ui.push();
		    }
		});
	}

	
}
