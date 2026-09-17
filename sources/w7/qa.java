package w7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class qa extends a9.o implements ListIterator {
    public final int f44838b;
    public int f44839c;
    public final sa d;

    public qa(sa saVar, int i10) {
        super(7);
        int size = saVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f44838b = size;
            this.f44839c = i10;
            this.d = saVar;
            return;
        }
        throw new IndexOutOfBoundsException(a8.c(i10, size, "index"));
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
        if (this.f44839c < this.f44838b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f44839c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f44839c;
            this.f44839c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f44839c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f44839c - 1;
            this.f44839c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f44839c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
