package org.webrtc;
public class StatsReport {
    public final String f40889id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.name);
            sb.append(": ");
            return android.support.v4.media.a.r(sb, this.value, "]");
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.f40889id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("id: ");
        sb.append(this.f40889id);
        sb.append(", type: ");
        sb.append(this.type);
        sb.append(", timestamp: ");
        sb.append(this.timestamp);
        sb.append(", values: ");
        int i10 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i10 < valueArr.length) {
                sb.append(valueArr[i10].toString());
                sb.append(", ");
                i10++;
            } else {
                return sb.toString();
            }
        }
    }
}
