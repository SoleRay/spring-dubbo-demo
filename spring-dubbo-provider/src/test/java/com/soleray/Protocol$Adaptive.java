package com.soleray;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.RpcException;

import java.util.List;

public class Protocol$Adaptive implements Protocol {
    public void destroy() {
        throw new UnsupportedOperationException("The method public abstract void Protocol.destroy() of interface Protocol is not adaptive method!");
    }

    public int getDefaultPort() {
        throw new UnsupportedOperationException("The method public abstract int Protocol.getDefaultPort() of interface Protocol is not adaptive method!");
    }

    public List getServers() {
        throw new UnsupportedOperationException("The method public default List Protocol.getServers() of interface Protocol is not adaptive method!");
    }

    public Invoker refer(Class arg0, URL arg1) throws RpcException {
        if (arg1 == null) {
            throw new IllegalArgumentException("url == null");
        }

        URL url = arg1;
        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());

        if (extName == null) {
            throw new IllegalStateException("Failed to get extension (Protocol) name from url (" + url.toString() + ") use keys([protocol])");
        }

        Protocol extension = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(extName);
        return extension.refer(arg0, arg1);
    }

    public Exporter export(Invoker arg0) throws RpcException {
        if (arg0 == null) {
            throw new IllegalArgumentException("Invoker argument == null");
        }
        if (arg0.getUrl() == null) {
            throw new IllegalArgumentException("Invoker argument getUrl() == null");
        }

        URL url = arg0.getUrl();
        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());

        if (extName == null) {
            throw new IllegalStateException("Failed to get extension (Protocol) name from url (" + url.toString() + ") use keys([protocol])");
        }

        Protocol extension = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(extName);
        return extension.export(arg0);
    }
}