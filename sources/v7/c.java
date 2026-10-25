package v7;

import w7.v;
public final class c extends d {
    public final transient int f50084c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f50084c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        v.a(i10, this.d);
        return this.e.get(i10 + this.f50084c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f50084c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f50084c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final d subList(int i10, int i11) {
        v.b(i10, i11, this.d);
        int i12 = this.f50084c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
