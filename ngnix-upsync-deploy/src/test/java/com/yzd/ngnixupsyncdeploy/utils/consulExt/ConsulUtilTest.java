package com.yzd.ngnixupsyncdeploy.utils.consulExt;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsulUtilTest {

    @Test
    public void addRegCheckForTCP(){
        ServiceInfoForTcp serviceInfoForTcp=new ServiceInfoForTcp();
        serviceInfoForTcp.setServiceId("prometheus-etcd22");
        serviceInfoForTcp.setServiceName("etcd4");
        serviceInfoForTcp.setTcp("192.168.1.239");
        serviceInfoForTcp.setTag("A");
        serviceInfoForTcp.setPort(1222);
        serviceInfoForTcp.setInterval(2);
        ConsulUtil.addRegCheckForTCP(serviceInfoForTcp);
    }
    @Test
    public void addRegCheckForTCP2(){
        ServiceInfoForTcp serviceInfoForTcp=new ServiceInfoForTcp();
        serviceInfoForTcp.setServiceId("prometheus-etcd");
        serviceInfoForTcp.setServiceName("etcd4");
        serviceInfoForTcp.setTcp("192.168.1.239");
        serviceInfoForTcp.setTag("B");
        serviceInfoForTcp.setPort(2225);
        serviceInfoForTcp.setInterval(2);
        ConsulUtil.addRegCheckForTCP(serviceInfoForTcp);
    }

}