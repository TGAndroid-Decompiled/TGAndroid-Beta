package q7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class s extends o implements NavigableSet, c0, SortedSet {
    public final transient Comparator d;
    public transient s f54020e;

    public s(Comparator comparator) {
        this.d = comparator;
    }

    public static z s(Comparator comparator) {
        if (v.f54029b.equals(comparator)) {
            return z.h;
        }
        i iVar = m.f54000b;
        return new z(x.f54034e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Comparator comparator() {
        return this.d;
    }

    @Override
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.v(0, zVar.t(obj, false));
    }

    @Override
    public abstract Object last();

    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final s descendingSet() {
        z zVar = this.f54020e;
        if (zVar == null) {
            z zVar2 = (z) this;
            Comparator reverseOrder = Collections.reverseOrder(zVar2.d);
            if (zVar2.isEmpty()) {
                zVar = s(reverseOrder);
            } else {
                zVar = new z(zVar2.f54042f.m(), reverseOrder);
            }
            this.f54020e = zVar;
            zVar.f54020e = this;
        }
        return zVar;
    }

    @Override
    public final z subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            z zVar = (z) this;
            z v = zVar.v(zVar.u(obj, z9), zVar.f54042f.size());
            return v.v(0, v.t(obj2, z10));
        }
        throw new IllegalArgumentException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.v(zVar.u(obj, true), zVar.f54042f.size());
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z9) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.v(0, zVar.t(obj, z9));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z9) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.v(zVar.u(obj, z9), zVar.f54042f.size());
    }
}
