package x7;

import c8.ld;
public final class c extends d {
    public final transient int f58650c;
    public final transient int d;
    public final d f58651e;

    public c(d dVar, int i7, int i10) {
        this.f58651e = dVar;
        this.f58650c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ld.a(i7, this.d);
        return this.f58651e.get(i7 + this.f58650c);
    }

    @Override
    public final int i() {
        return this.f58651e.j() + this.f58650c + this.d;
    }

    @Override
    public final int j() {
        return this.f58651e.j() + this.f58650c;
    }

    @Override
    public final Object[] k() {
        return this.f58651e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        ld.b(i7, i10, this.d);
        int i11 = this.f58650c;
        return this.f58651e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
