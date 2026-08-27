package qc;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class a extends kotlin.jvm.internal.a implements ListIterator {
    public final c d;

    public a(c cVar, int i10) {
        super(cVar);
        this.d = cVar;
        int i11 = cVar.i();
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        this.f15241b = i10;
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        return this.f15241b > 0;
    }

    @Override
    public final int nextIndex() {
        return this.f15241b;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15241b - 1;
        this.f15241b = i10;
        return this.d.get(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f15241b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
