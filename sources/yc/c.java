package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f47058a = new HashMap();
    public final ArrayList f47059b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f47058a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.f47059b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw a4.a.k(it);
    }

    @Override
    public final Iterator iterator() {
        return this.f47058a.keySet().iterator();
    }
}
