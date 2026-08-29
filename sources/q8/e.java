package q8;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class e extends h implements NavigableSet {
    public final h0 f46446e;

    public e(h0 h0Var, NavigableMap navigableMap) {
        super(h0Var, navigableMap);
        this.f46446e = h0Var;
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
        return new e(this.f46446e, i().descendingMap());
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
        return (NavigableMap) ((SortedMap) this.f46437b);
    }

    @Override
    public final Object pollFirst() {
        j7.c cVar = (j7.c) iterator();
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
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new e(this.f46446e, i().headMap(obj, z10));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new e(this.f46446e, i().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new e(this.f46446e, i().tailMap(obj, z10));
    }
}
