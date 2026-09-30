package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f46952a = new HashMap();
    public final ArrayList f46953b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f46952a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.f46953b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw a4.a.k(it);
    }

    @Override
    public final Iterator iterator() {
        return this.f46952a.keySet().iterator();
    }
}
