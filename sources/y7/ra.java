package y7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class ra extends b8.y implements ListIterator {
    public final int f59263b;
    public int f59264c;
    public final ta d;

    public ra(ta taVar, int i3) {
        super(9);
        int size = taVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f59263b = size;
            this.f59264c = i3;
            this.d = taVar;
            return;
        }
        throw new IndexOutOfBoundsException(x7.h6.c(i3, size, "index"));
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
        if (this.f59264c < this.f59263b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f59264c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f59264c;
            this.f59264c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f59264c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f59264c - 1;
            this.f59264c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f59264c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
