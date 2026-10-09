package sc;

import java.util.LinkedHashMap;
import java.util.Map;
public class x {
    public final String f47959a;
    public final LinkedHashMap f47960b;

    public x(String str) {
        if (d.b(str)) {
            this.f47959a = str;
            this.f47960b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f47959a);
        for (Map.Entry entry : this.f47960b.entrySet()) {
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
