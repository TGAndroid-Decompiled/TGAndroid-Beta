package u7;

import a9.o;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.t7;
public final class b extends o implements ListIterator {
    public final int f47571b;
    public int f47572c;
    public final d d;

    public b(d dVar, int i10) {
        super(5);
        int size = dVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f47571b = size;
            this.f47572c = i10;
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
        if (this.f47572c < this.f47571b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f47572c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f47572c;
            this.f47572c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f47572c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f47572c - 1;
            this.f47572c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f47572c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
