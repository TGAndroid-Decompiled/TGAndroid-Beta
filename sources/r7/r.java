package r7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.z6;
public final class r extends a9.o implements ListIterator {
    public final int f43728b;
    public int f43729c;
    public final t d;

    public r(t tVar, int i10) {
        super(3);
        int size = tVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f43728b = size;
            this.f43729c = i10;
            this.d = tVar;
            return;
        }
        throw new IndexOutOfBoundsException(z6.c(i10, size, "index"));
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
        if (this.f43729c < this.f43728b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f43729c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f43729c;
            this.f43729c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f43729c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f43729c - 1;
            this.f43729c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f43729c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
