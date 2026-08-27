package rh;

import java.util.ArrayList;
import java.util.HashMap;

public final class u3 {

    public String f47498a;

    public boolean f47499b;

    public String f47500c;
    public HashMap d;

    public final ArrayList f47501e = new ArrayList();

    public final String a(String str) {
        HashMap map = this.d;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public final boolean b(String str) {
        HashMap map = this.d;
        return map != null && map.containsKey(str);
    }
}
