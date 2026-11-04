package x7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g9 extends b8.y implements ListIterator {
    public final int f58304b;
    public int f58305c;
    public final i9 d;

    public g9(i9 i9Var, int i3) {
        super(8);
        int size = i9Var.size();
        if (i3 >= 0 && i3 <= size) {
            this.f58304b = size;
            this.f58305c = i3;
            this.d = i9Var;
            return;
        }
        throw new IndexOutOfBoundsException(w5.c(i3, size, "index"));
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
        if (this.f58305c < this.f58304b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f58305c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f58305c;
            this.f58305c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f58305c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f58305c - 1;
            this.f58305c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f58305c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
