package u7;

import a9.o;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.t7;
public final class b extends o implements ListIterator {
    public final int f49094b;
    public int f49095c;
    public final d d;

    public b(d dVar, int i10) {
        super(5);
        int size = dVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f49094b = size;
            this.f49095c = i10;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(t7.c(i10, size, "index"));
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
        if (this.f49095c < this.f49094b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f49095c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f49095c;
            this.f49095c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f49095c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f49095c - 1;
            this.f49095c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f49095c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
