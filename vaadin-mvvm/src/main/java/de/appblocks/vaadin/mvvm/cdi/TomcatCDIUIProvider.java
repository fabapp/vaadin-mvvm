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

package de.appblocks.vaadin.mvvm.cdi;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.vaadin.cdi.CDIUIProvider;
/**
 * Dirty Hack to change JNDI path for Tomcat 7/8.
 * @see: http://dev.vaadin.com/ticket/13884
 */
public class TomcatCDIUIProvider extends CDIUIProvider implements Serializable {

	private static final long serialVersionUID = 1L;

	protected BeanManager getBeanManager() {
        if (beanManager == null) {
            // as the CDIUIProvider is not injected, need to use JNDI lookup
            try {
                InitialContext initialContext = new InitialContext();
                beanManager = (BeanManager) initialContext
                        .lookup("java:comp/env/BeanManager");
            } catch (NamingException e) {
                getLogger().severe("Could not get BeanManager through JNDI");
                beanManager = null;
            }
        }
        return beanManager;
    }

    private static Logger getLogger() {
        return Logger.getLogger(CDIUIProvider.class.getCanonicalName());
    }
}
