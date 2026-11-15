package y7;

import c8.yd;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i9 extends a8.i0 implements ListIterator {
    public final int f60284b;
    public int f60285c;
    public final k9 d;

    public i9(k9 k9Var, int i7) {
        super(9);
        int size = k9Var.size();
        if (i7 >= 0 && i7 <= size) {
            this.f60284b = size;
            this.f60285c = i7;
            this.d = k9Var;
            return;
        }
        throw new IndexOutOfBoundsException(yd.c(i7, size, "index"));
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
        if (this.f60285c < this.f60284b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f60285c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f60285c;
            this.f60285c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f60285c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f60285c - 1;
            this.f60285c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f60285c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
