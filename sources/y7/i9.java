package y7;

import c8.ge;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i9 extends a8.i0 implements ListIterator {
    public final int f60860b;
    public int f60861c;
    public final k9 d;

    public i9(k9 k9Var, int i7) {
        super(9);
        int size = k9Var.size();
        if (i7 >= 0 && i7 <= size) {
            this.f60860b = size;
            this.f60861c = i7;
            this.d = k9Var;
            return;
        }
        throw new IndexOutOfBoundsException(ge.c(i7, size, "index"));
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
        if (this.f60861c < this.f60860b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f60861c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f60861c;
            this.f60861c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f60861c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f60861c - 1;
            this.f60861c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f60861c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
