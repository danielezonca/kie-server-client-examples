package com.redhat;

import org.kie.server.api.marshalling.xstream.KieServerTypePermission;
import org.kie.server.api.marshalling.xstream.XStreamMarshaller;
import org.kie.server.api.marshalling.xstream.XStreamMarshallerExtension;

public class MyCustomXStreamConfiguration implements XStreamMarshallerExtension {

    static private final KieServerTypePermission permission = new KieServerTypePermission(null);

    @Override
    public void extend(XStreamMarshaller xStreamMarshaller) {
        xStreamMarshaller.getXstream().addPermission(permission);
    }
}
