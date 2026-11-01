package v7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class e9 extends a9.o implements ListIterator {
    public final int f50450b;
    public int f50451c;
    public final g9 d;

    public e9(g9 g9Var, int i10) {
        super(6);
        int size = g9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f50450b = size;
            this.f50451c = i10;
            this.d = g9Var;
            return;
        }
        throw new IndexOutOfBoundsException(w7.h8.c(i10, size, "index"));
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
        if (this.f50451c < this.f50450b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f50451c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f50451c;
            this.f50451c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f50451c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f50451c - 1;
            this.f50451c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f50451c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
