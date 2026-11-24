package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i]);
            }
            sb.append(']');
        } else if (obj instanceof String) {
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
        } else {
            sb.append(obj);
        }
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder r = tb4.r("{ timestampUs: ");
        r.append(this.timestampUs);
        r.append(", type: ");
        r.append(this.type);
        r.append(", id: ");
        r.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            r.append(", ");
            r.append(entry.getKey());
            r.append(": ");
            appendValue(r, entry.getValue());
        }
        r.append(" }");
        return r.toString();
    }
}
