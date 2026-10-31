package w7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class oa extends a9.o implements ListIterator {
    public final int f52667b;
    public int f52668c;
    public final qa d;

    public oa(qa qaVar, int i10) {
        super(7);
        int size = qaVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f52667b = size;
            this.f52668c = i10;
            this.d = qaVar;
            return;
        }
        throw new IndexOutOfBoundsException(n8.c(i10, size, "index"));
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
        if (this.f52668c < this.f52667b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f52668c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f52668c;
            this.f52668c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f52668c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f52668c - 1;
            this.f52668c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f52668c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
