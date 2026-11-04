package t7;

import b8.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class p extends y implements ListIterator {
    public final int f54973b;
    public int f54974c;
    public final r d;

    public p(r rVar, int i3) {
        super(5);
        int size = rVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f54973b = size;
            this.f54974c = i3;
            this.d = rVar;
            return;
        }
        throw new IndexOutOfBoundsException(x7.y.c(i3, size, "index"));
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
        if (this.f54974c < this.f54973b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f54974c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f54974c;
            this.f54974c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f54974c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f54974c - 1;
            this.f54974c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f54974c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
