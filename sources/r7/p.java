package r7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.b7;
public final class p extends a9.o implements ListIterator {
    public final int f46360b;
    public int f46361c;
    public final r d;

    public p(r rVar, int i10) {
        super(3);
        int size = rVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f46360b = size;
            this.f46361c = i10;
            this.d = rVar;
            return;
        }
        throw new IndexOutOfBoundsException(b7.c(i10, size, "index"));
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
        if (this.f46361c < this.f46360b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f46361c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f46361c;
            this.f46361c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f46361c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f46361c - 1;
            this.f46361c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f46361c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
