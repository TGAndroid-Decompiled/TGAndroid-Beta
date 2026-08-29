package q8;

import i7.p6;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class x extends x0 implements ListIterator {
    public final int f46506a;
    public int f46507b;
    public final z f46508c;

    public x(z zVar, int i10) {
        int size = zVar.size();
        p6.c(i10, size);
        this.f46506a = size;
        this.f46507b = i10;
        this.f46508c = zVar;
    }

    public final Object a(int i10) {
        return this.f46508c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f46507b < this.f46506a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f46507b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f46507b;
            this.f46507b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f46507b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f46507b - 1;
            this.f46507b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f46507b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
