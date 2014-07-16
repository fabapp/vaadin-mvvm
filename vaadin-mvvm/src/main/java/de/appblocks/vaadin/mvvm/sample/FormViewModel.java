package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.inject.Named;

import com.google.gwt.thirdparty.guava.common.eventbus.EventBus;
import com.vaadin.cdi.UIScoped;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

//@Named
//@UIScoped
public class FormViewModel implements ClickListener, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 607300431054328531L;
	@Inject
	private DemoModelService demoModelService;
	private BeanItem<DemoModel> item;
	@Inject
	@InsertItem
    private Event<InsertItemEvent> insertItemEvent;
	@Inject
	private EventBus eventBus;

	public FormViewModel() {
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
