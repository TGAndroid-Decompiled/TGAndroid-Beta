package s7;

import a8.bg;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class r extends a8.y implements ListIterator {
    public final int f47923b;
    public int f47924c;
    public final t d;

    public r(t tVar, int i10) {
        super(4);
        int size = tVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f47923b = size;
            this.f47924c = i10;
            this.d = tVar;
            return;
        }
        throw new IndexOutOfBoundsException(bg.c(i10, size, "index"));
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
        if (this.f47924c < this.f47923b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f47924c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f47924c;
            this.f47924c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f47924c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f47924c - 1;
            this.f47924c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f47924c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
