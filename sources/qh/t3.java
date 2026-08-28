package qh;

import java.util.ArrayList;
import java.util.HashMap;
public final class t3 {
    public String f46723a;
    public boolean f46724b;
    public String f46725c;
    public HashMap d;
    public final ArrayList f46726e = new ArrayList();

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
