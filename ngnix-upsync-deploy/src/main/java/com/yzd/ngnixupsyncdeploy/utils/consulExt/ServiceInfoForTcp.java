package com.yzd.ngnixupsyncdeploy.utils.consulExt;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ServiceInfoForTcp {
    private String serviceId;
    private String serviceName;
    private String tag;
    private String tcp;
    Integer port;
    Integer interval;
}
