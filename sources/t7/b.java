package t7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.o7;
public final class b extends a9.o implements ListIterator {
    public final int f48203b;
    public int f48204c;
    public final d d;

    public b(d dVar, int i10) {
        super(4);
        int size = dVar.size();
        o7.b(i10, size);
        this.f48203b = size;
        this.f48204c = i10;
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
        if (this.f48204c < this.f48203b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f48204c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f48204c;
            this.f48204c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f48204c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f48204c - 1;
            this.f48204c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f48204c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
