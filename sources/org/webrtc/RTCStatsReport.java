package org.webrtc;

import java.util.Map;
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j10, Map<String, RTCStats> map) {
        this.timestampUs = j10;
        this.stats = map;
    }

    private static RTCStatsReport create(long j10, Map map) {
        return new RTCStatsReport(j10, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ timestampUs: ");
        sb.append(this.timestampUs);
        sb.append(", stats: [\n");
        boolean z4 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z4) {
                sb.append(",\n");
            }
            sb.append(rTCStats);
            z4 = false;
        }
        sb.append(" ] }");
        return sb.toString();
    }
}
