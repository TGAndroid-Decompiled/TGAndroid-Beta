package org.webrtc;

import a8.p0;
public class StatsReport {
    public final String f52914id;
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
            return p0.s(sb2, this.value, "]");
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.f52914id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f52914id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i7 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i7 < valueArr.length) {
                sb2.append(valueArr[i7].toString());
                sb2.append(", ");
                i7++;
            } else {
                return sb2.toString();
            }
        }
    }
}
