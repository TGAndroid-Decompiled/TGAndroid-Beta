package t7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.m7;
public final class b extends a9.o implements ListIterator {
    public final int f46907b;
    public int f46908c;
    public final d d;

    public b(d dVar, int i10) {
        super(4);
        int size = dVar.size();
        m7.b(i10, size);
        this.f46907b = size;
        this.f46908c = i10;
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
        if (this.f46908c < this.f46907b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f46908c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f46908c;
            this.f46908c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f46908c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f46908c - 1;
            this.f46908c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f46908c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
