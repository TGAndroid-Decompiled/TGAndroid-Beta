package p7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class t extends p implements NavigableSet, d0, SortedSet {
    public final transient Comparator d;
    public transient t f53403e;

    public t(Comparator comparator) {
        this.d = comparator;
    }

    public static a0 s(Comparator comparator) {
        if (w.f53412b.equals(comparator)) {
            return a0.h;
        }
        j jVar = n.f53383b;
        return new a0(y.f53417e, comparator);
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
        a0 a0Var = (a0) this;
        return a0Var.v(0, a0Var.t(obj, false));
    }

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
    public final t descendingSet() {
        a0 a0Var = this.f53403e;
        if (a0Var == null) {
            a0 a0Var2 = (a0) this;
            Comparator reverseOrder = Collections.reverseOrder(a0Var2.d);
            if (a0Var2.isEmpty()) {
                a0Var = s(reverseOrder);
            } else {
                a0Var = new a0(a0Var2.f53338f.m(), reverseOrder);
            }
            this.f53403e = a0Var;
            a0Var.f53403e = this;
        }
        return a0Var;
    }

    @Override
    public final a0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            a0 a0Var = (a0) this;
            a0 v = a0Var.v(a0Var.u(obj, z10), a0Var.f53338f.size());
            return v.v(0, v.t(obj2, z11));
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
        a0 a0Var = (a0) this;
        return a0Var.v(a0Var.u(obj, true), a0Var.f53338f.size());
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.v(0, a0Var.t(obj, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.v(a0Var.u(obj, z10), a0Var.f53338f.size());
    }
}
