package u7;

import a8.i0;
import c8.pc;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class p extends i0 implements ListIterator {
    public final int f56269b;
    public int f56270c;
    public final r d;

    public p(r rVar, int i7) {
        super(6);
        int size = rVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f56269b = size;
            this.f56270c = i7;
            this.d = rVar;
            return;
        }
        throw new IndexOutOfBoundsException(pc.c(i7, size, "index"));
    }

    public final Object a(int i7) {
        return this.d.get(i7);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f56270c < this.f56269b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f56270c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f56270c;
            this.f56270c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f56270c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f56270c - 1;
            this.f56270c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f56270c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
