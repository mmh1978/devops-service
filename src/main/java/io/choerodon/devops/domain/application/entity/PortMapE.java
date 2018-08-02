package io.choerodon.devops.domain.application.entity;

/**
 * Creator: Runge
 * Date: 2018/8/1
 * Time: 11:04
 * Description:
 */
public class PortMapE {
    private Long port;
    private Long targetPort;

    public PortMapE() {
    }

    public PortMapE(String portMap) {
        String[] map = portMap.split(":");
        this.port = Long.valueOf(map[0]);
        this.targetPort = Long.valueOf(map[1]);
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public Long getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(Long targetPort) {
        this.targetPort = targetPort;
    }
}