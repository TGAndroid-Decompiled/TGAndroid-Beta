package t7;

import w7.q7;
public final class c extends d {
    public final transient int f45516c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f45516c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        q7.a(i10, this.d);
        return this.e.get(i10 + this.f45516c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f45516c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f45516c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final d subList(int i10, int i11) {
        q7.c(i10, i11, this.d);
        int i12 = this.f45516c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
