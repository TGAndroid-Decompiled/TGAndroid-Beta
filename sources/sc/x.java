package sc;

import java.util.LinkedHashMap;
import java.util.Map;
public class x {
    public final String f48190a;
    public final LinkedHashMap f48191b;

    public x(String str) {
        if (d.b(str)) {
            this.f48190a = str;
            this.f48191b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f48190a);
        for (Map.Entry entry : this.f48191b.entrySet()) {
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
