package y7;

import c8.xd;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j9 extends a8.i0 implements ListIterator {
    public final int f58957b;
    public int f58958c;
    public final l9 d;

    public j9(l9 l9Var, int i7) {
        super(9);
        int size = l9Var.size();
        if (i7 >= 0 && i7 <= size) {
            this.f58957b = size;
            this.f58958c = i7;
            this.d = l9Var;
            return;
        }
        throw new IndexOutOfBoundsException(xd.c(i7, size, "index"));
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
        if (this.f58958c < this.f58957b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f58958c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f58958c;
            this.f58958c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f58958c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f58958c - 1;
            this.f58958c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f58958c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
