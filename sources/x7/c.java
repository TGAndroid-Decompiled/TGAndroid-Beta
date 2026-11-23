package x7;

import c8.od;
public final class c extends d {
    public final transient int f60456c;
    public final transient int d;
    public final d f60457e;

    public c(d dVar, int i7, int i10) {
        this.f60457e = dVar;
        this.f60456c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        od.a(i7, this.d);
        return this.f60457e.get(i7 + this.f60456c);
    }

    @Override
    public final int i() {
        return this.f60457e.j() + this.f60456c + this.d;
    }

    @Override
    public final int j() {
        return this.f60457e.j() + this.f60456c;
    }

    @Override
    public final Object[] k() {
        return this.f60457e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        od.b(i7, i10, this.d);
        int i11 = this.f60456c;
        return this.f60457e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
