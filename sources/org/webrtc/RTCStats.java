package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f44480id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j10, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j10;
        this.type = str;
        this.f44480id = str2;
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

    public static RTCStats create(long j10, String str, String str2, Map map) {
        return new RTCStats(j10, str, str2, map);
    }

    public String getId() {
        return this.f44480id;
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
        StringBuilder t10 = a1.g.t("{ timestampUs: ");
        t10.append(this.timestampUs);
        t10.append(", type: ");
        t10.append(this.type);
        t10.append(", id: ");
        t10.append(this.f44480id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            t10.append(", ");
            t10.append(entry.getKey());
            t10.append(": ");
            appendValue(t10, entry.getValue());
        }
        t10.append(" }");
        return t10.toString();
    }
}
