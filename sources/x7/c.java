package x7;

import c8.pd;
public final class c extends d {
    public final transient int f60421c;
    public final transient int d;
    public final d f60422e;

    public c(d dVar, int i7, int i10) {
        this.f60422e = dVar;
        this.f60421c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        pd.a(i7, this.d);
        return this.f60422e.get(i7 + this.f60421c);
    }

    @Override
    public final int i() {
        return this.f60422e.j() + this.f60421c + this.d;
    }

    @Override
    public final int j() {
        return this.f60422e.j() + this.f60421c;
    }

    @Override
    public final Object[] k() {
        return this.f60422e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        pd.b(i7, i10, this.d);
        int i11 = this.f60421c;
        return this.f60422e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
