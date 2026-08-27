package p8;

import i7.wa;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class g extends wa implements SortedMap {

    public SortedSet f45544f;
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
        SortedSet sortedSet = this.f45544f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f45544f = sortedSetB;
        return sortedSetB;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f10875b;
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
