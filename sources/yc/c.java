package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f59369a = new HashMap();
    public final ArrayList f59370b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f59369a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void f() {
        Iterator it = this.f59370b.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public final Iterator iterator() {
        return this.f59369a.keySet().iterator();
    }
}
