package vh;

import java.util.ArrayList;
import java.util.HashMap;
public final class w3 {
    public String f46260a;
    public boolean f46261b;
    public String f46262c;
    public HashMap d;
    public final ArrayList e = new ArrayList();

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
