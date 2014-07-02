package de.appblocks.vaadin.mvvm.sample;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

@Singleton
public class DemoModelServiceDummy implements DemoModelService {

	private List<DemoModel> models = new ArrayList<DemoModel>();

	@Override
	public DemoModel saveDemoModel(DemoModel demoModel) {
		this.models.add(demoModel);
		return demoModel;
	}

	@Override
	public List<DemoModel> getAllDemoModels() {
		return models;
	}

}
