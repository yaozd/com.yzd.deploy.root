package com.yzd.ngnixupsyncdeploy.utils.consulExt;

import com.google.common.net.HostAndPort;
import com.orbitz.consul.Consul;
import com.orbitz.consul.model.agent.ImmutableRegistration;
import com.orbitz.consul.model.agent.Registration;

import java.util.Collections;

public class ConsulUtil {
    private static final Consul client=builder();

    private static Consul builder() {
        return Consul.builder().withHostAndPort(HostAndPort.fromParts("192.168.1.239", 8500)).build();
    }


    public static void addRegCheckForTCP(ServiceInfoForTcp serviceInfoForTcp) {
        String fullTcp=String.format("%s:%s",serviceInfoForTcp.getTcp(),serviceInfoForTcp.getPort());
        Registration.RegCheck single = Registration.RegCheck.tcp(fullTcp,  serviceInfoForTcp.getInterval());
        Registration service = ImmutableRegistration.builder()
                .id(serviceInfoForTcp.getServiceId())
                .name(serviceInfoForTcp.getServiceName())
                .address(serviceInfoForTcp.getTcp())
                .port(serviceInfoForTcp.getPort())
                .check(single) // registers with a TTL of 3 seconds
                .tags(Collections.singletonList(serviceInfoForTcp.getTag()))
                .meta(Collections.singletonMap("version", "1.0"))
                .build();
        client.agentClient().register(service);
    }
}
