package z6;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i extends d0 implements ListIterator {
    public final int f50716a;
    public int f50717b;
    public final m f50718c;

    public i(m mVar, int i10) {
        int size = mVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f50716a = size;
            this.f50717b = i10;
            this.f50718c = mVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.f50718c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f50717b < this.f50716a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f50717b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f50717b;
            this.f50717b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f50717b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f50717b - 1;
            this.f50717b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f50717b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
