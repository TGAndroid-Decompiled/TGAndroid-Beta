package p8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class x extends x0 implements ListIterator {

    public final int f45599a;

    public int f45600b;

    public final z f45601c;

    public x(z zVar, int i10) {
        int size = zVar.size();
        h7.f0.c(i10, size);
        this.f45599a = size;
        this.f45600b = i10;
        this.f45601c = zVar;
    }

    public final Object a(int i10) {
        return this.f45601c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.f45600b < this.f45599a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f45600b > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f45600b;
        this.f45600b = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f45600b;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f45600b - 1;
        this.f45600b = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f45600b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
