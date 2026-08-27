package y6;

import j$.util.Map;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class r extends n implements NavigableMap, Map {

    public static final r f49769f;

    public final transient z f49770c;
    public final transient m d;

    public final transient r f49771e;

    static {
        z zVarX = s.x(v.f49782b);
        i iVar = m.f49753b;
        f49769f = new r(zVarX, x.f49787e, null);
    }

    public r(z zVar, m mVar, r rVar) {
        this.f49770c = zVar;
        this.d = mVar;
        this.f49771e = rVar;
    }

    public static r b(TreeMap treeMap) {
        v vVar = v.f49782b;
        Comparator comparator = treeMap.comparator();
        int i10 = 1;
        boolean zEquals = comparator == null ? true : vVar.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        if (collectionEntrySet == null) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        java.util.Map.Entry[] entryArr = (java.util.Map.Entry[]) collectionEntrySet.toArray(n.f49759b);
        int length = entryArr.length;
        if (length == 0) {
            return c(vVar);
        }
        int i11 = 0;
        if (length == 1) {
            java.util.Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i12 = 0; i12 < 1; i12++) {
                if (objArr[i12] == null) {
                    throw new NullPointerException(i0.a.k(i12, "at index "));
                }
            }
            z zVar = new z(m.t(1, objArr), vVar);
            Object[] objArr2 = {value};
            while (i11 < 1) {
                if (objArr2[i11] == null) {
                    throw new NullPointerException(i0.a.k(i11, "at index "));
                }
                i11++;
            }
            return new r(zVar, m.t(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i11 < length) {
                java.util.Map.Entry entry2 = entryArr[i11];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                a.f(key2, value2);
                objArr3[i11] = key2;
                objArr4[i11] = value2;
                i11++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new d2.a(7));
            java.util.Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            a.f(objArr3[0], value3);
            while (i10 < length) {
                java.util.Map.Entry entry4 = entryArr[i10 - 1];
                Objects.requireNonNull(entry4);
                java.util.Map.Entry entry5 = entryArr[i10];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                a.f(key4, value4);
                objArr3[i10] = key4;
                objArr4[i10] = value4;
                if (vVar.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(i0.a.n("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i10++;
                key3 = key4;
            }
        }
        return new r(new z(m.t(length, objArr3), vVar), m.t(length, objArr4), null);
    }

    public static r c(Comparator comparator) {
        if (v.f49782b.equals(comparator)) {
            return f49769f;
        }
        z zVarX = s.x(comparator);
        i iVar = m.f49753b;
        return new r(zVarX, x.f49787e, null);
    }

    @Override
    public final java.util.Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object obj) {
        java.util.Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override
    public final Comparator comparator() {
        return this.f49770c.d;
    }

    @Override
    public final r headMap(Object obj, boolean z10) {
        obj.getClass();
        return g(0, this.f49770c.y(obj, z10));
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.f49770c.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        r rVar = this.f49771e;
        if (rVar != null) {
            return rVar;
        }
        boolean zIsEmpty = isEmpty();
        z zVar = this.f49770c;
        if (!zIsEmpty) {
            return new r((z) zVar.descendingSet(), this.d.r(), this);
        }
        Comparator comparator = zVar.d;
        return c((comparator instanceof w ? (w) comparator : new g(comparator)).a());
    }

    @Override
    public final r subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f49770c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final r tailMap(Object obj, boolean z10) {
        obj.getClass();
        return g(this.f49770c.z(obj, z10), this.d.size());
    }

    @Override
    public final java.util.Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().t().get(0);
    }

    @Override
    public final Object firstKey() {
        return this.f49770c.first();
    }

    @Override
    public final java.util.Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object obj) {
        java.util.Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    public final r g(int i10, int i11) {
        m mVar = this.d;
        if (i10 == 0) {
            if (i11 == mVar.size()) {
                return this;
            }
            i10 = 0;
        }
        z zVar = this.f49770c;
        return i10 == i11 ? c(zVar.d) : new r(zVar.A(i10, i11), mVar.subList(i10, i11), null);
    }

    @Override
    public final Object get(Object obj) {
        int iBinarySearch;
        z zVar = this.f49770c;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(zVar.f49795f, obj, zVar.d);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.d.get(iBinarySearch);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final java.util.Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object obj) {
        java.util.Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override
    public final Set keySet() {
        return this.f49770c;
    }

    @Override
    public final java.util.Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().t().get(this.d.size() - 1);
    }

    @Override
    public final Object lastKey() {
        return this.f49770c.last();
    }

    @Override
    public final java.util.Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object obj) {
        java.util.Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return this.f49770c;
    }

    @Override
    public final java.util.Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final java.util.Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.d.size();
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
    public final Collection values() {
        return this.d;
    }
}
