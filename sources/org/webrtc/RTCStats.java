package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f39470id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j3, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j3;
        this.type = str;
        this.f39470id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb2.append('[');
            for (int i10 = 0; i10 < objArr.length; i10++) {
                if (i10 != 0) {
                    sb2.append(", ");
                }
                appendValue(sb2, objArr[i10]);
            }
            sb2.append(']');
        } else if (obj instanceof String) {
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
        } else {
            sb2.append(obj);
        }
    }

    public static RTCStats create(long j3, String str, String str2, Map map) {
        return new RTCStats(j3, str, str2, map);
    }

    public String getId() {
        return this.f39470id;
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
        StringBuilder u10 = a4.a.u("{ timestampUs: ");
        u10.append(this.timestampUs);
        u10.append(", type: ");
        u10.append(this.type);
        u10.append(", id: ");
        u10.append(this.f39470id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            u10.append(", ");
            u10.append(entry.getKey());
            u10.append(": ");
            appendValue(u10, entry.getValue());
        }
        u10.append(" }");
        return u10.toString();
    }
}
