package v7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class f9 extends a9.o implements ListIterator {
    public final int f47475b;
    public int f47476c;
    public final h9 d;

    public f9(h9 h9Var, int i10) {
        super(6);
        int size = h9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f47475b = size;
            this.f47476c = i10;
            this.d = h9Var;
            return;
        }
        throw new IndexOutOfBoundsException(w7.w7.c(i10, size, "index"));
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
        if (this.f47476c < this.f47475b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f47476c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f47476c;
            this.f47476c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f47476c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f47476c - 1;
            this.f47476c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f47476c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
