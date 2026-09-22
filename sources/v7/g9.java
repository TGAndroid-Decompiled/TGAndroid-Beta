package v7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g9 extends a9.o implements ListIterator {
    public final int f44305b;
    public int f44306c;
    public final i9 d;

    public g9(i9 i9Var, int i10) {
        super(6);
        int size = i9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f44305b = size;
            this.f44306c = i10;
            this.d = i9Var;
            return;
        }
        throw new IndexOutOfBoundsException(w7.x7.c(i10, size, "index"));
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
        if (this.f44306c < this.f44305b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f44306c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f44306c;
            this.f44306c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f44306c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f44306c - 1;
            this.f44306c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f44306c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
