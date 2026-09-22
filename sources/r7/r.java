package r7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w7.c7;
public final class r extends a9.o implements ListIterator {
    public final int f42409b;
    public int f42410c;
    public final t d;

    public r(t tVar, int i10) {
        super(3);
        int size = tVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f42409b = size;
            this.f42410c = i10;
            this.d = tVar;
            return;
        }
        throw new IndexOutOfBoundsException(c7.c(i10, size, "index"));
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
        if (this.f42410c < this.f42409b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f42410c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f42410c;
            this.f42410c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f42410c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f42410c - 1;
            this.f42410c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f42410c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
