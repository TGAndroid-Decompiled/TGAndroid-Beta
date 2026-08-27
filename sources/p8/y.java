package p8;

import java.util.Iterator;
import java.util.ListIterator;

public final class y extends z {

    public final transient int f45602c;
    public final transient int d;

    public final z f45603e;

    public y(z zVar, int i10, int i11) {
        this.f45603e = zVar;
        this.f45602c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        h7.f0.b(i10, this.d);
        return this.f45603e.get(i10 + this.f45602c);
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
        return this.f45603e.o();
    }

    @Override
    public final int p() {
        return this.f45603e.q() + this.f45602c + this.d;
    }

    @Override
    public final int q() {
        return this.f45603e.q() + this.f45602c;
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
    public final z subList(int i10, int i11) {
        h7.f0.d(i10, i11, this.d);
        int i12 = this.f45602c;
        return this.f45603e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
