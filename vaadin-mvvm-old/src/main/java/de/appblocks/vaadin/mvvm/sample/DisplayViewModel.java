package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import com.google.gwt.thirdparty.guava.common.eventbus.EventBus;
import com.vaadin.cdi.UIScoped;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@UIScoped
public class DisplayViewModel implements ClickListener, Serializable {

	@Inject
	private DemoModelService demoModelService;
	private BeanItem<DemoModel> item;
	@Inject
	@Any 
    private Event<InsertItemEvent> insertItemEvent;
	@Inject
	private EventBus eventBus;

	public DisplayViewModel() {
		DemoModel demoModel = new DemoModel();
		demoModel.setValue("the value");
		item = new BeanItem<DemoModel>(demoModel);
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		System.out.println(item.getBean());
		demoModelService.saveDemoModel(item.getBean());
		// TODO: fire event application event for itemupdate
		InsertItemEvent insertEvent = new InsertItemEvent(item.getBean());
		insertItemEvent.fire(insertEvent);
//		 eventBus.post(insertEvent);

	}

	public Item getItem() {
		return item;
	}
	
}
