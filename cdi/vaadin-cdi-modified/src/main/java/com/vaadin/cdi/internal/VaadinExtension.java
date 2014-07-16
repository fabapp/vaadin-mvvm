/*
 * Copyright 2000-2013 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.vaadin.cdi.internal;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

/**
 * CDI Extension needed to register the @CDIUI scope to the runtime.
 */
public class VaadinExtension implements Extension {

	/**
	 * taken from: http://rpestano.wordpress.com/2013/06/30/cdi-custom-scope/
	 * Not required, taken from comments on the same page 
	 */
//	 public void addScope(@Observes final BeforeBeanDiscovery event) {
//	        event.addScope(UIScoped.class, true, false);
//	    }
	
    void afterBeanDiscovery(@Observes
    final AfterBeanDiscovery afterBeanDiscovery, final BeanManager beanManager) {
        afterBeanDiscovery.addContext(new UIScopedContext(beanManager));
        getLogger().info("UIScopedContext registered");
    }

    private static Logger getLogger() {
        return Logger.getLogger(VaadinExtension.class.getCanonicalName());
    }
}
