package q8;

import j7.xa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
public final class h0 extends k implements Serializable {
    public transient Map d;
    public transient int f46453e;
    public transient g0 f46454f;

    @Override
    public final xa a() {
        xa xaVar;
        xa xaVar2 = this.f46461c;
        if (xaVar2 == null) {
            Map map = this.d;
            if (map instanceof NavigableMap) {
                xaVar = new d(this, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                xaVar = new g(this, (SortedMap) map);
            } else {
                xaVar = new xa(this, map, 2);
            }
            this.f46461c = xaVar;
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
        this.f46453e = 0;
    }
}
