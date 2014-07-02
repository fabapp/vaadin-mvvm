package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.thirdparty.guava.common.eventbus.Subscribe;
import com.vaadin.cdi.CDIView;
import com.vaadin.data.util.BeanItem;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;

@CDIView("table")
public class TableView extends CustomComponent implements View, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HorizontalLayout mainLayout;
	private Table table;
	@Inject
	private transient ContainerViewModel containerViewModel;

	public TableView() {
		buildLayout();
		setCompositionRoot(mainLayout);
	}

	private void buildLayout() {
		System.out.println("Building layout...");
		mainLayout = new HorizontalLayout();
		table = new Table();
		mainLayout.addComponent(table);
	}

	@PostConstruct
	public void postConstruct() {
		table.setContainerDataSource(containerViewModel.getContainer());
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

	public void handleInsertItem(@Observes InsertItemEvent event) {
		final DemoModel item = event.getItem();
		final UI ui = UI.getCurrent();
		table.addItem(item);
		table.refreshRowCache();
		    table.markAsDirty();
		ui.access(new Runnable() {
			@Override
			public void run() {
				System.out.println("1. InsertItemEvent processing...");
				table.addItem(item);
				table.refreshRowCache();
				table.markAsDirty();
				ui.push();
			}
		});
	}
//
//	@Subscribe
//	public void recordCustomerChange(InsertItemEvent e) {
//		System.out.println("2-. InsertItemEvent processing...");
//		final BeanItem<DemoModel> item = e.getItem();
//		final UI ui = UI.getCurrent();
//		ui.access(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("InsertItemEvent processing...");
//				table.addItem(item);
//				ui.push();
//			}
//		});
//		
//	}

	// public void handleInsertItem(@Observes InsertItemEvent event) {
	// table.setContainerDataSource(containerViewModel.getContainer());
	// table.refreshRowCache();
	// }

}
