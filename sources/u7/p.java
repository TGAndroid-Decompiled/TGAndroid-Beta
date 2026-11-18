package u7;

import a8.i0;
import c8.tc;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class p extends i0 implements ListIterator {
    public final int f58459b;
    public int f58460c;
    public final r d;

    public p(r rVar, int i7) {
        super(6);
        int size = rVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f58459b = size;
            this.f58460c = i7;
            this.d = rVar;
            return;
        }
        throw new IndexOutOfBoundsException(tc.c(i7, size, "index"));
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
        if (this.f58460c < this.f58459b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f58460c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f58460c;
            this.f58460c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f58460c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f58460c - 1;
            this.f58460c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f58460c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
