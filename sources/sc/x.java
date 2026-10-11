package sc;

import java.util.LinkedHashMap;
import java.util.Map;
public class x {
    public final String f48049a;
    public final LinkedHashMap f48050b;

    public x(String str) {
        if (d.b(str)) {
            this.f48049a = str;
            this.f48050b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f48049a);
        for (Map.Entry entry : this.f48050b.entrySet()) {
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
