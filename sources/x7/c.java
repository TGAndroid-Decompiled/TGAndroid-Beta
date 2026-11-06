package x7;

import c8.kd;
public final class c extends d {
    public final transient int f58530c;
    public final transient int d;
    public final d f58531e;

    public c(d dVar, int i7, int i10) {
        this.f58531e = dVar;
        this.f58530c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        kd.a(i7, this.d);
        return this.f58531e.get(i7 + this.f58530c);
    }

    @Override
    public final int i() {
        return this.f58531e.j() + this.f58530c + this.d;
    }

    @Override
    public final int j() {
        return this.f58531e.j() + this.f58530c;
    }

    @Override
    public final Object[] k() {
        return this.f58531e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        kd.b(i7, i10, this.d);
        int i11 = this.f58530c;
        return this.f58531e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
