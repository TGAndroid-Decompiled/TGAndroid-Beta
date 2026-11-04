package org.webrtc;

import java.util.Map;
public class RTCStats {
    private final String f53003id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j10, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j10;
        this.type = str;
        this.f53003id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb2.append('[');
            for (int i3 = 0; i3 < objArr.length; i3++) {
                if (i3 != 0) {
                    sb2.append(", ");
                }
                appendValue(sb2, objArr[i3]);
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
        return this.f53003id;
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
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("{ timestampUs: ");
        l10.append(this.timestampUs);
        l10.append(", type: ");
        l10.append(this.type);
        l10.append(", id: ");
        l10.append(this.f53003id);
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
