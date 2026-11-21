package p7;

import a8.i0;
import c8.mb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends i0 implements ListIterator {
    public final int f55518b;
    public int f55519c;
    public final e d;

    public b(e eVar, int i7) {
        super(5);
        int size = eVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f55518b = size;
            this.f55519c = i7;
            this.d = eVar;
            return;
        }
        throw new IndexOutOfBoundsException(mb.c(i7, size, "index"));
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
        if (this.f55519c < this.f55518b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f55519c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f55519c;
            this.f55519c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f55519c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f55519c - 1;
            this.f55519c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f55519c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
