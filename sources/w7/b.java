package w7;

import b8.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import x7.o5;
public final class b extends y implements ListIterator {
    public final int f57404b;
    public int f57405c;
    public final d d;

    public b(d dVar, int i3) {
        super(7);
        int size = dVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f57404b = size;
            this.f57405c = i3;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(o5.c(i3, size, "index"));
    }

    public final Object a(int i3) {
        return this.d.get(i3);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f57405c < this.f57404b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f57405c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f57405c;
            this.f57405c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f57405c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f57405c - 1;
            this.f57405c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f57405c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
