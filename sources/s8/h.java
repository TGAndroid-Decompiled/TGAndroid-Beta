package s8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class h extends c implements SortedSet {
    public final e0 d;

    public h(e0 e0Var, SortedMap sortedMap) {
        super(e0Var, sortedMap);
        this.d = e0Var;
    }

    @Override
    public final Comparator comparator() {
        return i().comparator();
    }

    @Override
    public final Object first() {
        return i().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new h(this.d, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.f47125b;
    }

    @Override
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new h(this.d, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new h(this.d, i().tailMap(obj));
    }
}
