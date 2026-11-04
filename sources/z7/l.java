package z7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class l extends b8.y implements ListIterator {
    public final int f59933b;
    public int f59934c;
    public final n d;

    public l(n nVar, int i3) {
        super(10);
        int size = nVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f59933b = size;
            this.f59934c = i3;
            this.d = nVar;
            return;
        }
        throw new IndexOutOfBoundsException(x7.x6.c(i3, size, "index"));
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
        if (this.f59934c < this.f59933b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f59934c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f59934c;
            this.f59934c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f59934c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f59934c - 1;
            this.f59934c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f59934c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
