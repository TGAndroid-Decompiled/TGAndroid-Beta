package rc;

import java.util.LinkedHashMap;
import java.util.Map;
public class w {
    public final String f54505a;
    public final LinkedHashMap f54506b;

    public w(String str) {
        if (d.b(str)) {
            this.f54505a = str;
            this.f54506b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f54505a);
        for (Map.Entry entry : this.f54506b.entrySet()) {
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
