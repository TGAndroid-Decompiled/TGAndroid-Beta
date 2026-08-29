package q8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class t0 extends AbstractSet {
    public final Set f46496a;
    public final Set f46497b;

    public t0(Set set, Set set2) {
        this.f46496a = set;
        this.f46497b = set2;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f46496a.contains(obj) && this.f46497b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f46496a.containsAll(collection) && this.f46497b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f46497b, this.f46496a);
    }

    @Override
    public final Iterator iterator() {
        return new d0(this);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f46496a) {
            if (this.f46497b.contains(obj)) {
                i10++;
            }
        }
        return i10;
    }
}
