package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f40338id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j3, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j3;
        this.type = str;
        this.f40338id = str2;
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
        return this.f40338id;
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
        StringBuilder v = a4.a.v("{ timestampUs: ");
        v.append(this.timestampUs);
        v.append(", type: ");
        v.append(this.type);
        v.append(", id: ");
        v.append(this.f40338id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            v.append(", ");
            v.append(entry.getKey());
            v.append(": ");
            appendValue(v, entry.getValue());
        }
        v.append(" }");
        return v.toString();
    }
}
