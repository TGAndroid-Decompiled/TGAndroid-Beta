package zc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f54414a = new HashMap();
    public final ArrayList f54415b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f54414a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.f54415b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw a1.g.k(it);
    }

    @Override
    public final Iterator iterator() {
        return this.f54414a.keySet().iterator();
    }
}
