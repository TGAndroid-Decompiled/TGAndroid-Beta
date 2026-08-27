package p8;

import i7.wa;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class d extends g implements NavigableMap {

    public final h0 f45534n;

    public d(h0 h0Var, NavigableMap navigableMap) {
        super(h0Var, navigableMap);
        this.f45534n = h0Var;
    }

    @Override
    public final SortedSet b() {
        return new e(this.f45534n, d());
    }

    @Override
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableMap descendingMap() {
        return new d(this.f45534n, d().descendingMap());
    }

    public final v e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f45534n.f45547f.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new v(entry.getKey(), DesugarCollections.unmodifiableList(list));
    }

    @Override
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f10875b);
    }

    @Override
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return e(((b) entrySet()).iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return e(((b) ((wa) descendingMap()).entrySet()).iterator());
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new d(this.f45534n, d().headMap(obj, z10));
    }

    @Override
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new d(this.f45534n, d().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new d(this.f45534n, d().tailMap(obj, z10));
    }
}
