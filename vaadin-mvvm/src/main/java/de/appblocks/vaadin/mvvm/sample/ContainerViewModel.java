package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.google.gwt.thirdparty.guava.common.eventbus.EventBus;
import com.vaadin.cdi.UIScoped;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;

@UIScoped
public class ContainerViewModel  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	DemoModelService demoModelService;
	BeanItemContainer<DemoModel> itemContainer = new BeanItemContainer<DemoModel>(DemoModel.class);
	@Inject
	private EventBus eventBus;
	
	public ContainerViewModel() {
		super();
	}

	public Container getContainer() {
		return itemContainer;
	}

	@PostConstruct
	public void postConstruct() {
		itemContainer.addAll(demoModelService.getAllDemoModels());
		eventBus.register(this);
	}
	
//	public void handleInsertItem(@Observes InsertItemEvent event) {
//		final BeanItem<DemoModel> item = event.getItem();
//		final UI ui = UI.getCurrent(); 
//		ui.access(new Runnable() {
//		    @Override
//		    public void run() {
//		    	itemContainer.addItem(item);
//		        ui.push();
//		    }
//		});
//	}

	
}
