package u7;

import a8.i0;
import c8.qc;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class q extends i0 implements ListIterator {
    public final int f57893b;
    public int f57894c;
    public final s d;

    public q(s sVar, int i7) {
        super(6);
        int size = sVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f57893b = size;
            this.f57894c = i7;
            this.d = sVar;
            return;
        }
        throw new IndexOutOfBoundsException(qc.c(i7, size, "index"));
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
        if (this.f57894c < this.f57893b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f57894c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f57894c;
            this.f57894c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f57894c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f57894c - 1;
            this.f57894c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f57894c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
