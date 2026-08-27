package p8;

import i7.wa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

public final class h0 extends k implements Serializable {
    public transient Map d;

    public transient int f45546e;

    public transient g0 f45547f;

    @Override
    public final wa a() {
        wa gVar;
        wa waVar = this.f45554c;
        if (waVar != null) {
            return waVar;
        }
        Map map = this.d;
        if (map instanceof NavigableMap) {
            gVar = new d(this, (NavigableMap) map);
        } else {
            gVar = map instanceof SortedMap ? new g(this, (SortedMap) map) : new wa(this, map, 2);
        }
        this.f45554c = gVar;
        return gVar;
    }

    public final void b() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f45546e = 0;
    }
}
