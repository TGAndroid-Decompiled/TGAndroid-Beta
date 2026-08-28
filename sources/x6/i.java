package x6;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i extends d0 implements ListIterator {
    public final int f49016a;
    public int f49017b;
    public final m f49018c;

    public i(m mVar, int i9) {
        int size = mVar.size();
        if (i9 >= 0 && i9 <= size) {
            this.f49016a = size;
            this.f49017b = i9;
            this.f49018c = mVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i9, size, "index"));
    }

    public final Object a(int i9) {
        return this.f49018c.get(i9);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f49017b < this.f49016a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f49017b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f49017b;
            this.f49017b = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f49017b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f49017b - 1;
            this.f49017b = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f49017b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
