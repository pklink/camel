/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.beanclass;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.bean.BeanEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ClassEndpointConfigurer extends BeanEndpointConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ClassEndpoint target = (ClassEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}
