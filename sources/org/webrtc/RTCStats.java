package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f40909id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j10, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j10;
        this.type = str;
        this.f40909id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i10 = 0; i10 < objArr.length; i10++) {
                if (i10 != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i10]);
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

    public static RTCStats create(long j10, String str, String str2, Map map) {
        return new RTCStats(j10, str, str2, map);
    }

    public String getId() {
        return this.f40909id;
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
        StringBuilder l10 = e2.c.l("{ timestampUs: ");
        l10.append(this.timestampUs);
        l10.append(", type: ");
        l10.append(this.type);
        l10.append(", id: ");
        l10.append(this.f40909id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            l10.append(", ");
            l10.append(entry.getKey());
            l10.append(": ");
            appendValue(l10, entry.getValue());
        }
        l10.append(" }");
        return l10.toString();
    }
}
