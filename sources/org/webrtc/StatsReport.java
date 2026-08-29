package org.webrtc;
public class StatsReport {
    public final String f45362id;
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
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.name);
            sb2.append(": ");
            return a4.w.q(sb2, this.value, "]");
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.f45362id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f45362id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i10 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i10 < valueArr.length) {
                sb2.append(valueArr[i10].toString());
                sb2.append(", ");
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }
}
