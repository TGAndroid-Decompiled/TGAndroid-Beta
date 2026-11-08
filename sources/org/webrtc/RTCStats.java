package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f53030id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j3, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j3;
        this.type = str;
        this.f53030id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb2.append('[');
            for (int i7 = 0; i7 < objArr.length; i7++) {
                if (i7 != 0) {
                    sb2.append(", ");
                }
                appendValue(sb2, objArr[i7]);
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
        return this.f53030id;
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("{ timestampUs: ");
        m10.append(this.timestampUs);
        m10.append(", type: ");
        m10.append(this.type);
        m10.append(", id: ");
        m10.append(this.f53030id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            m10.append(", ");
            m10.append(entry.getKey());
            m10.append(": ");
            appendValue(m10, entry.getValue());
        }
        m10.append(" }");
        return m10.toString();
    }
}
