package t7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.m7;
public final class b extends a9.o implements ListIterator {
    public final int f43314b;
    public int f43315c;
    public final d d;

    public b(d dVar, int i10) {
        super(4);
        int size = dVar.size();
        m7.b(i10, size);
        this.f43314b = size;
        this.f43315c = i10;
        this.d = dVar;
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
        if (this.f43315c < this.f43314b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f43315c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f43315c;
            this.f43315c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f43315c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f43315c - 1;
            this.f43315c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f43315c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
