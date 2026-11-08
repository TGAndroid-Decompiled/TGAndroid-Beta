package p7;

import a8.i0;
import c8.hb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends i0 implements ListIterator {
    public final int f53483b;
    public int f53484c;
    public final e d;

    public b(e eVar, int i7) {
        super(5);
        int size = eVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f53483b = size;
            this.f53484c = i7;
            this.d = eVar;
            return;
        }
        throw new IndexOutOfBoundsException(hb.c(i7, size, "index"));
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
        if (this.f53484c < this.f53483b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f53484c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f53484c;
            this.f53484c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f53484c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f53484c - 1;
            this.f53484c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f53484c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
