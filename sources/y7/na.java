package y7;

import a8.pb;
import a8.ta;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class na extends a8.x {
    public final pb f52251b;

    public na(pb pbVar) {
        super(2);
        this.f52251b = pbVar;
    }

    @Override
    public final void clear() {
        this.f52251b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f52251b.f739b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f52251b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ta(this.f52251b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        e eVar = (e) this.f52251b.e;
        Object key = entry.getKey();
        i iVar = eVar.f52121c;
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
                return w7.f5.a(this, collection);
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
        int i10;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i10 = size + 1;
                } else {
                    throw new IllegalArgumentException(ic.a.i(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i10 = (int) Math.ceil(size / 0.75d);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            e eVar = (e) this.f52251b.e;
            a aVar = eVar.f52104a;
            if (aVar == null) {
                aVar = new a(eVar, eVar.f52121c);
                eVar.f52104a = aVar;
            }
            return aVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f52251b.f739b.size();
    }
}
