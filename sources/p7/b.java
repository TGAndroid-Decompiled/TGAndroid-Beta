package p7;

import a8.i0;
import c8.cb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends i0 implements ListIterator {
    public final int f53366b;
    public int f53367c;
    public final e d;

    public b(e eVar, int i7) {
        super(5);
        int size = eVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f53366b = size;
            this.f53367c = i7;
            this.d = eVar;
            return;
        }
        throw new IndexOutOfBoundsException(cb.c(i7, size, "index"));
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
        if (this.f53367c < this.f53366b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f53367c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f53367c;
            this.f53367c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f53367c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f53367c - 1;
            this.f53367c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f53367c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
