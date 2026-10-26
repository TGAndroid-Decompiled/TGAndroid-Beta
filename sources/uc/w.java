package uc;

import java.util.LinkedHashMap;
import java.util.Map;
public class w {
    public final String f49702a;
    public final LinkedHashMap f49703b;

    public w(String str) {
        if (d.b(str)) {
            this.f49702a = str;
            this.f49703b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f49702a);
        for (Map.Entry entry : this.f49703b.entrySet()) {
            sb2.append("; ");
            sb2.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null && str.length() != 0) {
                sb2.append("=");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
