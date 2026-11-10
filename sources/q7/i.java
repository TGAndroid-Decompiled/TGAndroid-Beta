package q7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i extends d0 implements ListIterator {
    public final int f53992a;
    public int f53993b;
    public final m f53994c;

    public i(m mVar, int i7) {
        int size = mVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f53992a = size;
            this.f53993b = i7;
            this.f53994c = mVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i7, size, "index"));
    }

    public final Object a(int i7) {
        return this.f53994c.get(i7);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f53993b < this.f53992a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f53993b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f53993b;
            this.f53993b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f53993b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f53993b - 1;
            this.f53993b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f53993b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
