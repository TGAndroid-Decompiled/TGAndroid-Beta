package q7;

import j$.util.Map;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
public final class r extends n implements NavigableMap, Map {
    public static final r f54017f;
    public final transient z f54018c;
    public final transient m d;
    public final transient r f54019e;

    static {
        z s5 = s.s(v.f54030b);
        i iVar = m.f54001b;
        f54017f = new r(s5, x.f54035e, null);
    }

    public r(z zVar, m mVar, r rVar) {
        this.f54018c = zVar;
        this.d = mVar;
        this.f54019e = rVar;
    }

    public static r c(TreeMap treeMap) {
        boolean equals;
        v vVar = v.f54030b;
        Comparator comparator = treeMap.comparator();
        int i7 = 1;
        if (comparator == null) {
            equals = true;
        } else {
            equals = vVar.equals(comparator);
        }
        Set entrySet = treeMap.entrySet();
        if (entrySet == null) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(n.f54007b);
        int length = entryArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Object[] objArr = new Object[length];
                Object[] objArr2 = new Object[length];
                if (equals) {
                    while (i10 < length) {
                        Map.Entry entry = entryArr[i10];
                        Objects.requireNonNull(entry);
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        a.f(key, value);
                        objArr[i10] = key;
                        objArr2[i10] = value;
                        i10++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new c5.b(5));
                    Map.Entry entry2 = entryArr[0];
                    Objects.requireNonNull(entry2);
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    a.f(objArr[0], value2);
                    while (i7 < length) {
                        Map.Entry entry3 = entryArr[i7 - 1];
                        Objects.requireNonNull(entry3);
                        Map.Entry entry4 = entryArr[i7];
                        Objects.requireNonNull(entry4);
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        a.f(key3, value3);
                        objArr[i7] = key3;
                        objArr2[i7] = value3;
                        if (vVar.compare(key2, key3) != 0) {
                            i7++;
                            key2 = key3;
                        } else {
                            throw new IllegalArgumentException(com.google.android.recaptcha.internal.a.l("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                        }
                    }
                }
                return new r(new z(m.o(length, objArr), vVar), m.o(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i11 = 0; i11 < 1; i11++) {
                if (objArr3[i11] == null) {
                    throw new NullPointerException(jg.g.j(i11, "at index "));
                }
            }
            z zVar = new z(m.o(1, objArr3), vVar);
            Object[] objArr4 = {value4};
            while (i10 < 1) {
                if (objArr4[i10] != null) {
                    i10++;
                } else {
                    throw new NullPointerException(jg.g.j(i10, "at index "));
                }
            }
            return new r(zVar, m.o(1, objArr4), null);
        }
        return d(vVar);
    }

    public static r d(Comparator comparator) {
        if (v.f54030b.equals(comparator)) {
            return f54017f;
        }
        z s5 = s.s(comparator);
        i iVar = m.f54001b;
        return new r(s5, x.f54035e, null);
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override
    public final Comparator comparator() {
        return this.f54018c.d;
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.f54018c.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        w gVar;
        r rVar = this.f54019e;
        if (rVar == null) {
            boolean isEmpty = isEmpty();
            z zVar = this.f54018c;
            if (isEmpty) {
                Comparator comparator = zVar.d;
                if (comparator instanceof w) {
                    gVar = (w) comparator;
                } else {
                    gVar = new g(comparator);
                }
                return d(gVar.a());
            }
            return new r((z) zVar.descendingSet(), this.d.m(), this);
        }
        return rVar;
    }

    @Override
    public final r headMap(Object obj, boolean z9) {
        obj.getClass();
        return h(0, this.f54018c.t(obj, z9));
    }

    @Override
    public final r subMap(Object obj, boolean z9, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f54018c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z10).tailMap(obj, z9);
        }
        throw new IllegalArgumentException(a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().o().get(0);
    }

    @Override
    public final Object firstKey() {
        return this.f54018c.first();
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    @Override
    public final r tailMap(Object obj, boolean z9) {
        obj.getClass();
        return h(this.f54018c.u(obj, z9), this.d.size());
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: q7.r.get(java.lang.Object):java.lang.Object");
    }

    public final r h(int i7, int i10) {
        m mVar = this.d;
        if (i7 == 0) {
            if (i10 != mVar.size()) {
                i7 = 0;
            } else {
                return this;
            }
        }
        z zVar = this.f54018c;
        if (i7 == i10) {
            return d(zVar.d);
        }
        return new r(zVar.v(i7, i10), mVar.subList(i7, i10), null);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override
    public final Set keySet() {
        return this.f54018c;
    }

    @Override
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().o().get(this.d.size() - 1);
    }

    @Override
    public final Object lastKey() {
        return this.f54018c.last();
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return this.f54018c;
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map.Entry pollLastEntry() {
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
