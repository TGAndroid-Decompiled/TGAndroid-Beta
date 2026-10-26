package v7;

import a8.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.v;
public final class b extends y implements ListIterator {
    public final int f50085b;
    public int f50086c;
    public final d d;

    public b(d dVar, int i10) {
        super(6);
        int size = dVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f50085b = size;
            this.f50086c = i10;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(v.c(i10, size, "index"));
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
        if (this.f50086c < this.f50085b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f50086c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f50086c;
            this.f50086c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f50086c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f50086c - 1;
            this.f50086c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f50086c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
