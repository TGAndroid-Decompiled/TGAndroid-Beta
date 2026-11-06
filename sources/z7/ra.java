package z7;

import c8.he;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class ra extends a8.i0 implements ListIterator {
    public final int f59815b;
    public int f59816c;
    public final ta d;

    public ra(ta taVar, int i7) {
        super(10);
        int size = taVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f59815b = size;
            this.f59816c = i7;
            this.d = taVar;
            return;
        }
        throw new IndexOutOfBoundsException(he.c(i7, size, "index"));
    }

    public final Object a(int i7) {
        return this.d.get(i7);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f59816c < this.f59815b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f59816c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f59816c;
            this.f59816c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f59816c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f59816c - 1;
            this.f59816c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f59816c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
