package wh;

import java.util.ArrayList;
import java.util.HashMap;
public final class w3 {
    public String f50168a;
    public boolean f50169b;
    public String f50170c;
    public HashMap d;
    public final ArrayList f50171e = new ArrayList();

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
