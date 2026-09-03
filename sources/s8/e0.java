package s8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import l7.xa;
public final class e0 extends k implements Serializable {
    public transient Map d;
    public transient int f47132e;
    public transient d0 f47133f;

    @Override
    public final xa a() {
        xa xaVar;
        xa xaVar2 = this.f47144c;
        if (xaVar2 == null) {
            Map map = this.d;
            if (map instanceof NavigableMap) {
                xaVar = new d(this, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                xaVar = new g(this, (SortedMap) map);
            } else {
                xaVar = new xa(this, map, 2);
            }
            this.f47144c = xaVar;
            return xaVar;
        }
        return xaVar2;
    }

    public final void b() {
        Map map = this.d;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f47132e = 0;
    }
}
