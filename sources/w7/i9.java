package w7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i9 extends a8.y implements ListIterator {
    public final int f50886b;
    public int f50887c;
    public final k9 d;

    public i9(k9 k9Var, int i10) {
        super(7);
        int size = k9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f50886b = size;
            this.f50887c = i10;
            this.d = k9Var;
            return;
        }
        throw new IndexOutOfBoundsException(y.c(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f50887c < this.f50886b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f50887c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f50887c;
            this.f50887c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f50887c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f50887c - 1;
            this.f50887c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f50887c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
