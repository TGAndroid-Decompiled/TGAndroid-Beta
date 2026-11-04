package p7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j extends e0 implements ListIterator {
    public final int f53363a;
    public int f53364b;
    public final n f53365c;

    public j(n nVar, int i3) {
        int size = nVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f53363a = size;
            this.f53364b = i3;
            this.f53365c = nVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i3, size, "index"));
    }

    public final Object a(int i3) {
        return this.f53365c.get(i3);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f53364b < this.f53363a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f53364b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f53364b;
            this.f53364b = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f53364b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f53364b - 1;
            this.f53364b = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f53364b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
