package sc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f48149a = new HashMap();
    public final ArrayList f48150b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f48149a.put(split[0], split[1]);
                }
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f48149a.keySet().iterator();
    }

    public final void l() {
        Iterator it = this.f48150b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw a1.g.h(it);
    }
}
