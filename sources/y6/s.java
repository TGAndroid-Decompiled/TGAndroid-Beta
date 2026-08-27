package y6;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

public abstract class s extends o implements NavigableSet, c0, SortedSet {
    public final transient Comparator d;

    public transient s f49773e;

    public s(Comparator comparator) {
        this.d = comparator;
    }

    public static z x(Comparator comparator) {
        if (v.f49782b.equals(comparator)) {
            return z.h;
        }
        i iVar = m.f49753b;
        return new z(x.f49787e, comparator);
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
        return zVar.A(0, zVar.y(obj, false));
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
        return zVar.A(zVar.z(obj, true), zVar.f49795f.size());
    }

    @Override
    public final s descendingSet() {
        s sVarX = this.f49773e;
        if (sVarX == null) {
            z zVar = (z) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(zVar.d);
            sVarX = zVar.isEmpty() ? x(comparatorReverseOrder) : new z(zVar.f49795f.r(), comparatorReverseOrder);
            this.f49773e = sVarX;
            sVarX.f49773e = this;
        }
        return sVarX;
    }

    @Override
    public final z subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        z zVar = (z) this;
        z zVarA = zVar.A(zVar.z(obj, z10), zVar.f49795f.size());
        return zVarA.A(0, zVarA.y(obj2, z11));
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(0, zVar.y(obj, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(zVar.z(obj, z10), zVar.f49795f.size());
    }
}
