package s8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import l7.xa;
public class g extends xa implements SortedMap {
    public SortedSet f47103f;
    public final e0 h;

    public g(e0 e0Var, SortedMap sortedMap) {
        super(e0Var, sortedMap, 2);
        this.h = e0Var;
    }

    public SortedSet b() {
        return new h(this.h, d());
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f47103f;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.f47103f = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f12098b;
    }

    @Override
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new g(this.h, d().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new g(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new g(this.h, d().tailMap(obj));
    }
}
