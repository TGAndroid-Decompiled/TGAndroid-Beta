package q8;

import j7.xa;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class g extends xa implements SortedMap {
    public SortedSet f46451f;
    public final h0 h;

    public g(h0 h0Var, SortedMap sortedMap) {
        super(h0Var, sortedMap, 2);
        this.h = h0Var;
    }

    public SortedSet b() {
        return new h(this.h, d());
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f46451f;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.f46451f = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f11257b;
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
