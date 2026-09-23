package z7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class l9 extends e9.l1 {
    public final e9.d f48480b;

    public l9(e9.d dVar) {
        super(2);
        this.f48480b = dVar;
    }

    @Override
    public final void clear() {
        this.f48480b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f48480b.f8047b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f48480b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.c(this.f48480b, (char) 0);
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
        d dVar = ((lg) this.f48480b.e).f48481c;
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
                return w7.h9.a(this, collection);
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
                    throw new IllegalArgumentException(hg.c.i(size, "expectedSize cannot be negative but was: "));
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
            lg lgVar = (lg) this.f48480b.e;
            ed edVar = lgVar.f48471a;
            if (edVar == null) {
                edVar = new ed(lgVar, lgVar.f48481c);
                lgVar.f48471a = edVar;
            }
            return edVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f48480b.f8047b.size();
    }
}
