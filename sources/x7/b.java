package x7;

import a8.i0;
import c8.ld;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends i0 implements ListIterator {
    public final int f58552b;
    public int f58553c;
    public final d d;

    public b(d dVar, int i7) {
        super(8);
        int size = dVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f58552b = size;
            this.f58553c = i7;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(ld.c(i7, size, "index"));
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
        if (this.f58553c < this.f58552b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f58553c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f58553c;
            this.f58553c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f58553c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f58553c - 1;
            this.f58553c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f58553c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
