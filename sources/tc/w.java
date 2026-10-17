package tc;

import java.util.LinkedHashMap;
import java.util.Map;
public class w {
    public final String f47013a;
    public final LinkedHashMap f47014b;

    public w(String str) {
        if (d.b(str)) {
            this.f47013a = str;
            this.f47014b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f47013a);
        for (Map.Entry entry : this.f47014b.entrySet()) {
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
