package x7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class qa extends e9.j2 {
    public final e9.e f49531b;

    public qa(e9.e eVar) {
        super(1);
        this.f49531b = eVar;
    }

    @Override
    public final void clear() {
        this.f49531b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f49531b.f8433b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f49531b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.d(this.f49531b, (byte) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        f fVar = (f) this.f49531b.e;
        Object key = entry.getKey();
        j jVar = fVar.f49374c;
        jVar.getClass();
        try {
            obj2 = jVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            fVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return w7.l8.a(this, collection);
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
                    throw new IllegalArgumentException(i2.e.j(size, "expectedSize cannot be negative but was: "));
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
            f fVar = (f) this.f49531b.e;
            a aVar = fVar.f49360a;
            if (aVar == null) {
                aVar = new a(fVar, fVar.f49374c);
                fVar.f49360a = aVar;
            }
            return aVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f49531b.f8433b.size();
    }
}
