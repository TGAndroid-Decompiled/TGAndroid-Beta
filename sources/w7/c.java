package w7;

import c8.jd;
public final class c extends d {
    public final transient int f59731c;
    public final transient int d;
    public final d f59732e;

    public c(d dVar, int i7, int i10) {
        this.f59732e = dVar;
        this.f59731c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        jd.a(i7, this.d);
        return this.f59732e.get(i7 + this.f59731c);
    }

    @Override
    public final int i() {
        return this.f59732e.j() + this.f59731c + this.d;
    }

    @Override
    public final int j() {
        return this.f59732e.j() + this.f59731c;
    }

    @Override
    public final Object[] k() {
        return this.f59732e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        jd.c(i7, i10, this.d);
        int i11 = this.f59731c;
        return this.f59732e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
