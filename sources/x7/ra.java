package x7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class ra extends a8.y implements ListIterator {
    public final int f51626b;
    public int f51627c;
    public final ta d;

    public ra(ta taVar, int i10) {
        super(8);
        int size = taVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f51626b = size;
            this.f51627c = i10;
            this.d = taVar;
            return;
        }
        throw new IndexOutOfBoundsException(w7.b0.c(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f51627c < this.f51626b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f51627c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f51627c;
            this.f51627c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f51627c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f51627c - 1;
            this.f51627c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f51627c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
