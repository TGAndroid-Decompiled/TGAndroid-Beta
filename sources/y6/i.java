package y6;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class i extends d0 implements ListIterator {

    public final int f49733a;

    public int f49734b;

    public final m f49735c;

    public i(m mVar, int i10) {
        int size = mVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(a.n(i10, size, "index"));
        }
        this.f49733a = size;
        this.f49734b = i10;
        this.f49735c = mVar;
    }

    public final Object a(int i10) {
        return this.f49735c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.f49734b < this.f49733a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f49734b > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f49734b;
        this.f49734b = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f49734b;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f49734b - 1;
        this.f49734b = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f49734b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
