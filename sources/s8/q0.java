package s8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class q0 extends AbstractSet {
    public final Set f44147a;
    public final Set f44148b;

    public q0(Set set, Set set2) {
        this.f44147a = set;
        this.f44148b = set2;
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
        if (this.f44147a.contains(obj) && this.f44148b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f44147a.containsAll(collection) && this.f44148b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f44148b, this.f44147a);
    }

    @Override
    public final Iterator iterator() {
        return new a0(this);
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
        for (Object obj : this.f44147a) {
            if (this.f44148b.contains(obj)) {
                i10++;
            }
        }
        return i10;
    }
}
