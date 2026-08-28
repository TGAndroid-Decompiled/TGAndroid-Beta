package pc;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class a extends kc.b implements ListIterator {
    public final c d;

    public a(c cVar, int i9) {
        super(cVar);
        this.d = cVar;
        int i10 = cVar.i();
        if (i9 >= 0 && i9 <= i10) {
            this.f14754b = i9;
            return;
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f14754b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int nextIndex() {
        return this.f14754b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f14754b - 1;
            this.f14754b = i9;
            return this.d.get(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f14754b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
