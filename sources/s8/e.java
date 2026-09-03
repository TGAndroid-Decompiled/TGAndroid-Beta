package s8;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class e extends h implements NavigableSet {
    public final e0 e;

    public e(e0 e0Var, NavigableMap navigableMap) {
        super(e0Var, navigableMap);
        this.e = e0Var;
    }

    @Override
    public final Object ceiling(Object obj) {
        return i().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((c) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new e(this.e, i().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return i().floorKey(obj);
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return i().higherKey(obj);
    }

    @Override
    public final Object lower(Object obj) {
        return i().lowerKey(obj);
    }

    @Override
    public final NavigableMap i() {
        return (NavigableMap) ((SortedMap) this.f44183b);
    }

    @Override
    public final Object pollFirst() {
        l7.c cVar = (l7.c) iterator();
        if (cVar.hasNext()) {
            Object next = cVar.next();
            cVar.remove();
            return next;
        }
        return null;
    }

    @Override
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z4) {
        return new e(this.e, i().headMap(obj, z4));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z4, Object obj2, boolean z10) {
        return new e(this.e, i().subMap(obj, z4, obj2, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z4) {
        return new e(this.e, i().tailMap(obj, z4));
    }
}
