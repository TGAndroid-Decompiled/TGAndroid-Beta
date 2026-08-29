package q8;

import i7.p6;
import java.util.Iterator;
import java.util.ListIterator;
public final class y extends z {
    public final transient int f46509c;
    public final transient int d;
    public final z f46510e;

    public y(z zVar, int i10, int i11) {
        this.f46510e = zVar;
        this.f46509c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        p6.b(i10, this.d);
        return this.f46510e.get(i10 + this.f46509c);
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
        return this.f46510e.o();
    }

    @Override
    public final int p() {
        return this.f46510e.q() + this.f46509c + this.d;
    }

    @Override
    public final int q() {
        return this.f46510e.q() + this.f46509c;
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
        p6.d(i10, i11, this.d);
        int i12 = this.f46509c;
        return this.f46510e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
