package wh;

import java.util.ArrayList;
import java.util.HashMap;
public final class w3 {
    public String f50131a;
    public boolean f50132b;
    public String f50133c;
    public HashMap d;
    public final ArrayList f50134e = new ArrayList();

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
