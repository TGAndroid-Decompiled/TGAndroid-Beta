package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f50829a = new HashMap();
    public final ArrayList f50830b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f50829a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.f50830b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw a4.a.k(it);
    }

    @Override
    public final Iterator iterator() {
        return this.f50829a.keySet().iterator();
    }
}
