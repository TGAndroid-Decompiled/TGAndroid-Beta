package p8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class t0 extends AbstractSet {

    public final Set f45589a;

    public final Set f45590b;

    public t0(Set set, Set set2) {
        this.f45589a = set;
        this.f45590b = set2;
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
        return this.f45589a.contains(obj) && this.f45590b.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f45589a.containsAll(collection) && this.f45590b.containsAll(collection);
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f45590b, this.f45589a);
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
        Iterator it = this.f45589a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f45590b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
