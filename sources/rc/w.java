package rc;

import java.util.LinkedHashMap;
import java.util.Map;
public class w {
    public final String f56685a;
    public final LinkedHashMap f56686b;

    public w(String str) {
        if (d.b(str)) {
            this.f56685a = str;
            this.f56686b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f56685a);
        for (Map.Entry entry : this.f56686b.entrySet()) {
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
