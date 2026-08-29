package th;

import java.util.ArrayList;
import java.util.HashMap;
public final class u3 {
    public String f48796a;
    public boolean f48797b;
    public String f48798c;
    public HashMap d;
    public final ArrayList f48799e = new ArrayList();

    public final String a(String str) {
        HashMap hashMap = this.d;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get(str);
    }

    public final boolean b(String str) {
        HashMap hashMap = this.d;
        if (hashMap != null && hashMap.containsKey(str)) {
            return true;
        }
        return false;
    }
}
