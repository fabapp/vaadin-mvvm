package de.appblocks.vaadin.mvvm.sample;

//@UIScoped
@InsertItem
public class InsertItemEvent {

	private DemoModel item;

	public InsertItemEvent() {
		// TODO Auto-generated constructor stub
	}

	public InsertItemEvent(DemoModel demoModel) {
		this.item = demoModel;
	}

	public DemoModel getItem() {
		return item;
	}

}
