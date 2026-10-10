package x7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class m extends a9.o implements ListIterator {
    public final int f50889b;
    public int f50890c;
    public final o d;

    public m(o oVar, int i10) {
        super(8);
        int size = oVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f50889b = size;
            this.f50890c = i10;
            this.d = oVar;
            return;
        }
        throw new IndexOutOfBoundsException(w7.m8.c(i10, size, "index"));
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
        if (this.f50890c < this.f50889b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f50890c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f50890c;
            this.f50890c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f50890c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f50890c - 1;
            this.f50890c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f50890c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
