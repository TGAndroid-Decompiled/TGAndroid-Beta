package x7;

import c8.ld;
public final class c extends d {
    public final transient int f59840c;
    public final transient int d;
    public final d f59841e;

    public c(d dVar, int i7, int i10) {
        this.f59841e = dVar;
        this.f59840c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ld.a(i7, this.d);
        return this.f59841e.get(i7 + this.f59840c);
    }

    @Override
    public final int i() {
        return this.f59841e.j() + this.f59840c + this.d;
    }

    @Override
    public final int j() {
        return this.f59841e.j() + this.f59840c;
    }

    @Override
    public final Object[] k() {
        return this.f59841e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        ld.b(i7, i10, this.d);
        int i11 = this.f59840c;
        return this.f59841e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
