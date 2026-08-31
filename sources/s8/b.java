package s8;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l7.xa;
public final class b extends l7.d0 {
    public final xa f47091b;

    public b(xa xaVar) {
        super(2);
        this.f47091b = xaVar;
    }

    @Override
    public final void clear() {
        this.f47091b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f47091b.f12098b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f47091b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new l7.c(this.f47091b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        e0 e0Var = (e0) this.f47091b.f12100e;
        Object key = entry.getKey();
        Map map = e0Var.d;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            e0Var.f47101e -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            boolean z4 = false;
            for (Object obj : collection) {
                z4 |= remove(obj);
            }
            return z4;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(l.a(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f47091b.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f47091b.f12098b.size();
    }
}
