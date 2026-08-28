package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f45280id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j10, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j10;
        this.type = str;
        this.f45280id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb2.append('[');
            for (int i9 = 0; i9 < objArr.length; i9++) {
                if (i9 != 0) {
                    sb2.append(", ");
                }
                appendValue(sb2, objArr[i9]);
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

    public static RTCStats create(long j10, String str, String str2, Map map) {
        return new RTCStats(j10, str, str2, map);
    }

    public String getId() {
        return this.f45280id;
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
        StringBuilder n10 = e2.c.n("{ timestampUs: ");
        n10.append(this.timestampUs);
        n10.append(", type: ");
        n10.append(this.type);
        n10.append(", id: ");
        n10.append(this.f45280id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            n10.append(", ");
            n10.append(entry.getKey());
            n10.append(": ");
            appendValue(n10, entry.getValue());
        }
        n10.append(" }");
        return n10.toString();
    }
}
