package de.appblocks.vaadin.mvvm.sample;

import java.util.List;

public interface DemoModelService {
	DemoModel saveDemoModel(DemoModel demoModel);
	List<DemoModel> getAllDemoModels();
}
