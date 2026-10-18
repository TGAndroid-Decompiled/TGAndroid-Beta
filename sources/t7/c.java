package t7;

import w7.p7;
public final class c extends d {
    public final transient int f46877c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f46877c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        p7.a(i10, this.d);
        return this.e.get(i10 + this.f46877c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f46877c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f46877c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final d subList(int i10, int i11) {
        p7.c(i10, i11, this.d);
        int i12 = this.f46877c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
