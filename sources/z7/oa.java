package z7;

import b8.mb;
import b8.ra;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class oa extends b8.x {
    public final mb f60002b;

    public oa(mb mbVar) {
        super(2);
        this.f60002b = mbVar;
    }

    @Override
    public final void clear() {
        this.f60002b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f60002b.f2754b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f60002b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ra(this.f60002b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        e eVar = (e) this.f60002b.f2756e;
        Object key = entry.getKey();
        i iVar = eVar.f59849c;
        iVar.getClass();
        try {
            obj2 = iVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            eVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return x7.v6.a(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            boolean z10 = false;
            for (Object obj : collection) {
                z10 |= remove(obj);
            }
            return z10;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int i3;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i3 = size + 1;
                } else {
                    throw new IllegalArgumentException(k2.p1.i(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i3 = (int) Math.ceil(size / 0.75d);
            } else {
                i3 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i3);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            e eVar = (e) this.f60002b.f2756e;
            a aVar = eVar.f59824a;
            if (aVar == null) {
                aVar = new a(eVar, eVar.f59849c);
                eVar.f59824a = aVar;
            }
            return aVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f60002b.f2754b.size();
    }
}
