package w7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class qa extends a9.o implements ListIterator {
    public final int f43775b;
    public int f43776c;
    public final sa d;

    public qa(sa saVar, int i10) {
        super(7);
        int size = saVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f43775b = size;
            this.f43776c = i10;
            this.d = saVar;
            return;
        }
        throw new IndexOutOfBoundsException(b8.c(i10, size, "index"));
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
        if (this.f43776c < this.f43775b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f43776c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f43776c;
            this.f43776c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f43776c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f43776c - 1;
            this.f43776c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f43776c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
