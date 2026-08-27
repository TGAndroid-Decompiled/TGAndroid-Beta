package p8;

import i7.wa;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b extends i7.d0 {

    public final wa f45526b;

    public b(wa waVar) {
        super(2);
        this.f45526b = waVar;
    }

    @Override
    public final void clear() {
        this.f45526b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f45526b.f10875b.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f45526b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new i7.c(this.f45526b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        h0 h0Var = (h0) this.f45526b.f10877e;
        Object key = entry.getKey();
        Map map = h0Var.d;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        h0Var.f45546e -= size;
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetL = l.l(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetL.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f45526b.keySet().retainAll(hashSetL);
        }
    }

    @Override
    public final int size() {
        return this.f45526b.f10875b.size();
    }
}
