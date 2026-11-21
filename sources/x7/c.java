package x7;

import c8.od;
public final class c extends d {
    public final transient int f60452c;
    public final transient int d;
    public final d f60453e;

    public c(d dVar, int i7, int i10) {
        this.f60453e = dVar;
        this.f60452c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        od.a(i7, this.d);
        return this.f60453e.get(i7 + this.f60452c);
    }

    @Override
    public final int i() {
        return this.f60453e.j() + this.f60452c + this.d;
    }

    @Override
    public final int j() {
        return this.f60453e.j() + this.f60452c;
    }

    @Override
    public final Object[] k() {
        return this.f60453e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        od.b(i7, i10, this.d);
        int i11 = this.f60452c;
        return this.f60453e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
