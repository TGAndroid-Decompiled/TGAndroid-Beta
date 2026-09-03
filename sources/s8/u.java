package s8;

import java.util.Iterator;
import java.util.ListIterator;
import k7.c7;
public final class u extends v {
    public final transient int f44221c;
    public final transient int d;
    public final v e;

    public u(v vVar, int i10, int i11) {
        this.e = vVar;
        this.f44221c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        c7.c(i10, this.d);
        return this.e.get(i10 + this.f44221c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final int p() {
        return this.e.q() + this.f44221c + this.d;
    }

    @Override
    public final int q() {
        return this.e.q() + this.f44221c;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override
    public final v subList(int i10, int i11) {
        c7.e(i10, i11, this.d);
        int i12 = this.f44221c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
