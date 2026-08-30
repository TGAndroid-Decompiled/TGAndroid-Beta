package s8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import l7.xa;
public final class e0 extends k implements Serializable {
    public transient Map d;
    public transient int e;
    public transient d0 f44124f;

    @Override
    public final xa a() {
        xa xaVar;
        xa xaVar2 = this.f44133c;
        if (xaVar2 == null) {
            Map map = this.d;
            if (map instanceof NavigableMap) {
                xaVar = new d(this, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                xaVar = new g(this, (SortedMap) map);
            } else {
                xaVar = new xa(this, map, 2);
            }
            this.f44133c = xaVar;
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
        this.e = 0;
    }
}
