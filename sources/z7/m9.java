package z7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class m9 extends e9.j2 {
    public final e9.e f51121b;

    public m9(e9.e eVar) {
        super(2);
        this.f51121b = eVar;
    }

    @Override
    public final void clear() {
        this.f51121b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f51121b.f8435b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f51121b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.d(this.f51121b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Object key = entry.getKey();
        d dVar = ((ng) this.f51121b.e).f51136c;
        dVar.getClass();
        try {
            obj2 = dVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            collection.size();
            collection.clear();
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return w7.g9.a(this, collection);
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
                    throw new IllegalArgumentException(i0.a.j(size, "expectedSize cannot be negative but was: "));
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
            ng ngVar = (ng) this.f51121b.e;
            gd gdVar = ngVar.f51122a;
            if (gdVar == null) {
                gdVar = new gd(ngVar, ngVar.f51136c);
                ngVar.f51122a = gdVar;
            }
            return gdVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f51121b.f8435b.size();
    }
}
